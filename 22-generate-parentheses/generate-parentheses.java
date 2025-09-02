class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        backtrack(result,"",0,0,n);
        return result;
    }
    public void backtrack(List<String> result, String current,int open, int close,int num){
        if(current.length()==num*2){
            result.add(current);
            return;}
        if(open<num)
        backtrack(result,current+"(",open+1,close,num);
        if(close<open)
        backtrack(result,current+")",open,close+1,num);
    }
}