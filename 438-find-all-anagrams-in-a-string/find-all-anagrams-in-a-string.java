class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result=new ArrayList<>();
        int[] freq=new int[26];
        for(char c:p.toCharArray()){
            freq[c-'a']++;
        }
        int left=0;
        int pLength=p.length();
        for(int right=0;right<s.length();right++){
            freq[s.charAt(right)-'a']--;
            if((right-left+1)>pLength){
                freq[s.charAt(left)-'a']++;
              left++;
            }

            if((right-left+1)==pLength){
                boolean isAnagram=true;
                for(int i=0;i<26;i++){
                    if(freq[i]!=0){
                        isAnagram=false;
                        break;
                    }
                }
                if(isAnagram) result.add(left);
            }
        }
        return result;
    }
}