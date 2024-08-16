public class movezeros{
    public static void main(String[] args){
        int[] arr={0,1,0,4,12,0,7,16,9,0};
        int[] a=movezerostoend(arr);
        printarray(a);
    }
    public static int[] movezerostoend(int[] arr)
    {
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0)
            {
                
                {
                    arr[count]=arr[i];
                    count++;
                }
            }
        }
        for(int i=0;i<arr.length-count;i++)
        {
            arr[count+i]=0;
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