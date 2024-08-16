public class missingnumber{
    public static void main(String[] args)
    {
        int[] arr= {2,6,7,4,3,1,8};
        int a= findmissingnumber(arr);
        printnumber(a);
    }
    public static int findmissingnumber(int[] arr){
        int n= arr.length+1;
        int sum;
        sum=(n*(n+1))/2;
        for(int i: arr)
        {
            sum=sum-i;
        }
        return sum;
    }
    public static void printnumber(int sum)
    {
        System.out.printf("The missing number is: %d",sum);
    }

}