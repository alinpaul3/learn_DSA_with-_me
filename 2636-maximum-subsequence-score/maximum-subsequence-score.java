class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
         int[][] pairs = new int[n][2];

        // Step 1: Pair nums1 and nums2
        for (int i = 0; i < n; i++) {
            pairs[i] = new int[]{nums1[i], nums2[i]};
        }

        // Step 2: Sort pairs by nums2[i] in descending order
        Arrays.sort(pairs, (a, b) -> Integer.compare(b[1], a[1]));

        // Step 3: Use a Min-Heap to track largest k elements from nums1
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        long maxScore = 0, sum = 0;

        // Step 4: Iterate and maintain a heap of size k
        for (int i = 0; i < n; i++) {
            minHeap.add(pairs[i][0]);
            sum += pairs[i][0];

            // Maintain exactly k elements in the heap
            if (minHeap.size() > k) {
                sum -= minHeap.poll();  // Remove the smallest element
            }

            // Step 5: Calculate score when heap has exactly k elements
            if (minHeap.size() == k) {
                maxScore = Math.max(maxScore, sum * pairs[i][1]);
            }
        }

        return maxScore;
    }
    
}