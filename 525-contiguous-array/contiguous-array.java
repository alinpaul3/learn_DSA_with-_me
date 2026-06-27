class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);

        int sum = 0;
        
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0)
                sum -= 1;
            else
                sum += 1;

            if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        return maxLen;
    }
}

// HashMap<Integer,Integer> map=new HashMap<>();
        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     if(map.containsKey(nums[i])){
        //     map.put(nums[i],map.get(nums[i])+1);
        //     if(map.get(0)==map.get(1)){
        //         if(map.get(0)>max) max=map.get(0);
        //     }
        //     }
        //     else
        //     map.put(nums[i],1);
        // }
        // int maxlen=max*2;