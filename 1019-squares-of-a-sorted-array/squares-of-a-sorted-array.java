class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int[] answer=new int[nums.length];
        int k=nums.length-1;
        while(left<=right){
            if(Math.abs(nums[left])<Math.abs(nums[right])){
                answer[k]=nums[right]*nums[right];
                k--;
                right--;
            }
            else if(Math.abs(nums[left])>=Math.abs(nums[right])) {
                answer[k]=nums[left]*nums[left];
                k--;
                left++;}
        }
        return answer;
    }
}