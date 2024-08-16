/*Reversing an array
 * sample input= [3,5,6,2,9,4]
 * sample output= [4,9,2,6,5,3]
 */
public class Reversingarray{
    public static void main(String[] args){
        int[] arr={3,5,7,2,9,0,4};
        arr= reversearray(arr,0,arr.length-1);
        printarray(arr);
    }
    public static int[] reversearray(int[] arr, int start, int end)
    {
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void printarray(int[] arr)
    {
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}