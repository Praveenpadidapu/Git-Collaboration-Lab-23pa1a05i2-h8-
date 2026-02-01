Setup Assumptions
Assume a shared remote repo (e.g., GitHub) with a main branch. Both users have cloned it (git clone <URL>), added remote (git remote add origin <URL> if needed), and work on feature branches.
​

Pull Latest Changes
Always start here to avoid conflicts.

Run git checkout main (or your target branch).

git pull origin main (fetches and merges remote main).

If no issues, you're synced.

Make Changes and Push
Create/switch branch: git checkout -b feature-branch.

Edit files, stage: git add . (or specific files).

Commit: git commit -m "Descriptive message".

Push branch: git push origin feature-branch.
​

Merge Branches
Switch to target: git checkout main.

Merge feature: git merge feature-branch (fast-forward if linear) or create PR on GitHub for review, then git pull origin main locally.

If clean, push: git push origin main.
​

Resolve Conflicts
Conflicts show markers like <<<<<<< HEAD, =======, >>>>>>> branch-name in files.

git status lists conflicted files.

Open file, edit to keep desired code, remove markers.

Stage: git add <file>.

Commit merge: git commit -m "Resolve conflicts".

Push: git push origin main.
