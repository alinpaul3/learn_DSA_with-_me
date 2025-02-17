class Solution {
    // Mapping of digits to letters
    private static final String[] KEYPAD = {
        "",    "",    "abc", "def",  // 0,1,2,3
        "ghi", "jkl", "mno", // 4,5,6
        "pqrs", "tuv", "wxyz"  // 7,8,9
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return result;
        }
        backtrack(result, digits, new StringBuilder(), 0);
        return result;
    }

    private void backtrack(List<String> result, String digits, StringBuilder current, int index) {
        // Base case: If the combination is complete
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        // Get letters corresponding to the current digit
        String letters = KEYPAD[digits.charAt(index) - '0'];

        // Iterate over each letter and recurse
        for (char letter : letters.toCharArray()) {
            current.append(letter); // Choose a letter
            backtrack(result, digits, current, index + 1); // Explore next digit
            current.deleteCharAt(current.length() - 1); // Backtrack (remove last character)
        }
    }
}

  
