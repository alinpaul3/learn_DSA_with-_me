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
    public int maxLevelSum(TreeNode root) {
        List<Integer> result= new ArrayList<>();
        int maxIndex;
        if(root==null)return 0;
        else if(root.left==null & root.right==null)return root.val;
        else{
            Queue<TreeNode> queue= new LinkedList<>();
            queue.offer(root);
            while(!queue.isEmpty()){
               int levelsize= queue.size();
               TreeNode maxsum=null;
               int maxsumval=0;
               for(int i=1;i<=levelsize;i++){
                 maxsum=queue.poll();
                 maxsumval+=maxsum.val;
                 if (maxsum.left != null) queue.offer(maxsum.left);
                 if (maxsum.right != null) queue.offer(maxsum.right);
            }
            result.add(maxsumval);
            }
            maxIndex = result.indexOf(Collections.max(result));  
    }
    return maxIndex+1;
}
}