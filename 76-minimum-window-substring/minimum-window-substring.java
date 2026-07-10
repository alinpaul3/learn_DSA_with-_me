class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length())
            return "";
        int[] need = new int[128];
        // Store frequency of characters in t
        for (char c : t.toCharArray()) {
            need[c]++;
        }
        int left = 0;
        int count = t.length();
        int minLength = Integer.MAX_VALUE;
        int start = 0;

        // Expand the window
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            // If this character is still needed
            if (need[ch] > 0) {
                count--;
            }
            need[ch]--;
            // Window is valid
            while (count == 0) {
                // Update minimum window
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                }
                char leftChar = s.charAt(left);
                // Remove left character from window
                need[leftChar]++;
                // If we now need this character again,
                // the window becomes invalid
                if (need[leftChar] > 0) {
                    count++;
                }
                left++;
            }
        }
        if (minLength == Integer.MAX_VALUE)
            return "";

        return s.substring(start, start + minLength);
    }
}