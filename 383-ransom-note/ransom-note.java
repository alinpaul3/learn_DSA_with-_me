class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> mag=new HashMap<>();
        for(char c:magazine.toCharArray()){
            mag.put(c, mag.getOrDefault(c,0)+1);
        }
        for(char c:ransomNote.toCharArray()){
            if(!mag.containsKey(c)||mag.get(c)==0) return false;
            else
            mag.put(c,mag.get(c)-1);
        }
        return true;
    }
}