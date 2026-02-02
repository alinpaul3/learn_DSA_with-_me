class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int goodpairs=0;
        for(int count:map.values()){
            if(count>1){
                goodpairs+=(count*(count-1))/2;
            }
        }
        return goodpairs;

    }
}