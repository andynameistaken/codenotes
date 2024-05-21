# Cosine Similarity

## Equation

Cosine similarity is a measure used to determine how similar two sets of data
are. At its core it calculates the cosine of the angle between two vectors.

It is derived from Euclidean dot product formula:

$$ \mathbf{A}\cdot\mathbf{B}
=\left\|\mathbf{A}\right\|\left\|\mathbf{B}\right\|\cos\theta $$

$$ \cos\theta = S_C(A, B) = \frac{A \cdot B}{\| A \| \| B \|} =
\frac{\sum_{i=1}^{n} A_i B_i}{\sqrt{\sum_{i=1}^{n} A_i^2} \sqrt{\sum_{i=1}^{n}
B_i^2}} $$

Explanation of the equation:


- $S_C(A, B)$: cosine similarity between vector A and B
- $A \cdot B$: dot product between vector A and B
- $\| A \| \| B \|$: mutliplication of Euclidean Norms of vector A and B

??? Question "Dot Product Explanation" 
    The dot product is a mathematical operation
    that takes two vectors of the same length and returns a single scalar (a
    numerical value). 
    
For two vectors:
    $$
    \mathbf{A} = [A_1, A_2, \ldots, A_n]
    $$ 
	and 
    $$
	    \mathbf{B} = [B_1, B_2, \ldots, B_n]
    $$,

    
    the dot product 
    
    $\mathbf{A} \cdot \mathbf{B}$ 
    
    is calculated as:
    
    $$
    \mathbf{A} \cdot \mathbf{B} = A_1 \times B_1 + A_2 \times B_2 + \ldots + A_n \times B_n
    $$
    
    Or, using summation notation:
    
    $$
    \mathbf{A} \cdot \mathbf{B} = \sum_{i=1}^{n} A_i \times B_i
    $$

??? Question "Euclidean Norm Explanation"
    The Euclidean norm is a mathematical
    concept used to define the length of a vector. In other words, it quantifies
    the vector's overall size in the coordinate system in which it exists.

    $$
    \left\| \mathbf{A} \right\| = \sqrt{A_1^2 + A_2^2 + A_3^2} = \sqrt{\sum_{i=1}^{n} A_i^2} 
    $$

    ??? Example 

        $A = [2, 3, 4]$

        $\left\| \mathbf{A} \right\| = \sqrt{2^2 + 3^2 + 4^2} = 5.39$

!!! Info
    Current implementation of the algorithm uses vectors with
    **term frequency–inverse document frequency** ($TF-IDF$) weights.


### TF-IDF Implementation

#### TF (Term Frequency)

- $tf$ proportion of frequencies of some term to all frequencies of all terms in a file

$$
 {tf}(t,d) = \frac{f(t,d)}{{\sum_{t' \in d}{f(t',d)}}}
$$


- $f(t,d)$: represents the raw frequency of term $t$ in document $d$ 
- $\sum_{t' \in d}{f(t',d)}$: Sum of frequencies of all unique terms in document $d$.

??? Example "Calculating TF"
    Let $d$ be a document containing such words:

    ```
    apple orange apple banana apple banana orange
    ```
    Calculating ${tf}(apple,d)$:

    $$
     {tf}(apple,d) = \frac{f_{apple,d}}{{\sum_{t' \in d}{f_{t',d}}}} = \frac{3}{f_{\text{apple},d} + f_{\text{orange},d} + f_{\text{banana},d} = 3 + 2 + 2 = 7} = \frac{3}{7}
    $$

#### IDF (Inverse Document Frequency)

##### Smoothed IDF (with added $+ 1$'s)

$$
\text{idf}(t, D) = \log \left( \frac{1 + D}{1 + |\{d \in D : t \in d\}|} \right) + 1
$$


- $N$ : total number of documents
- $|\{d \in D : t \in d\}|$ : cardinality of set that consists of documents containing specific term

- All $+ 1$'s are customization of standard IDF used in `TfidfVectorizer` from `sklearn` library:
    - $+ 1$ numerator ensures $\log(...) \ne 0$ because it is undefined value.
    - $+ 1$ denominator prevents division by 0 when there are no documents or document is empty
    - $+ 1$ outside $\log(...)$ equation it is to prevent nullification of the outcome and smooth representation.
        It is beneficial when many terms might have low IDF values, and it can help in avoiding extreme values.
  