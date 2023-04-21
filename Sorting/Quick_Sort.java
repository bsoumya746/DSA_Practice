/* Code for Quick-Sorting */

/* 

import java.util.*;

class Quick_Sort{

    public static int partition (ArrayList<Integer> arr, int low, int high){
        int pivot= arr.get(low);
        int i=low;
        int j=high;

        while(i<j){
            while(arr.get(i) <= pivot && i <= (high-1)){
                i++;
            }

            while(arr.get(j) > pivot && j >= (low+1)){
                j--;
            }

            if(i<j){
                int temp=arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j,temp);
            }
        }
        int temp = arr.get(low);
        arr.set(low, arr.get(j));
        arr.set(j, temp);
        return j;
    }

    public static void sorting( ArrayList<Integer> arr, int low, int high){
        if (low < high){
            int p_Ind = partition(arr, low, high);
            sorting(arr,low,(p_Ind-1));
            sorting(arr,(p_Ind+1),high);
        }
    }

    public static ArrayList<Integer> qSort( ArrayList<Integer> arr){
        sorting(arr,0,(arr.size()-1));
        return arr;
    }

    public static void main(String args[]){
        
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number of elements in your array:");
        int n = sc.nextInt();

        ArrayList <Integer> arr = new ArrayList<>(); 

        System.out.println("Enter the elements:");
        for (int i=0;i<n;i++){
            arr.add(i, sc.nextInt());
        }
        

        System.out.println("Before Using insertion Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        
        System.out.println();
        arr=qSort(arr);

        System.out.println("After insertion sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        sc.close();
    }
}

*/