/* ***** Reversing of an array using two pointers and functional recursion.***** */
import java.util.*;
class Functional_Recursion{
	
	public static void rev_arr(int low,int high,int arr[])
	{			
		if(low>=high){
			return;
		}

		int temp = arr[low];
		arr[low]=arr[high];
		arr[high]= temp;

		rev_arr(low+1, high-1, arr);

	}

	public static void main(String args[]){
		System.out.println("Enter the no of elements in your array:");
		Scanner sc =new Scanner(System.in);
		int size = sc.nextInt();

		int arr[] = new int[size];
	
		System.out.println("Enter the array elements:");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}

		rev_arr(0,(size-1),arr);
		System.out.println("The reversed array is :");
		for (int i=0;i<size;i++){
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}
}


