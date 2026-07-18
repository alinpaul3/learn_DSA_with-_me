class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int answer=0;
        for(int num : nums){
            if(set.contains(num))
            answer=num;
            set.add(num);
}
return answer;
    }
}