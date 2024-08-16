public class Minimumvalue {

    public static void main(String[] args)
    {
        int[] arr= {34,65,12,5,8,90};
        int a= minvaluearray(arr);
        printarray(a);
    }
    public static int minvaluearray(int[] arr)
    {
        int minvalue=arr[0];
        int i;
        for(i=1;i<arr.length;i++)
        {
            if(arr[i]<minvalue)
            {
                minvalue=arr[i];
            }
        
        }
        return minvalue;
    }
    public static void printarray(int minvalue)
    {
        System.out.printf("The minimum value in the array is: %d",minvalue);
    }
}