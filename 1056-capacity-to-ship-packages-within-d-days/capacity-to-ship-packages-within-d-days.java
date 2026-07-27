class Solution {

    public int shipWithinDays(int[] weights, int days) {
        int left = getMax(weights);
        int right = getSum(weights);
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canShip(weights, days, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean canShip(int[] weights, int days, int capacity) {
        int requiredDays = 1;
        int currentWeight = 0;
        for (int weight : weights) {
            if (currentWeight + weight > capacity) {
                requiredDays++;
                currentWeight = weight;
            } else {
                currentWeight += weight;
            }
        }
        return requiredDays <= days;
    }

    private int getMax(int[] weights) {
        int max = 0;
        for (int weight : weights)
            max = Math.max(max, weight);
        return max;
    }
    private int getSum(int[] weights) {
        int sum = 0;
        for (int weight : weights)
            sum += weight;

        return sum;
    }
}