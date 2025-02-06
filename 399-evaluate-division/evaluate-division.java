class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        // Step 1: Build the graph using HashMap
        Map<String, Map<String, Double>> graph = new HashMap<>();

        for (int i = 0; i < equations.size(); i++) {
            String a = equations.get(i).get(0);
            String b = equations.get(i).get(1);
            double value = values[i];

            graph.putIfAbsent(a, new HashMap<>());
            graph.putIfAbsent(b, new HashMap<>());

            graph.get(a).put(b, value);        // a -> b with value
            graph.get(b).put(a, 1.0 / value);  // b -> a with reciprocal value
        }

        // Step 2: Process queries using DFS
        double[] results = new double[queries.size()];
        
        for (int i = 0; i < queries.size(); i++) {
            String a = queries.get(i).get(0);
            String b = queries.get(i).get(1);
            results[i] = dfs(a, b, new HashSet<>(), graph);
        }
        
        return results;
    }

    private double dfs(String start, String end, Set<String> visited, Map<String, Map<String, Double>> graph) {
        if (!graph.containsKey(start) || !graph.containsKey(end)) return -1.0;  // If variables don't exist
        if (start.equals(end)) return 1.0;  // Same variable division is 1.0

        visited.add(start);

        for (Map.Entry<String, Double> neighbor : graph.get(start).entrySet()) {
            String next = neighbor.getKey();
            double value = neighbor.getValue();

            if (!visited.contains(next)) {
                double result = dfs(next, end, visited, graph);
                if (result != -1.0) {
                    return value * result;  // Multiply values along the path
                }
            }
        }

        return -1.0;  // No valid path found
    }
}