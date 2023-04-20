
/* Print all the subsequences of an array given by the user. */

/*
import java.util.*;

class Recursion_On_Subsequences{
	public static void subsequence(int i, StringBuilder s, String f) {
		if (i == s.length()) {
			System.out.print(f+" ");
			
			if(f.length()==1){
				System.out.print("[ ]");
			}

			return;
		}
		//picking 
		//f = f + s.charAt(i);
		subsequence(i + 1, s,  f+s.charAt(i));
		//poping out while backtracking
		//f.pop_back();
		subsequence(i + 1, s,  f);
	}
	public static void main(String args[]) {
		
		System.out.println("Enter the number of elements in your array:");
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the elements in your array:");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();

		}

		StringBuilder s=new StringBuilder();
		for(int i=0;i<size;i++){

			s.append(arr[i]);
		}



		String f = "";
		System.out.println("All possible subsequences are: ");
		subsequence(0, s, f);

		sc.close();
	}
}
*/










/* Print all the subsequences of the given array whose sum is K. */

/*

import java.util.*;

class Recursion_On_Subsequences{
	public static void subsequence(int i, StringBuilder s, String f,int sum, int k,int arr[]) {
		if (i == s.length()) {
			if (k==sum){
				System.out.print(f+" ");
			}
			return;
		}
		//picking 
		//f = f + s.charAt(i);
		subsequence(i + 1, s,  f+s.charAt(i),sum,k,arr);
		k+=arr[i];
		//poping out while backtracking
		//f.pop_back();
		subsequence(i + 1, s,  f,sum,k,arr);
		k-=arr[i];
	}
	public static void main(String args[]) {
		
		System.out.println("Enter the number of elements in your array:");
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the elements in your array:");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();

		}

		StringBuilder s=new StringBuilder();
		for(int i=0;i<size;i++){

			s.append(arr[i]);
		}

		
		System.out.println("Enter the sum of the elements in your subsequence:");
		int sum = sc.nextInt();

		String f = "";
		System.out.println("All possible subsequences are: ");
		subsequence(0, s, f,sum,0,arr);

		sc.close();
	}
}

*/




/* Print any one subsequence of the given array whose sum is K. */

/*
import java.util.*;
class Recursion_On_Subsequences{
	public static int subsequence(int i, StringBuilder s,int sum, int k,int arr[]) {
		if (i == s.length()) {
			if (k==sum){
				return 1;
			}else{
				return 0;
			}
		}
		//picking 
		int l = subsequence(i + 1, s,sum,k,arr);
		k+=arr[i];
		//not picking
		int r = subsequence(i + 1, s,sum,k,arr);
		k-=arr[i];
		return (l+r);
	}
	public static void main(String args[]) {
		
		System.out.println("Enter the number of elements in your array:");
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the elements in your array:");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();

		}

		StringBuilder s=new StringBuilder();
		for(int i=0;i<size;i++){

			s.append(arr[i]);
		}

		
		System.out.println("Enter the sum of the elements in your subsequence:");
		int sum = sc.nextInt();

		
		System.out.println("Any one possible subsequence is: ");
		System.out.println(subsequence(0, s,sum,0,arr));

		sc.close();
	}
}

*/


/* Count all subsequences with sum K. */

/*
import java.util.*;
class Recursion_On_Subsequences {
	static int subsequence(int arr[], int size, int ind, int sum, int count){
		if(ind == size){
			if(sum == 0){
				count++;
      }
				return count;
    }
       
			count =subsequence(arr, size, ind + 1, sum - arr[ind], count);//Taking A[i]
      count = subsequence(arr, size, ind + 1, sum , count);//Not taking A[i]
      return count;
  }
  public static void main(String[] args) {  
			
		System.out.println("Enter the number of elements in your array:");
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the elements in your array:");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();

		}


   	System.out.println("Enter the sum of the elements in your subsequence:");
		int sum = sc.nextInt();

    System.out.println("Total number of subsets having sum "+sum+" = "+ subsequence(arr, size, 0, sum, 0));
		sc.close();
	}
}

*/
