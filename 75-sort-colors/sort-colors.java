class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int index = 0;
        for (int i = 0; i <= 2; i++) {
            int count = map.getOrDefault(i, 0);
            while (count > 0) {
                nums[index] = i;
                index++;
                count--;
            }
        }
    }
}