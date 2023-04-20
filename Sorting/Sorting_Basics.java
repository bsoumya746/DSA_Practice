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


























