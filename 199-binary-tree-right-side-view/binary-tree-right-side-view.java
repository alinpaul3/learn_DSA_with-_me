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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        deepRoot(root,0,result);
        return result;
    }
    public void deepRoot(TreeNode root, int depth,List<Integer> result){
        if(root==null)return;
        if(depth==result.size())result.add(root.val);
        deepRoot(root.right,depth+1,result);
        deepRoot(root.left,depth+1,result);
    }
}