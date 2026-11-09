class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String key=convertNumber(strs[i]);
            if(map.containsKey(key))
            map.get(key).add(strs[i]);
            else {
                ArrayList<String> list=new ArrayList<>();
                list.add(strs[i]);
                map.put(key,list);}
        }
        return new ArrayList<>(map.values());
    }
    public String convertNumber(String s){
        int[] freq=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        String s1=Arrays.toString(freq);
        return s1;
    }
}