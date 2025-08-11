class Solution {
    static {
        int [] temp = {30, 60, 90};
        for(int i = 0; i < 500; i++)
            dailyTemperatures(temp);
    }
    public static int[] dailyTemperatures(int[] temp) {
        
        int stack[] = new int[temp.length];
        int top = -1;
        int result[] = new int[temp.length];

        for(int i = 0; i < temp.length; i++) {
            while(top > -1 && temp[i] > temp[stack[top]]) {
                result[stack[top]] = i - stack[top];
                top--;
            }
                stack[++top] = i;
        }
        return result;
    }
}
