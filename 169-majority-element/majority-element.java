class Solution {
    public int majorityElement(int[] nums) {
       return majorEle(nums,0,nums[0]);
    }
    static int majorEle(int[] nums,int start,int value){
        int count=0;
        for(int i=start;i<nums.length;i++){
            if(nums[i]==value)count++;
            else count--;
            if(count<0)return majorEle(nums,i,nums[i]);
        }
        return value;
    }
}