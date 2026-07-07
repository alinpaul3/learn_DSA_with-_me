class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }

        String filtered = sb.toString();
        String reversed = new StringBuilder(filtered).reverse().toString();

        return filtered.equals(reversed);
    }
}