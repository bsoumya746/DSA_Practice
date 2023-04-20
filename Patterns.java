

//_______________________________________________PATTERN RELATED PROGRAMS________________________________________________________






/* *****19.Print the pattern 'Solid Rectangle' by taking the input of the number of rows and columns from the user--   *****
Eg:-
     ********
     ********
     ********
     ********
     ********
     ********



class FourthClass{
    public static void main(String args[]) {
        System.out.println("Enter the number of rows and columns that you want in your solid rectangle.");
        Scanner sc= new Scanner(System.in);
        System.out.print("Rows:");
        int rw=sc.nextInt();
        System.out.print("Columns:");
        int col=sc.nextInt();
        sc.close();


        for(int a=1;a<=rw;a++){
            for (int b=1;b<=col;b++){
                //for every row a less than equal to rw, there will be b number of columns which is less than equal to col 
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

*/

/* *****20.Print the pattern 'Hollow Rectangle' by taking the input of the number of rows and columns from the user--   *****

Eg:-
     ********
     *      *
     *      *
     *      *
     *      *
     ********

*/

import java.util.*;
class FourthClass{
    public static void main(String args[]){
       System.out.println("Enter the number of rows and columns that you want in your hollow rectangle.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows:");
        int rw=sc.nextInt();
        System.out.print("Columns:");
        int col = sc.nextInt();
        sc.close();
        
        for(int a=1;a<=rw;a++){
            for (int b=1;b<=col;b++){
                //cells ->(rw,col)
                //for every row 'a' , a particular column 'b' is filled according to the check given below.
                if (a==1 || b ==1 || a==rw || b==col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
        System.out.println();
        
        }


    }
}





/* *****21.Print the pattern 'Half Pyramid' -- ***** 
 * 
 * * 
 * * * 
 * * * * 
 * * * * * 


class FourthClass{
    public static void main(String args[]){
        for (int rw=1;rw<=5;rw++){
            for(int col=1;col<=rw;col++){
                //For first row there will be one column ,i.e, one star will be printed 
                //and as the row number increases by one, column number also increases by one.
                System.out.print("*");
            }
        System.out.println(" ");
        }
    }
}

*/

/* *****22.Print the pattern 'Inverted Half Pyramid' -- *****
* * * * *
* * * *
* * *
* *
*

class FourthClass{
    public static void main(String args[]){
        for (int rw=1;rw<=5;rw++){
            for(int col=5;col>=rw;col--){
                //For first row there will be five columns ,i.e, five stars will be printed 
                //and as the row number increases by one column number decreases by one.
                System.out.print("*");
            }
        System.out.println(" ");
        }
    }
}

*/ 

/* *****23.Print the pattern 'Inverted Half Pyramid Roatated By 180 Degree' -- *****
        *
      * *
    * * *
  * * * *
* * * * *


// using one two for loops
// class FourthClass{
//     public static void main(String args[]){
//         int a=0;
//         for (int rw=1;rw<=5;rw++){
//             for(int col=5;col>=(rw-a);col--){
//                 //For every row there will be five columns ,i.e, four blank spaces and one star will be printed 
//                 //and as the row number increases by one, blank space number decreases by one and star number increases by one.
//                 if (col>rw){
//                     System.out.print(" ");
//                 }else if (col == rw | col<rw){
//                     System.out.print("*");
//                 }
//             }
//             a++;
//         System.out.println(" ");
//         }
//     }
// }


//using three for loops
// class FourthClass{
//     public static void main(String args[]) {
//         for (int rw=1;rw<=5;rw++){
//             for (int col=1;col<=(5-rw);col++){
//                 //In every row it will print (5-rw) number of columns ,i.e, (5-rw) number of gaps
//                 System.out.print(" ");
//             }
//             for(int col=1;col<=rw;col++){
//                 //In every row it will print (rw) number of columns ,i.e, (rw) number of stars
//                 System.out.print("*");
//             }
//         System.out.println();
//         }
//     }
// }


*/

/* *****24.Print the pattern 'Half Pyramid With Numbers' -- *****
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

class FourthClass{
    public static void main(String args[]){
        int n=6;
        for (int rw=1;rw<=n;rw++){
            for(int col=1;col<=rw;col++){
                System.out.print(col);
                //In the first row it will print one column, i.e, it will print only 1.
                //After that as row number increases ,column number also increases by one. 
            }
        System.out.println();
        }
    }
}

*/

/* *****25.Print the pattern 'Inverted Half Pyramid With Numbers' -- *****

1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

class FourthClass{
    public static void main(String args[]){
        int num=1;
        for (int rw=1;rw<=5;rw++){
            for(int col=5;col>=rw;col--){
                //In the first row it will print five columns, i.e, it will print only 1 to 5.
                //After that as row number increases ,column number decreases by one. 
                System.out.print(num);
                num++;
            }
            num=1;
        System.out.println(" ");
        }
    }
}

*/

/* *****26.Print the pattern 'Floyd's Triangle' -- *****

1
2   3
4   5   6
7   8   9   10
11  12  13  14  15 


class FourthClass{
    public static void main(String args[]){
        int num=1; 
        int n=5;
        for (int rw=1;rw<=n;rw++){
            for(int col=1;col<=rw;col++){
                System.out.print(num+"  ");
                num++;
                //In the first row it will print one column, i.e, it will print only 1.
                //After that as row number increases ,column number also increases by one and it will print two consecutive numbers after one. 
            }
        System.out.println();
        }
    }
}
*/

/* *****27.Print the pattern '(0-1) Triangle' -- *****
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

class FourthClass{
    public static void main(String args[]){
        int n=5;
        for (int rw=1;rw<=n;rw++){
            for (int col=1;col<=rw;col++){
                if ((rw+col)%2==0 ){
                    System.out.print("1  ");
                }else{
                    System.out.print("0  ");
                }
            }
            System.out.println();
        }
    }
}

*/

/* *****28.Print the pattern 'Solid Butterfly' -- *****

*                *
* *            * *
* * *        * * *
* * * *    * * * *
* * * * ** * * * *
* * * * ** * * * *
* * * *    * * * *
* * *        * * *
* *            * *
*                *



class FourthClass{
    public static void main(String args[]){
        int n=5;
        //upper half
        for(int i=1;i<=n;i++){
            //1st Part Stars
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //1st Part Spaces
            int spaces=2*(n-i);
            for (int k=1; k<=spaces;k++){
                System.out.print("  ");
            }
                //2nd Part Stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");

            }
            System.out.println();  
        }

        //lower half
        for(int i=n;i>=1;i--){
            //1st Part Stars
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //1st Part Spaces
            int spaces=2*(n-i);
            for (int k=1; k<=spaces;k++){
                System.out.print("  ");
            }
                //2nd Part Stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");

            }
            System.out.println();  
        }
    }
}
        
*/

/* *****29.Print the pattern 'Solid Rhombus' -- ***** 
        * * * * *
      * * * * *
    * * * * *
  * * * * *
* * * * * 


class FourthClass{
    public static void main(String args[]){
        int n=5;
        for (int rw=(n-1);rw>=0;rw--){
            for (int a=1;a<=rw;a++){
                //It will print (n-1) spaces in the first row
                System.out.print(" ");
            }

        System.out.print("* * * * *");
        System.out.println();
        }
    }
}

*/

/* *****30.Print the pattern 'Number Pyramid' -- ***** 
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5

 class FourthClass{
    public static void main(String args[]){
        int n=5;
        
        for(int i=1;i<=n;i++){
            //spaces
            for (int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            //numbers->print row number,row number times.
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
        System.out.println();
        }
    }
}


*/

/* *****31.Print the pattern 'Palindromic Pyramid' -- *****
        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4 
5 4 3 2 1 2 3 4 5


class FourthClass{
    public static void main(String args[]){
        int n=5;

        for (int i=1;i<=n;i++){
            //spaces->
            for (int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            
            // numbers(part one)->
            
            //         1
            //        21
            //       321
            //      4321
            //     54321
             
            for (int j=i;j>=1;j--){
                System.out.print(j);
            }

           
            // numbers (part two)->
                    
            //          2
            //          23
            //          234
            //          2345
            
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
        System.out.println();

         }
    }
}

*/

/* *****32.Print the pattern 'Solid Diamond' -- ***** 
   *
  ***
 *****
*******
*******
 *****
  ***
   *




class FourthClass{
    public static void main(String args[]){
        int n=4;

        for (int i=1;i<=n;i++){
            //spaces for upper half
            for (int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //stars for upper half(part-01)
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
        //     Till now->
        //      *
        //     **
        //    ***
        //   ****
             //stars for upper half(part-02)
             for (int j=2;j<=i;j++){
                System.out.print("*");
            } 
        //     Till now->
        //      *
        //     ***
        //    *****
        //   *******
            System.out.println();
        } 
        for (int i=1;i<=n;i++){ 
            //spaces for lower half
            for (int j=1;j<i;j++){
                System.out.print(" ");
            }
        //     Till Now->
        //      *
        //     ***
        //    *****
        //   *******
        //   ****
        //    ***
        //     **
        //      *
            //stars for lower half(part-01)
            for (int j=n;j>=i;j--){
                System.out.print("*");
            }
            //stars for lower half(part-02)
            for (int j=(n-1);j>=i;j--){
                System.out.print("*");
            }
        //    // Finally->
        //     *
        //    ***
        //   *****
        //  *******
        //  *******
        //   *****
        //    ***
        //     *

        System.out.println();
        } 
    }
    
}

*/


