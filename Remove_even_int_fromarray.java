/*Remove the even Integer from the given Array
 * sample input= [2,4,5,3,8,6,7]
 * sample output=[5,3,7]
*/
public class Remove_even_int_fromarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        arr = removeeven(arr);
        Printarray(arr);
    }

    public static int[] removeeven(int[] arr) {
        // Count the number of odd elements
        int count = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                count++;
            }
        }

        // Create a new array to hold odd elements
        int[] result = new int[count];
        int j = 0;
       // for (int i = 0; i < arr.length; i++)
       for(int i: arr) {
            if (i% 2 != 0) {
                result[j++] = i;
            }
        }
        return result;
    }

    public static void Printarray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
