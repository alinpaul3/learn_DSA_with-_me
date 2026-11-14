class Solution {
    public int characterReplacement(String s, int k) {

        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }

        int max = 0;

        for (char c : set) {

            int left = 0;
            int right = 0;
            int replacements = 0;

            while (right < s.length()) {

                if (s.charAt(right) != c) {
                    replacements++;
                }

                right++;

                while (replacements > k) {
                    if (s.charAt(left) != c) {
                        replacements--;
                    }
                    left++;
                }

                max = Math.max(max, right - left);
            }
        }

        return max;
    }
}
