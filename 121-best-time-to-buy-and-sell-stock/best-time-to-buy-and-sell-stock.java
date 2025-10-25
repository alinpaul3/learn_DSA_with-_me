class Solution {
    public int maxProfit(int[] prices) {
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int price:prices){
            if(price<minprice)minprice=price;
            else if(price-minprice>maxprofit)maxprofit=price-minprice;
        }
       return maxprofit;
    }
}
/*Greedy choice: At each step, we decide whether to:
Update the minimum price seen so far (if a lower price is found)*/