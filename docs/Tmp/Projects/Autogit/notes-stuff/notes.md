# Notes

## Sync Issues

### 1. Edit/Edit Conflict

- User A and User B both modify the same lines in a file.

---

- User A:

```shell
git clone https://github.com/username/testrepo.git
cd testrepo
echo "User A's changes" > file.txt
git add file.txt
git commit -m "User A's changes"
git push origin master
```

- On User B's machine:

```shell
git clone https://github.com/username/testrepo.git
cd testrepo
echo "User B's changes" > file.txt
git add file.txt
git commit -m "User B's changes"
git pull origin master  # This will cause a conflict
```

- Error:

```shell
hint: You have divergent branches and need to specify how to reconcile them.
hint: You can do so by running one of the following commands sometime before
hint: your next pull:
hint: 
hint:   git config pull.rebase false  # merge
hint:   git config pull.rebase true   # rebase
hint:   git config pull.ff only       # fast-forward only
hint: 
hint: You can replace "git config" with "git config --global" to set a default
hint: preference for all repositories. You can also pass --rebase, --no-rebase,
hint: or --ff-only on the command line to override the configured default per
hint: invocation.
fatal: Need to specify how to reconcile divergent branches.
```

- **Resolution:**
  - Manually edit the file.txt to resolve the differences, then:

```shell
git config  pull.rebase false
# After that resolve manually:
❯ git pull
Auto-merging file.txt
CONFLICT (content): Merge conflict in file.txt
Automatic merge failed; fix conflicts and then commit the result.
```

### 2. Delete/Edit Conflict

- User A deletes a file while User B makes changes to the same file.

---

- On User A's machine:

```shell
git clone https://github.com/username/testrepo.git
cd testrepo
rm file.txt
git add file.txt
git commit -m "User A deleted file"
git push origin master
```

- On User B's machine:

```shell
git clone https://github.com/username/testrepo.git
cd testrepo
echo "User B's changes" > file.txt
git add file.txt
git commit -m "User B's changes"
git pull origin master  # This will cause a conflict
```

- Error:

```shell
From github.com:andynameistaken/testrepo
   0c464ef..ed8b6e8  main       -> origin/main
hint: You have divergent branches and need to specify how to reconcile them.
hint: You can do so by running one of the following commands sometime before
hint: your next pull:
hint: 
hint:   git config pull.rebase false  # merge
hint:   git config pull.rebase true   # rebase
hint:   git config pull.ff only       # fast-forward only
hint: 
hint: You can replace "git config" with "git config --global" to set a default
hint: preference for all repositories. You can also pass --rebase, --no-rebase,
hint: or --ff-only on the command line to override the configured default per
hint: invocation.
fatal: Need to specify how to reconcile divergent branches.
```

- **Resolution**

a) If you want to keep the file

```shell
# From User B (one who edited file):
git config pull.rebase false
❯ git pull origin main
From github.com:andynameistaken/testrepo
 * branch            main       -> FETCH_HEAD
CONFLICT (modify/delete): file.txt deleted in ed8b6e866fc5a33e6a7c3884b1599f8db9c7e461 and modified in HEAD.  Version HEAD of file.txt left in tree.
Automatic merge failed; fix conflicts and then commit the result.
❯ git add file.txt
❯ git commit -m "Resolved conflict: keeping file.txt"

❯ git push origin main
```

b) If you want to delete file

```shell
# From User B:
git config pull.rebase false
echo "User B changes" > file.txt
git add file.txt
git commit -m "User B's changes"
git pull origin main
CONFLICT (modify/delete): file.txt deleted in 2325454ad9807c08c6cdc887b55ed064ef522258 and modified in HEAD.  Version HEAD of file.txt left in tree.
Automatic merge failed; fix conflicts and then commit the result.
git rm file.txt
git commit -m "Resolved conflict: removing file.txt"
git push origin main
```

### 3. Rename/Edit Conflict

- User A renames a file and possibly modifies it, while User B edits the file under its original name 
- Device A:

```shell
git clone https://github.com/username/testrepo.git
cd testrepo
mv file.txt renamed_file.txt
echo "User A's changes to renamed file" > renamed_file.txt
git add file.txt renamed_file.txt
git commit -m "User A renamed and edited file"
git push origin main
```

