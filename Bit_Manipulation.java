



//_______________________________________________BIT MANIPULATION________________________________________________________





/* *****49.Example related to 'GET-BIT' Operation.***** 
class NinthClass{
    public static void main(String args[]){
        int n=5;
        int position=2;
        int bit_msk = 1<<position;

        if((bit_msk & n)==0){
            System.out.println("The required bit is zero.");
        }else{
            System.out.println("The required bit is one.");
        }
    }
}
*/

/* *****50.Example related to 'SET-BIT' Operation.***** 
class NinthClass{
    public static void main(String args[]){
        int n=5;
        int position=1;
        int bit_mask=1<<position;

        int new_number=(bit_mask|n);
        System.out.println("After setting the required bit the new number is:"+new_number);
    }
}

*/

/* *****51.Example related to 'CLEAR-BIT' Operation.***** 
class NinthClass{
    public static void main(String args[]){
        int n=7;
        int position=2;
        int Bit_mask=(1<<position);

        int new_number=(~(Bit_mask) & n);
        System.out.println("The new number after clearing the required bit is:"+new_number);
    }
}

*/

/* *****52.Example related to 'UPDATE-BIT' Operation (With Zero).***** 
class NinthClass{
    public static void main(String[] args){
        int n=7; //0111
        int position=2;
        int bit_mask=(1<<position);
        
        int updt_num = ((n) & (~(bit_mask)));
        System.out.println("After updating the required bit to zero the new number is:"+updt_num);
        
    }
}

*/

/* *****53.Example related to 'UPDATE-BIT' Operation (With One).***** 
class NinthClass{
    public static void main(String[] args){
        int n=5; //0101
        int position=1;
        int bit_mask=(1<<position);
        
        int updt_num = (n | bit_mask);
        System.out.println("After updating the required bit to zero the new number is:"+updt_num);
        
    }
}

*/

