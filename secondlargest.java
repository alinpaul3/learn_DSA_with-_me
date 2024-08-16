import java.util.Arrays;
public class secondlargest{
    public static void main (String[] args)
    {
        int[] arr={24,54,34,12,90,76,54,34,87};
        int a =secondlargestarray(arr);
        printarray(a);

    }
    public static int secondlargestarray(int[] arr)
    {
        int[] b = Arrays.copyOf(arr, arr.length);
        Arrays.sort(b);
        int seclarge=b[arr.length-2];
        return seclarge;
    }
   
public static void printarray(int seclarge)
{
    System.out.printf("The second largest value in the array is: %d",seclarge);
}
}
