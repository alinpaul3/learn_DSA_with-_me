class Solution {
    public String reverseWords(String s) {
        String[] words=s.split("\\s+");
        String result="";
        Stack<String> stack=new Stack<>();
        for(String i: words)
            stack.push(i);
        while(!stack.isEmpty())
            result+=stack.pop()+" ";
        return result.trim();
    }
}
