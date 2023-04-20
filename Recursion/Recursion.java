



//_______________________________________________RECURSION________________________________________________________




/* *****54.Print numbers from five to one.***** 
class TenthClass{
    
     public static void print_num_rev(int n) {
        //Base case-->
        if (n==0){
            return;
        }
        //Work to be done -->
        System.out.println(n);
        //Recursion -->
        print_num_rev(n-1);
    }
    public static void main(String[] args) {

        System.out.println("The numbers from 5 to 1 are:");
        print_num_rev(5);
    }
}
*/

/* *****55.Print numbers from one to five.*****  
class TenthClass{
    
     public static void print_num(int n) {
        //Base case-->
        if (n>5){
            return;
        }
        //Work to be done -->
        System.out.println(n);
        //Recursion -->
        print_num(n+1);
    }
    public static void main(String[] args) {

        System.out.println("The numbers from 1 to 5 are:");
        print_num(1);
    }
}

*/

/* *****56.Print the sum of first 'n' natural numbers, where 'n' is to be taken  from the  user.***** 
class TenthClass{
    public static void print_sum(int n, int sum, int i){
        if(i == n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        print_sum(n, sum, i+1);

    }
    public static void main(String[] args){
        System.out.println("Enter the number whose factorial is to be found:");
        Scanner sc = new Scanner(System.in);
        int req_num = sc.nextInt();
        System.out.println("The sum of first "+ req_num +" natural numbers is:");
        print_sum(req_num, 0, 1);
        
    }
}

*/

/* *****57.Print the factorial of a number 'n' , where 'n' is to be taken  from the  user.***** 

import java.util.*;
class TenthClass{
    public static void p_fac(int fact, int n){
        //Base case -->
        if(n==0){
            System.out.println(fact);
            return;
        }

        //Recursion -->
        fact*=n;
        p_fac(fact, n-1);
    }
    public static void main(String[] args){
        System.out.println("Enter the number whose factorial is to be found:");
        Scanner sc = new Scanner(System.in);
        int req_num = sc.nextInt();
        System.out.println("The factorial of the required number is:");
        p_fac(1, req_num);
        sc.close();
    }
}

*/

/* *****58.Print the fibonacci sequence upto 'n' numbers, where 'n' is to be taken  from the  user.***** 
import java.util.*;
class TenthClass{
    public static void fib(int a,int b,int n){
        //Base Case -->
        if(n==0){
            return;
        }
        
        //Work to be done -->
        int c=a+b;
        System.out.println(c);
        
        //Recursion -->
        fib(b, c, n-1);
    }

    public static void main(String[] args) {
        
        System.out.println("Enter the number of terms you want in your fibonacci sequence:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 

        int a=0 , b=1;
        System.out.println(a);
        System.out.println(b);
        fib(a, b, n-2);

        sc.close();
    }
}

*/

/* *****59.Print x^n (with stack height = n) where 'x' and 'n' are to be taken as an input from the user.***** 
import java.util.*;
class TenthClass{
    
    public static int print_power(int bse , int pow ){

        //Base Case -->
        if (pow == 0){
            return 1;
        }

        if(bse == 0){
            return 0;
        }

        //Recursion -->
        int new_bse=print_power(bse, pow-1);
        //Work to be done -->
        bse = bse*new_bse;
        return bse;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of 'x':");
        int x=sc.nextInt();
        System.out.println("Enter the value of 'n':");
        int n=sc.nextInt();
        int result = print_power(x, n);
        System.out.println("The required result is:" + result);
        sc.close();

    }
}

*/

/* *****60.Print x^n ( with stack height = log(n) ) where 'x' and 'n' are to be taken as an input from the user. *****
import java.util.*;
class TenthClass{
    public static int print_pow_2(int bse, int pow){
        if (pow==0){
            return 1;
        }

        if(pow%2 == 0){
            return print_pow_2(bse, pow/2) * print_pow_2(bse, pow/2);
        }

        else{
            return bse*print_pow_2(bse, pow/2)*print_pow_2(bse, pow/2);
        }
    }
    
    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base:");
        int bse = sc.nextInt();
        System.out.println("Enter the power to which the base is to be raised:");
        int pow=sc.nextInt();


        int result = print_pow_2(bse, pow);
        System.out.println("The value of"+bse+"raised to the power of "+pow+" is="+result);
        sc.close();
        
    }

}

*/

