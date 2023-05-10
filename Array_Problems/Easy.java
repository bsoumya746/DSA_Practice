

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

/*Check whether an array is sorted or not.*/

/*
import java.util.Scanner;
class Easy{
    public static boolean check_sorted(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in your array:");
        int n=sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        if (check_sorted(arr)){
            System.out.println("The array is sorted.");
        }else{
            System.out.println("The array is not sorted.");
        }
        sc.close();            
    }
}

 */

/* 
Remove duplicates from an array.
----------------------------------
Given an integer array sorted in non-decreasing order, 
remove the duplicates in place such that each unique element appears only once. The 
relative order of the elements should be kept the same.If there are k elements after removing the duplicates, 
then the first k elements of the array should hold the final result. It does not matter what you leave beyond 
the first k elements.
Note: Return k after placing the final result in the first k slots of the array.
 */

/* Solution -01 --> 
 
import java.util.*;

class Easy{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of your array:");
        int size = sc.nextInt();

        int arr[]=new int[size];

        System.out.println("Enter the elements in your array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        
        int elem = rem_dup(arr);
        System.out.println("The array after removing the duplicates is:");
        for(int i=0;i<elem;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        sc.close();
    }

    public static int rem_dup(int arr[]){
        HashSet < Integer > set = new HashSet < > ();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int k = set.size();
        int j = 0;
        for (int x: set) {
            arr[j++] = x;
        }
        return k;
    }
}

*/

/* Solution -02 -->

import java.util.*;

class Easy{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of your array:");
        int size = sc.nextInt();

        int arr[]=new int[size];

        System.out.println("Enter the elements in your array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        
        int elem = rem_dup(arr);
        System.out.println("The array after removing the duplicates is:");
        for(int i=0;i<elem;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        sc.close();
    }

    public static int rem_dup(int arr[]){
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
}

*/


