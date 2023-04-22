

/* Largest Element in an Array. */
/*
import java.util.*;
public class Easy{

    public static int maximum(int arr[], int size){
        int max=arr[0];
        for (int i=1;i<size;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }

        return max;

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in your array:");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements:");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        
        int max = maximum(arr,size);

        System.out.println("The largest element in the array is:"+max);
        sc.close();
    }
}

 */



/* Second Largest and second smallest elemenet in an array.*/

/*
import java.util.Scanner;
class Easy{
    public static void getElements(int arr[], int size)
    {
        if (size == 0 || size==1)
        {
            System.out.print(-1);
		    System.out.print(" ");
		    System.out.print(-1);
		    System.out.print("\n");
        }
        int small = Integer.MAX_VALUE;
	    int second_small = Integer.MAX_VALUE;
	    int large = Integer.MIN_VALUE;
	    int second_large = Integer.MIN_VALUE;
        int i;
        for (i = 0;i < size;i++)
        {
            small = Math.min(small,arr[i]);
            large = Math.max(large,arr[i]);
        }
        for (i = 0;i < size;i++)
        {
            if (arr[i] < second_small && arr[i] != small)
            {
                second_small = arr[i];
            }
            if (arr[i] > second_large && arr[i] != large)
            {
                second_large = arr[i];
            }
        }

	    System.out.println("Second smallest is "+ second_small);
	    System.out.println("Second largest is "+ second_large);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in your array:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements in your array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        getElements(arr, n);
        sc.close();
    }
}

 */


