class Solution {
    public String removeDuplicates(String s) {
        StringBuilder stack = new StringBuilder();
        for (char c : s.toCharArray()) {
            int length = stack.length();
            if (length > 0 && stack.charAt(length - 1) == c) 
                stack.deleteCharAt(length - 1);
                else 
                stack.append(c);
        }

        return stack.toString();
    }
}
