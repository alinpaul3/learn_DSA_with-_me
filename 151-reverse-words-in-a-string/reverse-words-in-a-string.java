class Solution {
    public String reverseWords(String s) {
        // String[] words=s.split("\\s+");
        // String result="";
        // Stack<String> stack=new Stack<>();
        // for(String i: words)
        //     stack.push(i);
        // while(!stack.isEmpty())
        //     result+=stack.pop()+" ";
        // return result.trim();
        String[] words = s.split("\\s+");
        StringBuilder result = new StringBuilder();
        
        // Use array as stack
        String[] stack = new String[words.length];
        int top = -1; // stack pointer
        
        // Push elements
        for (String word : words) {
            stack[++top] = word;
        }
        
        // Pop elements
        while (top >= 0) {
            result.append(stack[top--]);
            if (top >= 0) {
                result.append(" ");
            }
        }
        
        return result.toString().trim();
    }
}
