



//_______________________________________________PROGRAMS ON LOOPS________________________________________________________




/* *****15.Taking the number of times one has to print 'Hello World' from the user print the same*****

 

 
import java.util.*;
class ThirdClass{
    public static void main(String args[]) {
        System.out.println("Enter the number of times you want to print 'Hello World':");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for ( int counter=0;counter<(num+1);counter++){
            System.out.println("Hello World");
        sc.close();

        }


    }
}

*/

/* *****16.Taking the last number as input the user print the serial of numbers till that number starting from zero.***** 



import java.util.*;
class ThirdClass{
    public static void main(String args[]) {
        System.out.print("Enter the last digit upto which you want to print the number system:");

        Scanner sc=new Scanner(System.in);
        int last_num = sc.nextInt();

        //counter=counter+1
        for (int counter=0;counter<last_num+1;counter++){
            System.out.println(counter);
        }
        sc.close();
        
    }
}

*/

/* *****17.Display the first 'n' Even numbers with their sum, where 'n' is a number given as an input to the user.***** 

import java.util.*;

class ThirdClass{
    public static void main (String args[]){
        System.out.println("Enter the value of 'n':");

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();

        System.out.println("The required even numbers are:");

        int counter = 0;
        int even=0;
        int sum=0;
        while (counter<n){
            counter++;
            even=even+2;
            sum=sum+even;
            System.out.println(even);
        }

        System.out.println("The sum of the required even numbers is:" + sum);
        
    }
}


*/

/* *****18.Program to input ten numbers and find the average of those which are the multiples of five.***** */

import java.util.*;

class ThirdClass{
    public static void main(String args[]) {
        System.out.println("Enter ten numbers of your choice:");
        Scanner sc=new Scanner(System.in);
       int sum=0;
			 int count=0;
        for (int a=0; a<10;a++){
            int num = Integer.parseInt(sc.nextLine());
            if (num % 5 == 0){
                sum = sum+num;
								count=count+1;
						
            }
						
        }
				int average=(sum/count);
        
        sc.close();

        System.out.println("The average of the numbers which are multiples of five among the numbers entered by you are:" + average);
    }
}





