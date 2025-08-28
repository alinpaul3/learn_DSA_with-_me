class Solution {
    public int[] twoSum(int[] nums, int target) {
    HashMap<Integer,Integer> tosum=new HashMap<>();
    for(int i=0;i<nums.length;i++){
        int diff=target-nums[i];
        if(tosum.containsKey(diff)&& tosum.get(diff)!=i)
        return new int[]{tosum.get(diff),i};
        tosum.put(nums[i],i);
        }
        return new int[]{};

    }
    }
