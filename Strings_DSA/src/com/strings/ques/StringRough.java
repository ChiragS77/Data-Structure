package com.strings.ques;

public class StringRough {

	public static void main(String[] args) {

		String s[] = "i like this program very much".split(" ");
		String ans = "";
		for (int i = s.length - 1; i >= 0; i--) {
			ans += s[i] + " ";
		}

		System.out.println(ans.substring(0, ans.length() - 1));
		
		String str[] = "I am Chirag Deshmukh".split(" ");
		
		String newStr ="";
		for(int i = str.length-1; i>=0; i--) {
			newStr+=str[i] + " ";
		}
		System.out.println(newStr.substring(0, newStr.length()));
		
		
	}
}
