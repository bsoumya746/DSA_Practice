



//_______________________________________________ INPUT/OUTPUT PROGRAMS________________________________________________________




/* *****First Program*****

class FirstClass{
    public static void main(String args[]){
        System.out.print("Hello World with Java.");
    }
}

*/

/* *****Second Program*****

class FirstClass{
    public static void main(String args[]){
        System.out.print("Hello World with Java.");
        System.out.print("Hello World with Java.");
    }
}.
*/

/* *****Third Program*****



class FirstClass{
    public static void main(String args[]){
        System.out.println("Hello World with Java.");
        System.out.print("Hello World with Java.");
    }
}

*/

/* *****Fourth Program*****



class FirstClass{
    public static void main(String args[]){
        System.out.print("Hello World with Java.\n");
        System.out.print("Hello World with Java.");
    }
}

*/

/* *****Fifth Program*****



class FirstClass{
    public static void main(String args[]){
        System.out.print("Hello World with Java.\t");
        System.out.print("This is the first time learning java.\t It is very fun learning java.");
    }
}


*/

/* *****Sixth Program*****



class FirstClass{
    public static void main(String args[]){
        System.out.print("*\n**\n***\n****");
        
    }
}

*/

/* *****7.Finding the area of a reactangle when length and breadth is given*****



class FirstClass{
    public static void main(String args[]){
       int length=10;
       int breadth=12;
       int area=length*breadth;
       System.out.print("Area of rectangle="+area);
       //System.out.print(area);
    }
}

*/

/* *****8.Taking the name as an input from an user and printing it*****


import java.util.*;
class FirstClass{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       //String name =sc.next();
       String name =sc.nextLine();
       System.out.print("Your name is:");
       System.out.print(name);
       sc.close();
    }
}

*/

/* *****9.Taking two numbers as input from the user and printing the sum of it*****




import java.util.*;
class FirstClass{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter the first number:");
       int a = sc.nextInt();
       System.out.println("Enter the second number:");
       int b = sc.nextInt();
       int sum=a+b;
       System.out.println("The sum of the two numbers entered by you is:\t"+sum);
       sc.close();
    }
}


*/

