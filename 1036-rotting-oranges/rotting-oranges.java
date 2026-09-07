class Solution {

    public int orangesRotting(int[][] grid) {

        Queue<int[]> queue = new LinkedList<>();

        int fresh = 0;

        // Step 1: Find rotten and fresh oranges
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                }

                if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        int minutes = 0;

        int[][] directions = {
            {-1, 0},  // up
            {1, 0},   // down
            {0, -1},  // left
            {0, 1}    // right
        };

        // Step 2: BFS
        while (!queue.isEmpty() && fresh > 0) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {

                int[] current = queue.poll();

                int row = current[0];
                int col = current[1];

                for (int[] dir : directions) {

                    int newRow = row + dir[0];
                    int newCol = col + dir[1];

                    // Check boundaries
                    if (newRow < 0 || newRow >= grid.length ||
                        newCol < 0 || newCol >= grid[0].length ||
                        grid[newRow][newCol] != 1) {

                        continue;
                    }

                    // Rot the orange
                    grid[newRow][newCol] = 2;

                    // One less fresh orange
                    fresh--;

                    // Add newly rotten orange to queue
                    queue.offer(new int[]{newRow, newCol});
                }
            }

            minutes++;
        }

        return fresh == 0 ? minutes : -1;
    }
}