package com.recursion;

public class Recursion3 {
	// find the permutation of the string
	// 3!

	public static void printPermutation(String str, String permutation) {
		if (str.length() == 0) {
			System.out.println(permutation);
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char currChar = str.charAt(i);
			String newString = str.substring(0, i) + str.substring(i + 1);
			printPermutation(newString, permutation + currChar);
		}
	}
	
	// count the number of path in maze to move from (0,0) to (n,m)

	public static int countPath(int i, int j, int n, int m) {
		if (i == n || j == m) {
			return 0;
		}
		if (i == n - 1 && j == m - 1) {
			return 1;
		}

		// move downward
		int downPaths = countPath(i + 1, j, n, m);

		// move rightside

		int rightPaths = countPath(i, j + 1, n, m);

		return downPaths + rightPaths;
	}
	
	// Find the number of ways in which you can invite n people to your party , single or in pair.
	public static int callGuest(int n) {
		if(n<=1) {
			return 1;
		}
		int oneWay = callGuest(n - 1);
		
		int secondWay = (n-1)* callGuest(n-2);
		
		return oneWay + secondWay;
	}


	public static void main(String[] args) {
		
		String str  = "abc";
		printPermutation(str,"");
		
		int n = 3, m = 3;
		int totalPath = countPath(0, 0, n, m);
		System.out.println(totalPath);
		
		int ways = callGuest(4);
		System.out.println(ways);
	}
}
