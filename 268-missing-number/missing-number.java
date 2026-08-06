class Solution {
    public int missingNumber(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
       int count=0;
       for(int j:nums)
       map.put(j,1);
    
    for(int i=0;i<=nums.length;i++){
        if(!map.containsKey(i))return i;
    }
return 0;
}
}