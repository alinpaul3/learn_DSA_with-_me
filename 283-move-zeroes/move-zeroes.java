class Solution {
    public void moveZeroes(int[] nums) {
        int temp=0,j=0;
      for(int i=0;i<nums.length;i++)
      {
      if(nums[i]!=0)
      {
      nums[j]=nums[i];
      j++;
      temp=j;
      }
      }
    for(int i=temp;i<nums.length;i++)
    nums[i]=0;
    }
}