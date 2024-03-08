
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
		    System.out.print("\size");
        }
        int small = Integer.MAX_VALUE;
	    int second_small = Integer.MAX_VALUE;
	    int large = Integer.MIN_VALUE;
	    int second_large = Integer.MIN_VALUE;
        for (int i = 0;i < size;i++)
        {
            small = Math.min(small,arr[i]);
            large = Math.max(large,arr[i]);
        }
        for (int i = 0;i < size;i++)
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
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements in your array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        getElements(arr, size);
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
        int size=sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements :");
        for(int i=0;i<size;i++){
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
relative order of the elements should be kept the same.If there are rot elements after removing the duplicates, 
then the first rot elements of the array should hold the final result. It does not matter what you leave beyond 
the first rot elements.
Note: Return rot after placing the final result in the first rot slots of the array.
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
        int rot = set.size();
        int j = 0;
        for (int x: set) {
            arr[j++] = x;
        }
        return rot;
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

/*
Given an array of N integers, left rotate the array by one place.
Example 1:
Input: N = 5, array[] = {1,2,3,4,5}
Output: 2,3,4,5,1
Explanation: 
Since all the elements in array will be shifted 
toward left by one so ‘2’ will now become the 
first index and and ‘1’ which was present at 
first index will be shifted at last.
 */

/* Brute Solution --> 

import java.util.*;

class Easy{


    public static void shift(int arr[], int size){
        int new_arr[] = new int[size];
        for(int i=1;i<size;i++){
            new_arr[i-1]=arr[i];
        }
        new_arr[size-1]=arr[0];
        
        System.out.println("The array when left rotated by one place is:");
        for(int i=0;i<size;i++){
            System.out.print(new_arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in your array:");
        int size = sc.nextInt();


        int arr[] = new int[size];

        System.out.println("Enter the elements of your array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        shift(arr,size);
    }
}
 
 */

 

/*You are given an array of integers, your task 
is to move all the zeros in the array to the end of the array and move non-negative integers
to the front by maintaining their order. */

/*Brute Solution --> 


import java.util.*;

class Easy{

    public static void shift_zeroes(int arr[],int length){
        int temp[] = new int[length];
        int k=0;
        for(int i=0;i<length;i++){
            if(arr[i]!=0){
                temp[k]=arr[i];
                k++;
            }
        }

        while(k<length){
            temp[k]=0;
            k++;
        }

        for(int i=0;i<length;i++){
            System.out.print(temp[i]+" ");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in your array:");
        int size=sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements in your array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        shift_zeroes(arr,size);

        sc.close();
    }
}

*/

/*Optimized Solution --> 

import java.util.*;

public class Easy {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the number of elements in your array:");
    
    int size=sc.nextInt();
    int arr[] = new int[size];
    
    System.out.println("Enter the elements in your array:");
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
    
    
    zerosToEnd(arr);

  }
  public static void zerosToEnd(int[] arr) {

    //finding first zero occurrence
    int k = 0;
    while (k < arr.length) {
      if (arr[k] == 0) {
        break;
      }else{
        k++;
      }
    }

    //finding zeros and immediate non-zero elements and swapping them
    int i = k, j = k + 1;

    while (i < arr.length && j < arr.length) {
        if (arr[j] != 0) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }
        j++;
    }

    for (i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}

*/


/*
Given two sorted arrays, arr1, and arr2 of size n and m. Find the union of two sorted arrays.
The union of two arrays can be defined as the common and distinct elements in the two arrays.
NOTE: Elements in the union should be in ascending order.
 */

/*Brute Solution --> */

/*
import java.util.*;

class Easy{


    public static ArrayList<Integer> Find_Union(int arr_1[],int size_1,int arr_2[],int size_2){
        HashMap <Integer,Integer > freq = new HashMap<>();
        ArrayList<Integer> Union=new ArrayList<>();
        for (int i = 0; i < size_1; i++)
            freq.put(arr_1[i],freq.getOrDefault(arr_1[i],0)+1);
        for (int i = 0; i < size_2; i++)
            freq.put(arr_2[i],freq.getOrDefault(arr_2[i],0)+1);
        for (int it: freq.keySet())
            Union.add(it);
        return Union;
    }


    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array one:");
        int size_1= sc.nextInt();

        int arr_1[] = new int[size_1];

        System.out.println("Enter the elements of your first array:");
        for(int i=0; i<size_1;i++){
            arr_1[i]=sc.nextInt();
        }

        System.out.println("Enter the size of array two:");
        int size_2= sc.nextInt();

        int arr_2[] = new int[size_2];

        System.out.println("Enter the elements of your second array:");
        for(int i=0; i<size_2;i++){
            arr_2[i]=sc.nextInt();
        }

        ArrayList <Integer> Union = Find_Union(arr_1,size_1,arr_2,size_2);

        System.out.println("Union of arr1 and arr2 is:");
        for (int val: Union){
            System.out.print(val+" ");
        }
        System.out.println("");
    }

}

 */

/* Better Solution --> */

/*
import java.util.*;

class Easy{


    public static ArrayList<Integer> Find_Union(int arr_1[],int size_1,int arr_2[],int size_2){
        HashSet <Integer> set = new HashSet<>();
        ArrayList<Integer> Union=new ArrayList<>();
        for (int i = 0; i < size_1; i++)
            set.add(arr_1[i]);
        for (int i = 0; i < size_2; i++)
            set.add(arr_2[i]);
        for (int it: set)
            Union.add(it);
        return Union;
    }


    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array one:");
        int size_1= sc.nextInt();

        int arr_1[] = new int[size_1];

        System.out.println("Enter the elements of your first array:");
        for(int i=0; i<size_1;i++){
            arr_1[i]=sc.nextInt();
        }

        System.out.println("Enter the size of array two:");
        int size_2= sc.nextInt();

        int arr_2[] = new int[size_2];

        System.out.println("Enter the elements of your second array:");
        for(int i=0; i<size_2;i++){
            arr_2[i]=sc.nextInt();
        }

        ArrayList <Integer> Union = Find_Union(arr_1,size_1,arr_2,size_2);

        System.out.println("Union of arr1 and arr2 is:");
        for (int val: Union){
            System.out.print(val+" ");
        }
        System.out.println("");
    }

}

 */

/* Best Solution --> */


/*
Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N. 
Find the number(between 1 to N), that is not present in the given array.
 */

/*Brute Solution --> */

/*
import java.util.*;

class Easy{

    
    public static int ck_miss(int arr[],int size){
        for (int i=1; i<=size;i++){
            int check=0; 
            for(int j=0;j<size-1;j++){
                if(arr[j]== i){
                    check=1;
                    break;
                }
            }
            if (check == 0){
                return i;
           } 
        }
        return -1;
    }
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size= sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements of your array:");
        
        for(int i=0; i < (size-1);i++){
            arr[i]=sc.nextInt();
        }
        
        int miss_num = ck_miss(arr,size);
        
        if(miss_num!=-1){
            System.out.println("The missing number is: "+ miss_num);
        }
        
    }

        
}

 */

 /* Optimal Solution --> */
 

 

/*
Given an array that contains only 1 and 0, return the count of maximum consecutive ones in the array.
*/

/*
class Easy{

	public static int find_max_con_ones(int arr[]){
		int cnt =0;
		int max_cnt=0;
		for(int i =0; i<arr.length;i++){
			if(arr[i]==1){
				cnt++;
			}else{
				cnt = 0;
			}

			max_cnt=Math.max(cnt,max_cnt);
		}

		return max_cnt;
	}



	public static void main(String[] args){
		int arr[] = {1,1,0,1,1,1};
		int ans = find_max_con_ones(arr);
		System.out.println("The maximum number of consecutive ones in the given array is:"+ans);
	}

}

*/


/*
 2-Sum Problem
 --------------
 Check if a pair with given sum exists in Array.
*/


/* Brute Force Solution */

/*
import java.util.Scanner;
class Easy{

    public static String checkExi(int arr[], int size, int target){
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]+arr[j]==target){
                    return "YES";
                }
            }
        }
        return "NO";
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in your array:");
        int size = sc.nextInt();

        System.out.println("Enter the value of target sum:");
        int target = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements in your array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        String ans = checkExi(arr,size,target);
        System.out.println(ans);
    }
}

 */

 /*Better Solution */

 /*
import java.util.*;
class Easy{
    public static int[] checkExi(int arr[] , int size, int target){
        int ans[] = new int[2];
        ans[0]=ans[1]=-1;

        HashMap <Integer,Integer> map = new HashMap<>();
        for (int i = 0; i<size;i++){
            int num=arr[i];
            int extra=target-num;
            if(map.containsKey(extra)){
                ans[0]=map.get(extra);
                ans[1]=i;
                return ans;
            }
            map.put(arr[i],i);
        }
        return ans;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in your array:");
        int size = sc.nextInt();

        System.out.println("Enter the value of target sum:");
        int target = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements in your array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int ans[] = checkExi(arr,size,target);
        System.out.println("["+ans[0]+","+ans[1]+"]");
    }
}
 */

/*Best Solution */ 

/*
import java.util.Arrays;
import java.util.Scanner;
class Easy{

    public static String checkExi(int arr[], int size, int target){
        Arrays.sort(arr);
        int left = 0;
        int right = size-1;

        while(left<right){
            int sum = arr[left]+arr[right];
            if(sum == target){
                return "YES";
            }else if(sum < target){
                left++;
            }else if(sum > target){
                right--;
            }
        } 
        return "NO";
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in your array:");
        int size = sc.nextInt();

        System.out.println("Enter the value of target sum:");
        int target = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements in your array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        String ans = checkExi(arr,size,target);
        System.out.println(ans);
        sc.close();
    }
}

  */



/*
Kadane's Algorithm
 */




