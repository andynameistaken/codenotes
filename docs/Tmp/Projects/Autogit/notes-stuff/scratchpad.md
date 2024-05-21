Write Python program called `AutoGit` that:

- Is designed to sync multiple macOS computers(program is modular and will 
    be possible to write Linux functionality later, so every solution specific for macOS will be modular ) via `GitPython` 
    library (docs: https://gitpython.readthedocs.io/en/stable/) (source: https://github.com/gitpython-developers/GitPython)
- it works as `launchd` daemon (Linux solution will be added later)
- it adds every file in directory to git repository on main branch
- 
- if there is sync conflict it notifies about it via macOS notification system (osascript)


let suppose every letter is a word and every number is a word too. I've got two files
- file_1.txt:
```
A B C
D E F
G H I
```
- file_2.txt
```
D E F
A B C
G H I
```

What diff will return if I will compare 1 to 2



