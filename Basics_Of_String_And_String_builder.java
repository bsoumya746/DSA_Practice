



//_______________________________________________STRINGS AND STRING_BUILDER IN JAVA ________________________________________________________




/* *****46.Given two strings of lowercase English letters,A and B, perform the following operations:

i)Sum the lengths of A and B .
ii)Determine if A is lexicographically larger than B (i.e.: does B comes before A in the dictionary?).
iii)Capitalize the first letter in A and B and print them on a single line, separated by a space.

*Input Format*
The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.

*Output Format*
There are three lines of output:
For the first line, sum the lengths of A and B .
For the second line, write 'Yes' if A is lexicographically greater than B, otherwise print 'No' instead.
For the third line, capitalize the first letter in both A and B, and print them on a single line, separated by a space. *****


 import java.util.*;

class SeventhClass {
 
     public static void main(String[] args) {
         
         Scanner sc=new Scanner(System.in);
         String A=sc.next();
         String B=sc.next();
         
         System.out.println((A.length()+B.length()));
         if (A.compareTo(B)>0){
             System.out.println("Yes");
         }else{
             System.out.println("No");
         }
         
         String str1=A.substring(0,1).toUpperCase()+A.substring(1);
         String str2=B.substring(0,1).toUpperCase()+B.substring(1);
         System.out.println(str1+" "+str2); 
         sc.close();      
     }
 }

 */

/* *****47.Take a string as an input from the user and reverse it.*****

import java.util.Scanner;
class SeventhClass{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to be reversed:");
        String  a = sc.next();
        StringBuilder sb=new StringBuilder("");
        sb.append(a);
        
        for (int i=0;i<sb.length()/2;i++){
            int front_in = i;
            int back_in = sb.length()-1-i;

            char frontchar = sb.charAt(front_in);
            char backchar = sb.charAt(back_in);
            
            sb.setCharAt(front_in, backchar);
            sb.setCharAt(back_in,frontchar);
        }

        System.out.println("The reversed string is: "+sb);
        sc.close();

    }
}

 */

 