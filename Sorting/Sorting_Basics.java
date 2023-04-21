/* *****Code for bubble-sorting.***** */

/*
import java.util.*;

class Sorting{
	public static void main(String args[]){
		
		//Taking the size of the array-->
		System.out.println("Enter the size of the array to be sorted:");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[]=new int[size];

		//Taking the elements of the array-->
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<=(size-1);i++){
			arr[i]=sc.nextInt();

		}
		
		System.out.println("The array given as an input by you is:");
		for(int i=0;i<=(size-1);i++){
			System.out.print(arr[i]+" ");
		}

		System.out.println('\n');

		//Bubble Sorting-->
		for(int i=1;i<=(size-1);i++){
			for(int j=0;j<=(size-i-1);j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}

		System.out.println("After sorting the array elements, the array becomes:");
		for (int i=0;i<=(size-1);i++){
			System.out.print(arr[i]+" ");
		}


		sc.close();

		
	}
}



*/

/* *****Code for selection-sorting***** */

/* 
import java.util.*;

public class Sorting_Basics {
    static void selection_sort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            //swap
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }

        System.out.println("After selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {

		System.out.println("Enter the number of elements in your array:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        
		int arr[] = new int[n];

		System.out.println("Enter the elements in your array:");
		for (int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
        
		System.out.println("Before selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    	selection_sort(arr, n);
		sc.close();
	}

	
}


*/


/* *****Code for insertion-sorting***** */

/* 
import java.util.*;

public class Sorting_Basics {
    static void insertion_sort(int[] arr, int n) {
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        System.out.println("After insertion sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        
		System.out.println("Enter the number of elements in your array:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        
		int arr[] = new int[n];

		System.out.println("Enter the elements in your array:");
		for (int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}

        System.out.println("Before Using insertion Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        insertion_sort(arr, n);

		sc.close();
    }

} 


*/
















