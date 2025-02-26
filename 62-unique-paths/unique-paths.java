public class Solution {
    public int uniquePaths(int m, int n) {
        long result = 1;
        int totalSteps = m + n - 2;
        int r = Math.min(m - 1, n - 1); // Choose the smaller value to minimize computations

        for (int i = 1; i <= r; i++) {
            result = result * (totalSteps - i + 1) / i;
        }
        return (int) result;
    }
}
// Time Complexity: O(min(m,n))
// Space Complexity: O(1)