/* *****61.Tower of Hanoi --> Transfer n disks fron source to the destination tower with the help of a helper tower.Here the value of 'n' is to be 
taken from the user. *****

import java.util.*;

class TenthClass{

    public static void Tower_Of_Hanoi(int n, String src, String helper, String dest){

        //Base Case
        if (n==1){
            System.out.println("Transfer disk " +n+ " from "+src+" to "+dest);
            return;
        }

        //Transfer (n-1) disks from the source tower to the helper tower, using destination tower as the helper.
        Tower_Of_Hanoi(n-1, src, dest, helper);

        //Transfer nth disk from the source tower to the destination tower, using the helper tower as the helper.
        System.out.println("Transfer disk " +n+ " from "+src+" to "+dest);

        //Transfer the (n-1) disks from the helper tower to the destination tower, using source tower as the helper.
        Tower_Of_Hanoi(n-1, helper, dest, src);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of disks in the source tower:");
        int n = sc.nextInt();

        System.out.println("\nLet the source tower be 'A',\nthe helper tower be 'B',\nthe destination tower be 'C'.\n");
        Tower_Of_Hanoi(n, "A","B", "C");

        sc.close();

    }
}

 */

/* *****62.Print the given string in reversed order.***** 

import java.util.*;
class TenthClass{
    public static String rev_str(String str) {
       
        //Base Case -->
        if (str.length()==1){
            return str;
        }  
        
        char currchar =str.charAt(0);
        String next_string = rev_str(str.substring(1));
        return next_string+currchar;
    }

    public static void main(String args[]) {
        System.out.println("Please enter the string that you want to be reversed:");
        Scanner sc = new Scanner(System.in);
        String a= sc.nextLine();

        String reversed_string = rev_str(a);
       
        System.out.println("The string provided by you is: "+a);
        System.out.println("The reversed string is:"+reversed_string);

        sc.close();
    }
    
}

*/

/* *****63.Find the first and the last occurence of an element in a given string.***** 
import java.util.*;

class TenthClass{
    
    public static int first = -1;
    public static int last = -1;


    public static void find_occur(String str,char elem,int ind){
        //Base Case -->
        if (ind==(str.length()-1)){
            return;
        }

        if(str.charAt(ind)==elem){
            if(first==-1){
                first = ind;
            }else{
                last = ind;
            }

        }

        find_occur(str, elem, (ind+1));
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the string where you want to find the indices of a particular element:");
        String str = sc.nextLine();

        System.out.println("Enter the element which you want to find in the string:");
        String elem = sc.next();
        

        find_occur(str, elem.charAt(0), 0);

        System.out.println("First occurence is at:"+first);
        System.out.println("Last occurence is at:"+last);
        sc.close();
    }
}

*/

/* *****64.Check if the array given by an user is sorted (strictly increasing).*****  
import java.util.*;
class TenthClass{
    public static boolean Check_If_Incr(int arr[] , int idx){
        if (idx == (arr.length-1)){
            return true;
        }

        if(arr[idx]>=arr[idx+1]){
            //arrray is unsorted.
            return false;
        }

        return Check_If_Incr(arr,idx+1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of your array:");
        int size=sc.nextInt();
        int arr[]= new int[size];

        System.out.println("Enter the values in the array:");
        for (int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        if(Check_If_Incr(arr, 0)){
            System.out.println("It is a strictly increasing array.");
        }else{
            System.out.println("It is not a strictly increasing array.");
        }

        sc.close();
    }
}

*/

/* *****65.Move all the 'x' in a string to its end, where the string is to be provided by the user.***** 
import java.util.*;
class TenthClass{
    
    //Function to add strings to the end of the given string.
    public static String add_x(int count) {
        String newstr="";
        for (int i=0;i<count;i++){
            newstr+="x";
        }

        return newstr;
    }
    
    //Function to fetch all the string.
    public static String get_all_x(String str , int idx , int count_of_x) {
        //Base Case -->
        if(idx==str.length()){
            return add_x(count_of_x);
        }


        if (str.charAt(idx)=='x'){
            return get_all_x(str,(idx+1),(count_of_x+1));

        }else{
            String next_str=get_all_x(str,(idx+1),(count_of_x));
            return str.charAt(idx)+next_str;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        System.out.println("Enter any string of your choice which contains 'x' in it:");
        String inp_string = sc.next();


        String mod_string = get_all_x(inp_string, 0, count);
        System.out.println(mod_string); 

        sc.close();
    }
}

*/

	/* *****66.Remove all the duplicates in a string given by the user.***** */
/*
import java.util.*;
class TenthClass{

    public static boolean[] map = new boolean[26];
		public static void remove_dup(String str, int idx , String new_str) {
        //Base Case -->
        if(idx == str.length()){
            System.out.println("After removing the duplicates from the given string the new string is:"+new_str);
            return;
        }

        char cur_char=str.charAt(idx);
        if(map[cur_char - 'a'] == true){
            remove_dup(str, idx+1, new_str);
        }else{
            new_str+=cur_char;
            map[cur_char-'a'] = true;
            remove_dup(str, idx+1, new_str);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string whose duplicate charaters are to be removed:");
        String str = sc.next();

        remove_dup(str,0, "");
        sc.close();
    }
}

*/
