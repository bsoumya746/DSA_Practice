/* Given an array of distinct integers, and a 'target' integer, return a list of all unique combinations of the array where the chosen numbers sum to 'target' integer. */
 
/*

import java.util.*;

class Combination_Sum {

    public static void findCombinations(int ind, int arr[], int target, ArrayList < ArrayList < Integer >> ans, ArrayList < Integer > ds) {
        if (ind == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList <Integer> (ds));
            }
            return;
        }

        if (arr[ind] <= target) {
            ds.add(arr[ind]);
            findCombinations(ind, arr, target - arr[ind], ans, ds);
            ds.remove(ds.size() - 1);
        }
        findCombinations(ind + 1, arr, target, ans, ds);
    }

    public static ArrayList < ArrayList < Integer >> combinationSum (int candidates[], int target) {
        ArrayList < ArrayList < Integer >> ans = new ArrayList < ArrayList<Integer>> ();
        findCombinations(0, candidates, target, ans, new ArrayList <Integer > ());
        return ans;
    }

   public static void main(String args[]) {
		System.out.println("Enter the number of elements in your array:");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the elements in your array:");
		for(int i =0;i<size;i++){
			arr[i]=sc.nextInt();
		}

		System.out.println("Enter the value of target:");
		int target=sc.nextInt();

		
		ArrayList < ArrayList < Integer >> comb = combinationSum(arr, target);
		System.out.println(comb.toString());

		sc.close();
  }

    
}


*/ 


/* Given an array of distinct integers, and a 'target' integer, return a list of all unique combinations of the array where the chosen numbers sum to 'target' integer provided same array element can't be repeated. */

/*

import java.util.*;

class Combination_Sum{

	static void findCombinations(int ind, int arr[], int target, ArrayList < ArrayList < Integer >> ans , ArrayList < Integer > ds) {
		if (target == 0) {
			ans.add(new ArrayList < Integer> (ds));
      return;
    }

    for (int i = ind; i < arr.length; i++) {
			if (i > ind && arr[i] == arr[i - 1]){
				continue;
			}
      if (arr[i] > target){
				break;
			}
      ds.add(arr[i]);
			findCombinations(i + 1, arr, target - arr[i], ans, ds);
			ds.remove(ds.size() - 1);
    }
  }
  
	
	public static ArrayList < ArrayList < Integer > > combinationSum2(int candidates[], int target) {
		ArrayList < ArrayList < Integer >> ans = new ArrayList <ArrayList<Integer> > ();
    Arrays.sort(candidates);
    findCombinations(0, candidates, target, ans, new ArrayList <Integer > ());
    return ans;
  }

  public static void main(String args[]) {
		System.out.println("Enter the number of elements in your array:");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the elements in your array:");
		for(int i =0;i<size;i++){
			arr[i]=sc.nextInt();
		}

		System.out.println("Enter the value of target:");
		int target=sc.nextInt();

		
		ArrayList < ArrayList < Integer >> comb = combinationSum2(arr, target);
		System.out.println(comb.toString());

		sc.close();
  }
}


*/ 



