# For list type hint
from typing import List
# Library for command-line argument parsing
import argparse
# For concurrent file reading
from concurrent.futures import ThreadPoolExecutor
# For TF-IDF calculation
from sklearn.feature_extraction.text import TfidfVectorizer
# For cosine similarity calculation
from sklearn.metrics.pairwise import cosine_similarity
# For matrix type hint
from scipy.sparse import csr_matrix



# Function to read the content of a file given its path
def read_single_file(file_path: str) -> str:
    """
    Read the content of a file given its file path.
    If the file does not exist or an error occurs, raise an error.
    """
    try:
        with open(file_path, 'r') as f:
            return f.read()
    except FileNotFoundError:
        raise FileNotFoundError(f"File {file_path} does not exist.")
    except IOError as error:
        raise IOError(f"An error occurred while reading {file_path}: {error}")


# Function to read multiple files concurrently and return their content

# "with" provides automatic initialization and cleanup after threads are joined back

# TODO: check https://github.com/colesbury/nogil-3.12
def read_multiple_files(file_paths: List[str]) -> List[str]:
    """
    Read multiple files concurrently and return their content.
    """
    with ThreadPoolExecutor() as executor:
        return list(executor.map(read_single_file, file_paths))


# Function to validate that all file paths are unique
def validate_file_paths(file_paths: List[str]) -> None:
    """
    Validate that all file paths are unique. Raise ValueError if they are not.
    """
    if len(set(file_paths)) != len(file_paths):
        raise ValueError("All files must be unique.")


# Function to validate that at least two documens are present for comparison
def validate_documents(documents: List[str]) -> None:
    """
    Validate that at least two valid documents are present for comparison.
    """
    if len(documents) < 2:
        raise ValueError("At least two valid files must be provided.")


# Function to calculate the TF-IDF matrix for a list of documents
def calculate_tfidf(documents: List[str]) -> csr_matrix:
    """
    Calculate the TF-IDF matrix for a list of documents.
    """
    tfidf_vectorizer = TfidfVectorizer()
    # fir_transform is a combination of fit and transform
    # fit does:
    #   tokenization by default:
    # 1. Lowercasing
    # 2.Tokenization with token pattern
    #   - default regex: '(?u)\\b\\w\\w+\\b'
    #   - It captures sequences of two or more alphanumeric characters or underscores that form a whole word.
    #       - (?u) match any unicode character
    #       - \\b word boundary. This ensures that the token is a stand-alone word and not part of another word.
    #       - \\w: This matches any alphanumeric character or underscore. Equivalent to [a-zA-Z0-9_]
    #       - \\w+: + quantifier specifies that the preceding element (in this case, \\w) must appear one or more times.
    #           So, \\w+ will match sequences of alphanumeric characters or underscores.
    # 3. Removing Stop Words
    # 4, Producing IDF for vocabulary
    #
    # transform does:
    #  producing the TF-IDF matrix.
    return tfidf_vectorizer.fit_transform(documents)


# Function to calculate and print the cosine similarity for a given TF-IDF matrix and list of file paths
def calculate_and_print_similarity(tfidf_matrix: csr_matrix, file_paths: List[str]) -> List[float]:
    """
    Calculate and print the cosine similarity between TF-IDF vectors.
    """
    cosine_sim = cosine_similarity(tfidf_matrix, tfidf_matrix)  # Calculate the cosine similarity matrix
    similarities = []  # List to store individual similarity scores

    for i in range(len(file_paths)):
        for j in range(i + 1, len(file_paths)):
            sim_value = cosine_sim[i, j]
            print(f"Cosine Similarity between {file_paths[i]} and {file_paths[j]}: {sim_value}")
            similarities.append(sim_value)
    return similarities


# Main function to orchestrate the calculation of cosine similarity
def calculate_cosine_similarity(file_paths: List[str]) -> List[float]:
    """
    Main function to orchestrate the cosine similarity calculations.
    """
    validate_file_paths(file_paths)
    documents = read_multiple_files(file_paths)
    validate_documents(documents)

    tfidf_matrix = calculate_tfidf(documents)  # Calculate the TF-IDF matrix
    return calculate_and_print_similarity(tfidf_matrix, file_paths)  # Calculate and print the cosine similarities


if __name__ == "__main__":
    """
    Command line interface for the script.
    """
    parser = argparse.ArgumentParser(
        description="Calculate cosine similarity between files.")  # Initialize the argument parser
    parser.add_argument("files", nargs='+', help="Paths of the files to compare.")  # Add the "files" argument
    args = parser.parse_args()  # Parse the command-line arguments

    try:
        calculate_cosine_similarity(args.files)  #
    except ValueError as e:
        print(e)
