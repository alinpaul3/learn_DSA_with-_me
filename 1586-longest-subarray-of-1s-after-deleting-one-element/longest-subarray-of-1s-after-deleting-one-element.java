class Solution {
    public int longestSubarray(int[] nums) {
        int freq0=0;
        int left=0;
        int max=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0)freq0++;
            if(freq0>1){
                if(nums[left]==0)freq0--;
                left++;
            }
            max=Math.max(max,right-left);
        }
        return max;
    }
}