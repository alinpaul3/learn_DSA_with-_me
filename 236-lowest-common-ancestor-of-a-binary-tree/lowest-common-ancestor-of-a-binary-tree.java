/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       // Base Case: If root is null or matches p or q, return root
        if (root == null || root == p || root == q) return root;

        // Recur on left and right subtrees
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // If both left and right are non-null, current node is the LCA
        if (left != null && right != null) return root;

        // Else return the non-null subtree (left or right)
        return left != null ? left : right;
    }
}