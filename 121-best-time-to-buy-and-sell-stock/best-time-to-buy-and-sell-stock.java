class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int currentstock=prices[0];
        for(int i=1;i<prices.length;i++){
            int nextstock=prices[i];
            if(nextstock<=currentstock)currentstock=nextstock;
            else 
            profit=Math.max(profit,nextstock-currentstock);
        }
        return profit;
    }
}