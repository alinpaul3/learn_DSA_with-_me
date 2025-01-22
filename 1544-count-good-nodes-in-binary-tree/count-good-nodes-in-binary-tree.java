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
    public int goodNodes(TreeNode root) {
        return dfs(root,root.val);
    }
    int dfs(TreeNode root, int maxSoFar){
        if(root==null){
            return 0;
        }
        int count= root.val>=maxSoFar?1:0;
        maxSoFar=Math.max(maxSoFar, root.val);
        count+=dfs(root.left,maxSoFar);
        count+=dfs(root.right,maxSoFar);
        return count;
    }

}