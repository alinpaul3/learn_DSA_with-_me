class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1,right=getmax(piles);
        while(left<right){
            int mid=left+(right-left)/2;
            if(gethours(piles,h,mid)){
                right=mid;
            }
            else{
                left=mid+1;
            }
            }return left;}
        private boolean gethours(int[] piles,int h, int k){
            int hours=0;
            for(int pile:piles){
                hours+=(pile+k-1)/k;//used to get the upperbound
            }
            return hours<=h;
        }
        private int getmax(int[] piles){//get the max bananas to complete 
            int max=0;
            for(int pile:piles){
                max=Math.max(max,pile);
            }
            return max;
        }
}

// Time Complexity	O(n log max(piles))
// Space Complexity	O(1)