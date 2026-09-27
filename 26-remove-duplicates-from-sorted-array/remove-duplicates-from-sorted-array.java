class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]))continue;
            else {
                set.add(nums[i]);
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}