#!/usr/bin/env python3

import subprocess
import json
from pyfzf.pyfzf import FzfPrompt
from concurrent.futures import ThreadPoolExecutor


def get_repositories():
    repos_command = "gh repo list --json nameWithOwner,updatedAt --limit 200"
    repos_output = subprocess.check_output(repos_command, shell=True, text=True)
    return json.loads(repos_output)


def clone_repo(repo_name, repos):
    selected_repo = next(repo for repo in repos if repo['nameWithOwner'] == repo_name)
    print(f"Cloning {selected_repo['nameWithOwner']}...")
    clone_command = f"gh repo clone {selected_repo['nameWithOwner']}"
    subprocess.run(clone_command, shell=True)
    print(f"Cloned {selected_repo['nameWithOwner']}!")


def select_and_clone_repositories(repos):
    repo_names = [repo['nameWithOwner'] for repo in sorted(repos, key=lambda x: x['updatedAt'], reverse=True)]
    fzf = FzfPrompt()
    title = "Select one or more repositories to clone (use CTRL + SPACE to select multiple):"
    selected_titles = fzf.prompt(repo_names, "--prompt='{}' --multi --bind='ctrl-space:toggle' ".format(title))

    if selected_titles:
        with ThreadPoolExecutor() as executor:
            executor.map(lambda repo_name: clone_repo(repo_name, repos), selected_titles)
        print("Done cloning all selected repositories!")
    else:
        print("No repository selected.")

def main():
    repos = get_repositories()
    print(repos)
    select_and_clone_repositories(repos)


if __name__ == '__main__':
    main()
