class Solution {

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

//     public static int[] dailyTemperatures(int[] temp){
//     int[] result=new int[temp.length];
//     for(int i=0;i<temp.length;i++){
//         int stack= new int[temp.length];

//         int count=1;
//         for(int j=0;j<temp.length;j++){
//             while(temp[i]<temp[j]){
//                 count+=1;
//             }
//             result[i]=count;
//         }
//     }
//     return result;
// }
// }
