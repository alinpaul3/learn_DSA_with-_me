class Solution {
   public int findKthLargest(int[] nums, int k) {
    PriorityQueue<Integer> pq = new PriorityQueue<>(); // Min-Heap

    for (int num : nums) {
        pq.offer(num); // Add number to heap
        if (pq.size() > k) {
            pq.poll(); // Remove smallest element
        }
    }

    return pq.peek(); // Top element is the Kth largest
}
}