



//_______________________________________________ARRAYS IN JAVA ________________________________________________________




/* ***** 36.Write a program to make an array named 'marks', which consists of marks of three subjects and print the respective subject marks.*****




class SixthClass{
    public static void main(int args[]) {
        int marks[] = new int[3];
        marks[0] = 94;
        marks[1] = 96;
        marks[2] = 98;
        
        System.out.println("The required marks are:");
        
        for (int i=0;i<=2;i++){
            System.out.println(marks[i]);
        }
    }
}
*/

/* ***** 37.Write a program to make an array of phone numbers, where the user will input the array size and the he will input the phone numbers.*****

import java.util.*;
class SixthClass{
    public static void main(int args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of phone numbers you want to store:");
        int size = sc.nextInt();
        int ph_numbers[] = new int[size];
        System.out.println("Enter the numbers.Please press enter after pressing each and every phone number.....");

        for(int j=0;j<size;j++){
            ph_numbers[j]= sc.next();
        }
        for (int i=0;i<size;i++){
            System.out.println(ph_numbers[i]);
        }

        sc.close();
    }
}

 */

/* ***** 38.Take an array as an input from the user.Search for a given number 'x' and print the index at which it occurs.*****


 import java.util.*;
 class SixthClass{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the quantity of numbers that you want to store:");
        int size = sc.nextInt();
        int names[] = new int[size];
        System.out.println("Enter the numbers.Please press enter after pressing each and every phone number.....");

        for(int j=0;j<size;j++){
            names[j]= sc.nextInt();
        }
        
        System.out.println("Enter the number which you want to search:");
        int x=sc.nextInt();

        for(int i=0;i<names.length;i++){
            if(names[i] == x){
                System.out.println(x + " is found at index " + i+".");
            }
        }
        sc.close();
    }
 }

  */

/* ***** 39.Take an array of numbers as an input from the user.Search for the maximum and minimum numbers from the array.***** 

import java.util.*;

class SixthClass{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the quantity of numbers you want to add in your array:");
        int size=sc.nextInt();
        int numbers[] = new int[size];
        System.out.println("Please enter the numbers one by one:");
        
        for (int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }


        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<min){
                min=numbers[i];
            }

            if(numbers[i]>max){
                max=numbers[i];
            }
        }

        System.out.println("The minimum number is:" + min);
        System.out.println("The maximum number is:" + max);

        sc.close();

    }
}

*/

/* ***** 40.Given a sorted array Arr of size N and a value X, find the number of array elements less than or equal to X 
and elements more than or equal to X. ***** 


import java.util.*;
class SixthClass{
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of your array:");
        int N=sc.nextInt();

        int Arr[] = new int[N]; 

        System.out.println("Enter the numbers in your array:");
        for(int i=0;i<N;i++){
            Arr[i]=sc.nextInt();
        }

        int less=0;
        int more=0;

        System.out.println("Enter the value of x:");
        int x=sc.nextInt();

        for(int i=0;i<Arr.length;i++){
            if(Arr[i]>=x){
                more++;
            }else if (Arr[i]<=x){
                less++;
            }
        }

        System.out.println("The number of values less than "+x+" is:"+less);
        System.out.println("The number of values more than "+x+" is:"+more);
        sc.close();
    }
}

*/

/* ***** 41.You are given an array A of numbers of size N. You need to print elements of A in alternate order (starting from index 0).*****


import java.util.*;

class SixthClass{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of your array:");
        int N= sc.nextInt();
        
        int A [] = new int[N];

        System.out.println("Enter the numbers in your array one by one:");

        for(int i=0;i<A.length;i++){
            A [i]=sc.nextInt();
        }

        for(int i=0;i<A.length;i=i+2){
            System.out.println(A[i]);
        }

        sc.close();
    }
}

 */

/* ***** 42.Write a program to find the sum of the given series 1+2+3+ . . . . . .(N terms).*****


import java.util.*;

class SixthClass{
    public static void main(String args[]){
        int sum=0;

        System.out.println("Enter the last number upto which you want to perform summation:");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i<n){
                System.out.print(i+"+");
                sum=sum+i;
            }else if(i==n){
                System.out.print(i+"=");
                sum=sum+i;
            }
            
        }
        System.out.println(sum);
        sc.close();
    }
    
}
*/

/* ***** 43.Given an array of size N and you have to tell whether the array is perfect or not.
An array is said to be perfect if it's reverse array matches the original array. If the array is perfect then print "PERFECT" 
else print "NOT PERFECT". *****
*/

/* ***** 44.Given an array Arr of N positive integers.
Your task is to find the elements whose value is equal to that of its index value. *****


import java.util.*;
class SixthClass{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array:");
        int N=sc.nextInt();
        
        int Arr[]=new int[N];
        
        System.out.println("Enter the values that is to be put in your array:");
        for (int i=0;i<N;i++){
            Arr[i]=sc.nextInt();
        }


        System.out.println("The elements which have value equal to its index value are:");
        for(int i=0;i<N;i++){
            if(i==Arr[i]){
                System.out.print(Arr[i]+" ");;
            }
        }

        sc.close();

    }
}

 */
 
/* ***** 45.Take a two-dimensional array as an input from the user and find the location of the number, given as an input by the user, in the array.


import java.util.Scanner;
class SixthClass{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of your array:");
        System.out.print("Rows:");
        int rows=sc.nextInt();
        System.out.print("Columns:");
        int col=sc.nextInt();

        int num[][] = new int[rows][col];

        System.out.println("Ennter the numbers in your array:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                num[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the number that you want to search for:");
        int srcnum=sc.nextInt();

        for (int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
               if(num[i][j]==srcnum){
                System.out.println("The number "+srcnum+" is found at ("+i+","+j+").");
               }
            }
        }
        sc.close();

    }
}
 */