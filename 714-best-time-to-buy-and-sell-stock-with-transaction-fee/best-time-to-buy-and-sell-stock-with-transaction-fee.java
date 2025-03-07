class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        if (n == 0) return 0;
        
        int hold = -prices[0];  // Profit if we buy stock on the first day
        int cash = 0;           // Profit if we don't own stock
        
        for (int i = 1; i < n; i++) {
            // Update cash: We sell the stock at prices[i] and pay the fee
            cash = Math.max(cash, hold + prices[i] - fee);
            
            // Update hold: Either keep the stock or buy it at the new price
            hold = Math.max(hold, cash - prices[i]);
        }
        
        return cash; // Maximum profit in the end when we are not holding any stock
    }
}
// Time Complexity	O(n)
// Space Complexity	O(1)