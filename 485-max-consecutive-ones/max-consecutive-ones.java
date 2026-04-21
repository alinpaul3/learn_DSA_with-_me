class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) sum+=1;
            else if(nums[i]==0){
                if(sum>max)max=sum;
                sum=0;
                continue;
            }
            if(i==nums.length-1 && sum>max)max=sum;
        }
        return max;
    }
}