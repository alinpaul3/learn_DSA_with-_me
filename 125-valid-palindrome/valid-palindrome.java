class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch)) sb.append(Character.toLowerCase(ch));
        }
        String s2=sb.toString();
        sb.reverse();
        String s1=sb.toString();
        if(s2.equals(s1)) return true;
        return false;
    }
}