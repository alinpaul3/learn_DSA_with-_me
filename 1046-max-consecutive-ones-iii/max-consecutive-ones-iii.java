class Solution {
    public int longestOnes(int[] nums, int k) {
        int freq0=0;
        int left=0;
        int max=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0)freq0++;
            while(freq0>k){
                int i=left;
                while(nums[i]!=0){i++;}
                left=i+1;
                freq0--;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}