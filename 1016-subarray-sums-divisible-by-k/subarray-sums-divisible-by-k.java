class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count=0;
        int currentsum=0;
        for(int num:nums){
            currentsum+=num;
            int r=((currentsum%k)+k)%k;
            // if(map.containsKey(r)){
            //     count+=map.get(r);
            //     map.put(r,map.get(r)+1);
            //     }
            count+=map.getOrDefault(r,0);
            map.put(r,map.getOrDefault(r,0)+1);
        }
        return count;
    }
}