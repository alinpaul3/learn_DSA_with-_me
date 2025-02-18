class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
  List<List<Integer>> result = new ArrayList<>();
        backtrack(1, k, n, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int start, int k, int target, List<Integer> path, List<List<Integer>> result) {
        if (path.size() == k) {
            if (target == 0) {
                result.add(new ArrayList<>(path));
            }
            return;
        }

        for (int i = start; i <= 9; i++) { // Numbers from 1 to 9
            if (i > target) break; // Optimization: Stop if number exceeds target
            path.add(i);
            backtrack(i + 1, k, target - i, path, result); // Move to the next number
            path.remove(path.size() - 1); // Undo the choice
        }
    }
}
