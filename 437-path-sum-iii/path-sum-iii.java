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
    public int pathSum(TreeNode root, int targetSum) {
        // Initialize a map to store prefix sums
        Map<Long, Integer> prefixSum = new HashMap<>();
        // Base case: A prefix sum of 0 occurs once
        prefixSum.put(0L, 1);
        
        return dfs(root, 0L, targetSum, prefixSum);
    }

    private int dfs(TreeNode node, long cumulativeSum, int targetSum, Map<Long, Integer> prefixSum) {
        if (node == null) {
            return 0;
        }

        // Update the cumulative sum
        cumulativeSum += node.val;

        // Check if there is a subpath ending at this node that sums to targetSum
        int count = prefixSum.getOrDefault(cumulativeSum - targetSum, 0);

        // Update the prefix sum map with the current cumulative sum
        prefixSum.put(cumulativeSum, prefixSum.getOrDefault(cumulativeSum, 0) + 1);

        // Recurse into left and right subtrees
        count += dfs(node.left, cumulativeSum, targetSum, prefixSum);
        count += dfs(node.right, cumulativeSum, targetSum, prefixSum);

        // Backtrack: Remove the current cumulative sum from the map
        prefixSum.put(cumulativeSum, prefixSum.get(cumulativeSum) - 1);

        return count;
    }
}