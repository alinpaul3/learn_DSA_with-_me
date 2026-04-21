class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> threemax=new TreeSet<>();
        for(int i: nums){
            threemax.add(i);
        }
        List<Integer> threeMax = new ArrayList<>(threemax);
        
        if(threeMax.size()>=3)return threeMax.get(threeMax.size() - 3);
        else return threeMax.get(threeMax.size()-1);
    }
}