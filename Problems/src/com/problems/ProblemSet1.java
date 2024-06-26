package com.problems;

public class ProblemSet1 {
	
	//Find the binomial coeffiecnt
//	public static int factorial(int n) {
//		int i;
//		int fact = 1;
//		for(i =1; i<=n; i++) {
//			fact = fact * i;
//		}
//		return fact;
//	}
//	public static int binoFact(int n , int r) {
//		
//		int fact_n = factorial(n);
//		int fact_r = factorial(r);
//		int fact_nmr = factorial (n-r);
//		
//		int binoCoe = fact_n/(fact_r*fact_nmr);
//		
//		return binoCoe;
//	}
	
//       <----------------  Check prime number  -------------->
	
//	public static boolean checkPrime(int n) {
//		boolean isPrime = true;
//		for(int i = 2; i<=n-1 ;i++) {
//			if(n%i==0) {
//				isPrime = false;
//				break;
//			}
//		}
//		return isPrime;
//	}
//	
//	public static void printPrimeRange(int n) {
//		for(int i=1; i<n ; i++) {
//			if(checkPrime(i)) {
//				System.out.println(i);
//			}
//		}
//		
//	}
//	<------------------- Converting Binary to Decimal ---------------------->
	
//	public static void binToDec(int binNum) {
//		int pow = 0;
//		int dec =0;
//		
//		while(binNum > 0) {
//			int lastDigit = binNum%10;
//			
//			dec = dec + (lastDigit *(int) Math.pow(2, pow) );
//			
//			pow++;
//			binNum = binNum/10;
//		}
//		
//		System.out.println("Binary to decimal is : "+dec);
//	}

	public static void main(String[] args) {
	
		
	}
}
