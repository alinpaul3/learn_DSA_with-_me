class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
         if (intervals.length == 0) return 0;

        // Sort by end time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int count = 0;  // number of removals
        int prevEnd = intervals[0][1]; // end time of last kept interval

        for (int i = 1; i < intervals.length; i++) {
            // If overlapping
            if (intervals[i][0] < prevEnd) {
                count++; // remove current interval
            } else {
                prevEnd = intervals[i][1]; // keep it
            }
        }
        return count;
    }
}