- Device B:

```shell
git clone https://github.com/username/testrepo.git
cd testrepo
echo "User B's changes" > file.txt
git add file.txt
git commit -m "User B's changes"
git pull origin main  # This will cause a conflict
```

- Error:

```shell
CONFLICT (rename/edit): file.txt renamed to renamed_file.txt in [commit hash] and modified in HEAD. Version HEAD of file.txt left in tree.
Automatic merge failed; fix conflicts and then commit the result.
```

- **Resolution:**

```shell
git add .
git commit -m "Resolved rename/edit conflict"
git push origin main
```

### 4. Add/Add  Conflict

- User A and User B both add a file with the same name but different content.

- Device A:

```shell
git clone https://github.com/username/testrepo.git
cd testrepo
echo "User A's new file" > same_name.txt
git add same_name.txt
git commit -m "User A added same_name.txt"
git push origin main
```

- Device B:
  
  ```shell
  git clone https://github.com/username/testrepo.git
  cd testrepo
  echo "User B's different content in new file" > same_name.txt
  git add same_name.txt
  git commit -m "User B added same_name.txt"
  git pull origin main  # This will cause a conflict
  ```
- Error:

```shell
CONFLICT (add/add): Merge conflict in same_name.txt
Automatic merge failed; fix conflicts and then commit the result.
```

- **Resolution:**
- Manually edit same_name.txt to resolve the differences, then:

```shell
git add same_name.txt
git commit -m "Resolved add/add conflict in same_name.txt"
git push origin main
```

### 5. Rename/Rename Conflict

- User A and User B both rename the same file, but to different new names.
- Device A:

```shell
git clone https://github.com/username/testrepo.git
cd testrepo
mv file.txt fileA.txt
git add file.txt fileA.txt
git commit -m "User A renamed file to fileA.txt"
git push origin main
```

- Device B:

```shell
git clone https://github.com/username/testrepo.git
cd testrepo
mv file.txt fileB.txt
git add file.txt fileB.txt
git commit -m "User B renamed file to fileB.txt"
git pull origin main  # This will cause a conflict
```

- Error:

```shell
CONFLICT (rename/rename): Rename file.txt->fileA.txt in [commit hash]. Rename file.txt->fileB.txt in HEAD
Automatic merge failed; fix conflicts and then commit the result.
```

- **Resolution:**
- Manually resolve the differences between fileA.txt and fileB.txt, then:

```shell
git add .
git commit -m "Resolved rename/rename conflict"
git push origin main
```

### 6. Directory/File Move - Edit Conflict

- User A creates a new directory and moves a file into it, while User B edits the file in its original location

- On User A's machine:

```shell
git clone https://github.com/username/testrepo.git
cd testrepo
mkdir new_directory
mv file.txt new_directory/file.txt
git add .
git commit -m "User A moved file.txt to new directory"
git push origin main
```

On User B's machine:

git clone https://github.com/username/testrepo.git
cd testrepo
echo "User B's changes" > file.txt
git add file.txt
git commit -m "User B's changes"
git pull origin main  # This will cause a conflict

Error:

CONFLICT (rename/delete): file.txt deleted in [commit hash] and renamed to new_directory/file.txt in HEAD. Version HEAD of new_directory/file.txt left in tree.
Automatic merge failed; fix conflicts and then commit the result.

Resolution:

If User B decides to keep the file in the new directory:

mv file.txt new_directory/file.txt
git add .
git commit -m "Resolved conflict by moving file.txt to new directory"
git push origin main

If User B decides to keep the file in the original location:

git rm new_directory/file.txt
git add file.txt
git commit -m "Resolved conflict by keeping file.txt in original location"
git push origin main

### Symlinks

Handling Git can track symlinks, but it doesn't track the content of the linked file or directory. Instead, Git stores the path information to which the symlink points. Here's where potential problems can arise:
If you're syncing across multiple machines, and the symlink points to an absolute path that doesn't exist on all machines, the symlink will be broken on the machines where the path doesn't exist.
If the symlink points to a relative path, and the relative structure changes or the target is missing on one machine, the symlink could also be broken.
Resolving symlink conflicts can require manual intervention, especially if the symlinks are pointing to different targets on different machines.