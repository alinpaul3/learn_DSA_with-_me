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
         List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);  

        while (!queue.isEmpty()) {
            int levelSize = queue.size();  
            TreeNode lastNode = null;  

            for (int i = 0; i < levelSize; i++) {
                lastNode = queue.poll();  

                if (lastNode.left != null) queue.offer(lastNode.left);
                if (lastNode.right != null) queue.offer(lastNode.right);
            }

            result.add(lastNode.val);  
        }

        return result;
    }
    }
