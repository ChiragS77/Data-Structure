package com.strings.ques;

public class String_DSA {
	
	// ------------ Reverse the String -------------
	//1st way
	public static String reverseString(String orig)
	{
	    char[] s = orig.toCharArray();
	    int n = s.length;
	    int halfLength = n / 2;
	    for (int i=0; i<halfLength; i++)
	    {
	        char temp = s[i];
	        s[i] = s[n-1-i];
	        s[n-1-i] = temp;
	    }
	    return new String(s);
	}
	
	//2nd way
	public static String reverseStringUsing2pointer(String orig) {
		
		int start =0;
		int end = orig.length()-1;
		char ary[] = orig.toCharArray();
		
		while(start<end) {
			
			char temp = ary[start];
			ary[start] = ary[end];
			ary[end] = ary[start];
			start++;
			end--;
		}
		return new String(ary);
	}
	
// <------------------------> Reverse the sentence in the string <------------------->
//                        <--------- 1st way -------->
//                              Time Complexity O(N)
	public static void reverse(char str[], int start ,int end) {
		
		while(start<=end) {
			char temp = str[start];
			str[start] = str[end];
			str[end] = temp;
			start++;
			end--;
		}
		
	}
	
	static String reverseWords(char s[]) {
		int start =0;
		
		for(int end =0; end<s.length;end++) {
			if(s[end]==' ') {
				reverse(s,start,end);
				start = end + 1;
			}
		}
		
		//reverse the last word
		reverse(s ,start,s.length-1);
		
		//reverse the whole string
		reverse(s ,0, s.length-1);
		
		return new String(s);
	}
	
	public void reverseUsingSubstring(String str) {
		
		String s[] = str.split(" ");
		
		String newStr = "";
		
		for(int i= s.length-1; i>=0; i--) {
			newStr+=s[i] + " ";
		}
		System.out.println(newStr.substring(0));
		
	}
//<----------------------> Minimum length in string array <---------------------->
	
	public static int findMin(String arr[]) {
		int min = arr[0].length();
		
		for(int i =1; i<arr.length; i++) {
			if(min<arr[i].length()) {
				min = arr[i].length();
			}
		}
		return min;
	}
	
// <----------------------------> Longest common Prefix  <---------------------------->
	//compare word to word
	public static String commanPrefixUtils(String str1, String str2) {
		int n1 = str1.length();  int n2 = str2.length() ;
		
		String result="";
		
		for(int i=0,j=0; i<n1 && j<n2;i++ ,j++) 
		{
			if(str1.charAt(i)!=str2.charAt(j)) {
				break;
			}
			result+=str1.charAt(i);
			
		}
		return result;
	}
	
	
	public static String commanPrefix(String str[], int len) {
		String prefix = str[0];
		for(int i=1 ; i<len; i++) {
			prefix = commanPrefixUtils(prefix,str[i]);
		}
		
		return prefix;
	}
	
	//compare character to character 
	
	public static String commanPrefix2(String str[] , int len) {
		int minLength = findMin(str);
		String result = "";
		char current;
		
		for(int i=0; i <= minLength; i++) {
			current = str[i].charAt(i);
			
			for(int j =1; j<str.length; j++) {
				if(str[j].charAt(i)!=current) {
					return result;
				}
			
			}
			result+=current;
		}
		return result;	
	}
	
	
	public static void main(String[] args) {
		
		String arr[] = {"geeksforgeeks", "geeks",
	            "geek", "geezer"};
		int len = arr.length;
		
		String ans = commanPrefix2(arr,len);
		   if (ans.length() > 0) {
	            System.out.printf("The longest common prefix is - %s",
	                    ans);
	        } else {
	            System.out.printf("There is no common prefix");
	        }
	
		
	}
}
