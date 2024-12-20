package com.strings.ques;

public class StringQues {

	//checks string are equal or what
	public static void checkEquals(String str1 ,String str2) {
		
		//s1 > s2: +ve
		//s1 == s2 : 0
		//s1 < s2 : -ve value
		
		if(str1.compareTo(str2)==0) {
			System.out.println("It is equal");
		}
		else {
			System.out.println("It is not");
		}
	}
	
	
	public static void stringBuilderFunction() {
		StringBuilder sb = new StringBuilder("Tony");
		
		//to set/replace character
		sb.setCharAt(0, 'B');
		System.out.println(sb);
		
		//to insert character in string
		sb.insert(2, 'n');
		System.out.println(sb);
		
		//to delete character in string
		sb.delete(3,sb.length());
		System.out.println(sb);
	}
	
	//reverse the string using StringBuilder
	
	public static String reverseBuilderString(String name) {
		StringBuilder sbld = new StringBuilder(name);
		
	    for(int i=0; i<sbld.length()/2; i++) {
	    	int front  = i;
	    	int back = sbld.length()-1-i;
	    	
	    	char frontChar = sbld.charAt(front);
	    	char backChar = sbld.charAt(back);
	    	
	    	sbld.setCharAt(front, backChar);
	    	sbld.setCharAt(back, frontChar);
	    	
	    }
	    name = sbld.toString();
	    return  name;
	}
	

	
	
	public static void main(String[] args) {
		
		String s1 = "Tony";
		String s2 = "Tony";
//		checkEquals(s1,s2);
		
//		String name = "My name is Chirag Deshmukh";
//		System.out.println(name.substring(11,17));
		
		//convert string to integer
//		String num = "123";
//         int x = Integer.parseInt(num);
//         System.out.println(x);
		
		stringBuilderFunction();
		
		String n = reverseBuilderString("hello");
		System.out.println(n);
	}
}
