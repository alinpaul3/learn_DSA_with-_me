class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int left=0;
        int right=1;
        for(int i=0;i<nums.length;i++){
            if(nums[left]==nums[right])break;
            else{left++; right++;}
        }
        return nums[left];
    }
}