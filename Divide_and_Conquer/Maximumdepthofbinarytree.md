# Maximum Depth of the Binary Tree

**Difficulty**: Easy

**LeetCode Link**: [104. Maximum Depth of the Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/description/?envType=study-plan-v2&envId=leetcode-75)

---

## Problem Statement

Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

---

## Approach

### 1. **Problem Analysis**
- **Key Observations**:
  - We need to find the maximun depth of the `leftroot` and `rightroot` nodes in a recursive mode.
  - retrun the maximun of the leftroot and rightroot.
- **Input/Output Format**:
  - **Input**: All the values in the tree.
  - **Output**: length of the maximum depth.
- **Constraints**:
  - `The number of nodes in the tree is in the range [0, 104]`
  - `-100 <= Node.val <= 100`
 
---

### 2. **Solution**
- Divide: At each node, the problem is divided into smaller subproblems by recursively finding the maximum depth of the left and right subtrees.

- Conquer: The solutions to these subproblems (the depths of the left and right subtrees) are computed independently.

- Combine: Finally, the solutions are combined by taking the maximum of the two depths and adding 1 (to account for the current node).

---

## Complexity Analysis
- **Time Complexity**: `O(n)` because we iterate through the array once.
- **Space Complexity**: `O(h)` `h` is the height of the tree. This is the space used by the recursion stack. In the worst case (skewed tree), it can be `O(n)`.

---

## Code Implementation

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int rightroot= maxDepth(root.right);
        int leftroot=maxDepth(root.left);
        
        return Math.max(leftroot,rightroot)+1;
    }
}
