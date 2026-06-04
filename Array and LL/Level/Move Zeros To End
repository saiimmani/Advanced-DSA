import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        int[] arr = {1,0,2,0,3,4};

        moveZeros(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeros(int[] arr)
    {
        int j = 0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] != 0)   // arr[0] = 0 ignore that element
            {
                int temp = arr[i]; // swap i,j values 
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }
    }
}
