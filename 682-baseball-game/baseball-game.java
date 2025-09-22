class Solution {
    public int calPoints(String[] operations) {
        // ArrayList<Integer> array= new ArrayList<>();
        Stack<Integer> stack= new Stack<>();
        int n=operations.length;
        for(int i=0;i<n;i++){
            if(operations[i].equals("C"))
            stack.pop();
            else if(operations[i].equals("D"))
            stack.push(2*stack.peek());
            else if(operations[i].equals("+")){
             int a = stack.get(stack.size()-1);     // last element (top)
             int b = stack.get(stack.size()-2);     // second last element
             stack.push(a+b);}
             else
             stack.push(Integer.parseInt(operations[i]));

        }
        int sum=0;
        for(int i : stack)
        sum+=i;
        return sum;
    }
    
}