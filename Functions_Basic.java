

//_______________________________________________FUNCTIONS IN JAVA ________________________________________________________




/* *****33.Write a code to make a function to say hello to yourself.***** */

/*
 import java.util.*;

 class FifthClass{
    public static void say_hello(String name){
        System.out.println("Hello "+name+". Thanks for using JAVA.");
        return;
    }

    public static void main(String args[]) {
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        sc.close();
        say_hello(name); //here we are calling the say_hello function from thr main function.
    }
 }

 */

/* *****34.Write a code to make a function to add two numbers and return their sum.*****



 import java.util.*;
 class FifthClass{
    public static int Add_numbers(int num_1,int num_2){
        int sum=num_1+num_2;
        return sum;
    }

    public static void main(String args[]){
        int a,b;
        System.out.println("Enter the first number:");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("Enter the second number:");
        b=sc.nextInt();

    sc.close();
        System.out.println("The sum of two numbers entered by you is:"+Add_numbers(a, b));
    }
 }

  */

/* *****35.Write a code to make a function to find the factorial of number.*****



import java.util.*;
class FifthClass{
    public static void Findfac(int num){
        int fac=1;
        if(num<0){
            System.out.println("Invalid imput:Please enter non negative integers only.");
            return;
        }else if(num == 0){
            fac=1;
            System.out.println("The factorial of the number you needed is:"+fac);
            return;
        }else if(num>0){
            for(int i=num;i>=1;i--){ //we are not keeping the terminating condition as (i>=0) as because 0!=1.
                fac=fac*i;

            }
            System.out.println("The factorial of the number you needed is:"+fac);
            return;
        }
    }

    public static void main(String args[]){
        int a;
        System.out.println("Pleae enter the number whose factorial is to be found:");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        sc.close();
        Findfac(a);
    }
}

*/
