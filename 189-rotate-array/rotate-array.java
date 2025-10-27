class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        if(k==0)return;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
}
private void reverse(int[] num,int start,int end){
    while(start<end){
        int temp=num[start];
        num[start]=num[end];
        num[end]=temp;
        start++;
        end--;
    }
}
}