class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
    
        int n = spells.length;
        int m = potions.length;
        int[] pairs = new int[n];

        // Step 1: Sort the potions array
        Arrays.sort(potions);

        // Step 2: Iterate through each spell
        for (int i = 0; i < n; i++) {
            int spellStrength = spells[i];

            // Step 3: Use Binary Search to find the first valid potion
            int left = 0, right = m - 1, index = m; // Default index is out of bounds
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if ((long) spellStrength * potions[mid] >= success) {
                    index = mid;  // Potential answer
                    right = mid - 1; // Try to find an even smaller valid index
                } else {
                    left = mid + 1;
                }
            }

            // Step 4: The number of successful pairs is (m - index)
            pairs[i] = m - index;
        }

        return pairs;
    }
}

//Overall Time Complexity: O(mlogm)+O(nlogm)=O((n+m)logm)
//Overall Space Complexity: O(n)