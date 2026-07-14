class Solution {
    public int maxVowels(String s, int k) {
        int left=0;
        int max=Integer.MIN_VALUE;
        String vowel="aeiou";
        int count=0;
        for(int right=0;right<s.length();right++){
            if(vowel.contains(""+s.charAt(right))){
                count++;
            }
            if(right-left+1==k){
                max=Math.max(max,count);
                if(vowel.contains(""+s.charAt(left)))count--;
                left++;
            }
        }
        return max;
    }
}