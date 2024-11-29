package com.ques;

import java.util.Stack;

public class StackB {

	// ------------------- Pust at Bottom --------------------
	public static void pushAtBottom(Stack<Integer> s, int n) {
		if (s.isEmpty()) {
			s.push(n);
			return;
		}

		int top = s.pop();
		pushAtBottom(s, n);
		s.push(top);

	}
	
	// --------------- Reverse String ----------------
	public static String reverseString(String str) {
		
		Stack<Character> s = new Stack<Character>();
		int idx = 0;
		while(idx!= str.length()) {
			 s.push(str.charAt(idx));
			 idx++;
		}
		StringBuilder sb = new StringBuilder();
		while(!s.empty()) {
			char ch = s.pop();
			sb.append(ch);
		}
		return sb.toString();
	}
	
	//--------------- reverse stack --------------
	public static void reverse(Stack<Integer> s) {
		if(s.isEmpty()) {
			return;
		}
		
		
		int top = s.pop();
		reverse(s);
		pushAtBottom(s, top);
	}
	
	// --------------- print stack ------------- 
	public static void print(Stack<Integer> s) {
		
		while(!s.isEmpty()) {
			System.out.print(" "+s.pop());
		}
		
	} 
	
	

	public static void main(String[] args) {
//		String name = "Chirag";
//		String s = reverseString(name);
//		System.out.print(s);
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		print(s);
		System.out.println();
		reverse(s);
//		
        print(s);
	
	}
}
