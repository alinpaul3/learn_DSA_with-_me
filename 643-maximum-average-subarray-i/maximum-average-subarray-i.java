class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int maxAverage = Integer.MIN_VALUE;
        int left = 0;
        int sum = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            if (right - left + 1 == k) {
                maxAverage = Math.max(maxAverage, sum);
                sum -= nums[left];
                left++;
            }
        }
        return (double) maxAverage / k;
    }
}