class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int maximum = 0;
        for (int num : set) {
            // Only start from the beginning of a sequence
            if (!set.contains(num - 1)) {
                int current = num;
                int count = 1;
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }
                maximum = Math.max(maximum, count);
            }
        }
        return maximum;
    }
}
