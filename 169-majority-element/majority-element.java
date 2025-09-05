class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<nums.length;i++){
        map.merge(nums[i], 1, Integer::sum);
}
    int maxKey = Collections.max(map.entrySet(), 
                  Map.Entry.comparingByValue()).getKey(); 
    return maxKey; 
    }
}