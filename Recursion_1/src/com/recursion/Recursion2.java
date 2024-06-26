package com.recursion;

import java.util.HashSet;

public class Recursion2 {

//	-----------------------------------------------------------------------------------------------------------	
//	Tower of hanoi

	public static void towerOfHanoi(int n, String src, String helper, String dest) {
		if (n == 1) {
			System.out.println("transfer " + n + " from " + src + " to " + dest);
			return;
		}

		towerOfHanoi(n - 1, src, dest, helper);
		System.out.println("transfer " + n + " from " + src + " to " + dest);
		towerOfHanoi(n - 1, helper, src, dest);
	}

//	-----------------------------------------------------------------------------------------------------------	
//	Reverse a String 
	public void reverse(String name, int index) {
		if (index < 0) {
			return;
		}
		System.out.print(name.charAt(index));
		reverse(name, index - 1);

	}

//	-----------------------------------------------------------------------------------------------------------
//	find first and last occurence of a character in a string
//  Time complexity is O(n) where n is length of our string	

	public static int first = -1;
	public static int last = -1;

	public static void occurence(String str, int idx, char element) {
		if (idx == str.length()) {
			System.out.println(first);
			System.out.println(last);
			return;
		}

		char currChar = str.charAt(idx);
		if (currChar == element) {
			if (first == -1) {
				first = idx;
			} else {
				last = idx;
			}
		}

		occurence(str, idx + 1, element);
	}

//	-----------------------------------------------------------------------------------------------------------

//	Pushing char 'x' at last in the string
// Time Complexity : O(n)

	public static void printLast(String str, int index, String newString, int count) {
		if (index == str.length()) {
			for (int i = 0; i < count; i++) {
				newString += 'x';
			}
			System.out.println(newString);
			return;
		}

		char currChar = str.charAt(index);
		if (currChar == 'x') {
			count++;
		} else {
			newString += currChar;
		}

		printLast(str, index + 1, newString, count);

	}

	// secound way
//	public static void printLast(String str , int idx , char element,int count, String newString) {
//		if(idx == str.length()) {
//			for(int i = 0; i<count; i++) {
//				newString+=element;
//			}
//			System.out.println(newString);
//			return;
//		}
//		
//		char currChar = str.charAt(idx);
//		if(currChar==element) {
//			count++;
//			printLast(str, idx+1, element,count,newString);
//		}
//		else {
//			newString+=currChar;
//			printLast(str,idx+1,element,count,newString);
//			
//		}
//		
//		
//	}

	// ---------------------------------------------------------------------------------------------------------------------
	// remove the duplicate element
	public static boolean[] map = new boolean[26];

	public static void removeDuplicate(String str, int idx, String newString) {
		if (idx == str.length()) {
			System.out.println(newString);
			return;
		}

		char currChar = str.charAt(idx);
		if (map[currChar - 'a'] == true) {
			removeDuplicate(str, idx + 1, newString);
		} else {
			newString += currChar;
			map[currChar - 'a'] = true;
			removeDuplicate(str, idx + 1, newString);

		}
	}

//====================================================================================================================
	// find array is unsorted or not
	// time complexity is O(n)

	public static boolean isSorted(int arr[], int idx) {
		if (idx == arr.length - 1) {
			return true;
		}

		if (arr[idx] < arr[idx + 1]) {
			// array is sorted till now
			return isSorted(arr, idx + 1);
		} else {
			return false;
		}
	}

//====================================================================================================================
	// print all subsequence
	// Time complexity is = O(2^n)

	public static void subsequences(String str, int idx, String newString) {

		if (idx == str.length()) {
			System.out.println(newString);
			return;
		}

		char currChar = str.charAt(idx);

		// to be
		subsequences(str, idx + 1, newString + currChar);

		// not to be
		subsequences(str, idx + 1, newString);
	}

//====================================================================================================================
	// print the unique subsequences

	public static void uniqueSubsequence(String str, int idx, String newString, HashSet<String> set) {
		if (idx == str.length()) {
			if (set.contains(newString)) {
				return;
			} else {
				System.out.println(newString);
				set.add(newString);
				return;
			}
		}

		char currChar = str.charAt(idx);
		// to be
		uniqueSubsequence(str, idx + 1, newString + currChar, set);

		// not to be
		uniqueSubsequence(str, idx + 1, newString, set);

	}

	
//   =======================================================================================================
	
	
	public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

	public static void printComb(String str, int idx, String combination) {
		if (idx == str.length()) {
			System.out.println(combination);
			return;
		}

		char currChar = str.charAt(idx);
		String mapping = keypad[currChar - '0'];

		for (int i = 0; i < mapping.length(); i++) {
			printComb(str, idx + 1, combination + mapping.charAt(i));
		}
	}
//====================================================================================================================

	public static void main(String[] args) {
		// Tower Of Hanoi
//		int n = 2;
//		towerOfHanoi(n, "S", "H", "D");

		// Reverse a String
//		RoughWork rg = new RoughWork();
//		String name = "chirag";

		// First and last index of an element
//		String str = "abaacdaefaah";
//		occurence(str, 0, 'a');

		// putting last 'x'
//		String str2 = "axbcxxd";
//		printLast(str2, 0, "", 0);

		// find array is unsorted or not
//		int arr[] = {1,2,3,4};
//		boolean value = isSorted(arr,0);
//		System.out.println(value);

		// print all the subsequences
//        String str = "abc";
//		subsequences(str,0,"");     

		// print unique subsequeces
//		String str = "aaa";
//		HashSet<String> set = new HashSet<String>();
//		
//		uniqueSubsequence(str, 0, "", set);
		
//		String str = "23";
//		printComb(str,0,"");

	}
}
