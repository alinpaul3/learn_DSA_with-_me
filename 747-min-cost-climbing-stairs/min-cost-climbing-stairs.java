class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int prev2 = 0;  // Represents dp[i-2]
        int prev1 = 0;  // Represents dp[i-1]
        
        for (int i = 2; i <= n; i++) {
            int curr = Math.min(prev1 + cost[i - 1], prev2 + cost[i - 2]);
            prev2 = prev1;
            prev1 = curr;
        }
        
        return prev1;
    }
}

// Time Complexity: O(n) — We iterate through the cost array once.
// Space Complexity: O(1) — We use only two variables (prev1 and prev2).
