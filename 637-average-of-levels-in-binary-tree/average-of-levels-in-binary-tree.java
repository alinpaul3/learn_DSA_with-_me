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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result=new ArrayList<>();
        if(root==null)return result;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            double size=queue.size();
            double sum=0;
            for(int i=0;i<size;i++){
                TreeNode current=queue.poll();
                sum+=current.val;
                if(current.left!=null)queue.offer(current.left);
                if(current.right!=null)queue.offer(current.right);
            }
            result.add(sum/size);
        }
        return result;
    }
}