class Solution {
    public int minReorder(int n, int[][] connections) {
        // Step 1: Construct an undirected graph
        Map<Integer, List<int[]>> graph = new HashMap<>();
        
        for (int[] conn : connections) {
            int from = conn[0], to = conn[1];//see detail below

            
            // Add both directions to the graph
            //computeIfAbsent is called the lazy initialization
            graph.computeIfAbsent(from, k -> new ArrayList<>()).add(new int[]{to, 1}); // Original edge (needs reversing)
            graph.computeIfAbsent(to, k -> new ArrayList<>()).add(new int[]{from, 0}); // Reverse edge (no need to reverse)
        }

        // Step 2: Perform DFS to count reversals
        return dfs(0, -1, graph);
    }

    private int dfs(int node, int parent, Map<Integer, List<int[]>> graph) {
        int reversals = 0;
        
        for (int[] neighbor : graph.getOrDefault(node, new ArrayList<>())) {
            int next = neighbor[0];
            int needsReversing = neighbor[1];

            if (next == parent) continue; // Avoid traversing back to the parent

            reversals += needsReversing; // If edge needs reversing, add to count
            reversals += dfs(next, node, graph); // Recursive DFS call
        }
        
        return reversals;
    }
}
// dfs(0)
//  ├── dfs(1)
//  │   ├── dfs(3)
//  │   │   ├── dfs(2) → return
//  │   │   └── return
//  │   └── return
//  ├── dfs(4)
//  │   ├── dfs(5) → return
//  │   └── return
//  └── return

// conn[0] and conn[1]
// connections = [
//     [0, 1], 
//     [1, 3], 
//     [2, 3], 
//     [4, 0], 
//     [4, 5] ];
// conn[0]===> 0,1,2,4,4
// conn[1]===> 1,3,3,0,5