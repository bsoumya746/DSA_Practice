/* You are given a string s, partition it in such a way that every substring is a palindrome. Return all such palindromic partitions of s. */

/*
 
import java.util.*;
class Palindrome_Partitioning {

	//Function to add each and every subsequence in the path arrayList
  public static ArrayList<ArrayList<String>> partition(String s) {
		ArrayList<ArrayList<String>> res = new ArrayList<>(); 
    ArrayList<String> path = new ArrayList<>();
    func(0, s, path, res);
    return res;
  }
    
	
	//Function to create and add the substring in 'res' named arrayList
	public static void func(int index, String s, ArrayList<String> path, ArrayList<ArrayList<String>> res) {
		if(index == s.length()) {
			res.add(new ArrayList<>(path));
			return;
		}
		for(int i = index; i < s.length(); ++i) {
			if(isPalindrome(s, index, i)) {
				path.add(s.substring(index, i+1));
				func(i+1, s, path, res);
				path.remove(path.size()-1);
			}
		}	
  }
    
  //Function to check whether a string is palindrome or not -->
	public static boolean isPalindrome(String s, int start, int end) {
		while(start <= end) {
			if(s.charAt(start++) != s.charAt(end--)){
				return false;
      }
      return true;
    }
		return false;
	}


	public static void main(String args[]) {
		String s = "aabb";
		ArrayList < ArrayList < String >> ans = partition(s);
    int n = ans.size();
    System.out.println("The Palindromic partitions are :-");
    System.out.print(" [ ");
    for (int i = 0; i<n; i++) {
			System.out.print("[ ");
			for (int j = 0; j < ans.get(i).size(); j++) {
        System.out.print(ans.get(i).get(j) + " ");
      }
			System.out.print("] ");
      }
    System.out.print("]");


  }

}

*/ 

