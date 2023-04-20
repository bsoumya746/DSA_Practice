



//_______________________________________________ IF-ELSE AND SWITCH-CASE PROGRAMS________________________________________________________




/* *****10.Taking the age of user as an input and print whether the user is adult.*****

import java.util.*;

class SecondClass {
    public static void main(String args[]){
        System.out.print("Enter your age:");
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();

        if (age>18)  {
            System.out.println("Your age is "+ age +" and so you are an adult.");
        }
        else {
            System.out.println("You age is "+ age +" and so you are not an adult.");
        }

        sc.close();
    }
}

*/

/* *****11.Taking a number as an input and print whether they are odd or even.*****

import java.util.*;

class SecondClass {
    public static void main(String args[]){
        System.out.print("Enter any number of your choice:");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();

        if (num%2==0)  {
            System.out.println(num +" is an even number.");
        }
        else {
            System.out.println(num +" is an odd number.");
        }

        sc.close();
    }
}

*/

/* *****12.Taking the cost price and selling price of an item and determine whether the seller has made profit or loss.*****

import java.lang.Math;
import java.util.*;

class SecondClass{
    public static void main(String args[]){
     System.out.print("Enter the cost price of the item that is sold:");
     Scanner sc = new Scanner(System.in);
     int cp = sc.nextInt();
 

    System.out.print("Enter the selling price of the item that is sold:");
    int sp = sc.nextInt();
    
    sc.close();

    if(cp<sp) {
        double diff =  sp-cp;
        double profit = (diff/cp)*100;
        System.out.println("The seller has made a profit of "+Math.round(profit)+" %.");
    }
    if(cp>sp) {
        double diff = cp-sp;
        double loss = (diff/cp)*100;
        System.out.println("The seller has made a loss of "+Math.round(loss)+" %.");
    }

    }
}


*/

/* *****13.Taking  an input from (1 - 7) and determine the corresponding day of the week.*****

import java.util.*;

class SecondClass{
    public static void main(String args[]){
    System.out.println("Enter any number to print the day of the week as shown below:");
    System.out.println("1.Monday\n2.Tuesday\n3.Wednesday ...");
    System.out.print(":");
    Scanner sc= new Scanner(System.in);
    int wnum = sc.nextInt();
    sc.close();

    // if (wnum == 1){
    //     System.out.println("The day of the week is:Monday");
    // }
    // else if (wnum == 2){
    //     System.out.println("The day of the week is:Tuesday");
    // }
    // else if (wnum == 3){
    //     System.out.println("The day of the week is:Wednesday");
    // }
    
    // else if (wnum == 4){
    //     System.out.println("The day of the week is:Thursday");
    // }
    // else if (wnum == 5){
    //     System.out.println("The day of the week is:Friday");
    // }
    // else if (wnum == 6){
    //     System.out.println("The day of the week is:Saturday");
    // }
    // else if (wnum == 7){
    //     System.out.println("The day of the week is:Sunday");
    // }

    switch(wnum){
        case 1:
        System.out.println("The day of the week is:Monday");
        break;

        case 2:
        System.out.println("The day of the week is:Tuesday");
        break;

        case 3:
        System.out.println("The day of the week is:Wednesday");
        break;

        case 4:
        System.out.println("The day of the week is:Thursday");
        break;

        case 5:
        System.out.println("The day of the week is:Friday");
        break;

        case 6:
        System.out.println("The day of the week is:Saturday");
        break;

        case 7:
        System.out.println("The day of the week is:Sunday");
        break;

        default:
        System.out.println("You have entered an invalid input...Please re-enter....");

    }
    System.out.println("THANK YOU");
    }
}

*/

/* *****14.Taking three unique integers as an input find the maximum value among them.*****

 import java.util.*;

class SecondClass{
    public static void main(String args[]){
    System.out.println("Enter three unique integers as a,b,c");
    
    
    Scanner sc = new Scanner(System.in);
    int a,b,c;
    System.out.print("a:");
    a = sc.nextInt();
    System.out.print("b:");
    b=sc.nextInt();
    System.out.print("c:");
    c=sc.nextInt();
    sc.close();

    if (a >=b && a>=c) {
        System.out.println("The maximum number is:"+a);
    }
    else if (b >= a && b >= c) {
        System.out.println("The maximum number is :"+b);
    }
    else {
        System.out.println("The maximum number is:"+c);
    }
    
    } 
}

*/




