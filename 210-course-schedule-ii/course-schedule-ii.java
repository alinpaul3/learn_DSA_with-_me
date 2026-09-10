class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
 List<List<Integer>> graph = new ArrayList<>();

        int[] inDegree = new int[numCourses];
        int[] result=new int[numCourses];
        // Create an empty list for each course
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        // Build graph and calculate indegree
        for (int[] pre : prerequisites) {
            graph.get(pre[1]).add(pre[0]);
            inDegree[pre[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();

        // Add courses with no prerequisites
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }

        int index = 0;

        while (!queue.isEmpty()) {

            int curr = queue.poll();
            result[index] = curr;
            index++;

            for (int next : graph.get(curr)) {

                inDegree[next]--;

                if (inDegree[next] == 0) {
                    queue.offer(next);
                }}}

                    // If not all courses were processed → cycle exists
        if (index != numCourses) {
            return new int[0];
        }
                return result;
    }
}