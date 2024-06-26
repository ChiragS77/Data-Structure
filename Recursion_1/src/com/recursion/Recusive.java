package com.recursion;

public class Recusive {

	
	//print to n natural number
	public static void print(int n , int i) {
		if(n==i) {
			System.out.println(i);
			return;
		}
		System.out.println(i);
		print(n, i+1);
		
		System.out.println(i);
	}
	
	//Summation of numbers
	public static void printSum(int i , int sum ,  int n) {
		if(n==i) {
			sum = sum +i;
			System.out.println(sum);
			return;
		}
		
		
		sum = sum + i;
		printSum(i+1 , sum , n);
	}
	
	
	
	//calculate factorial 
	public static int calFactorial(int n) {
		if(n == 1 || n== 0) {
			return 1;
		}
		
		
		int fact_nm = calFactorial(n - 1);
		int factorial =  n * fact_nm;
		return factorial;
	}
	
	
	//**********************  fibonacci series ******************
	
	public static void printFib(int a , int b , int n) {
		if(n==0) {
			return;
		}
		
		
		int c = a + b;
		System.out.println(c);
		printFib(b , c , n-1);
	}
	
	
	//********************** print n^2 where (stack height = n) *************************
	
	public static int calcPow(int x , int n) {
		if(n ==0) {
			return 1;
		}
		
		if(x==0) {
			return 0;
		}
		
		int nPownm1 = calcPow(x , n-1);
		int pow=  x * nPownm1;
		return pow;
	}
	
	
	//***************  print x^n (stack height = logn)  *************
	
	public static int calcPow2(int x , int n) {
		if(x == 0) {
			return 0;
		}
		if(n == 0) {
			return 1;
		}
		
		if(n%2==0) {
			return calcPow2(x ,  n/2) * calcPow2( x ,n/2 );
			
		}
		
		else {
			return calcPow2(x , n/2) * calcPow2(x, n/2) * x;
		}
	}
	
	public static void main(String[] args) {
		print(8 , 1);
		
		printSum(1 , 1 , 6);
		
		
		int fact  = calFactorial(5);
		System.out.println(fact);
		int a = 0 , b = 1; 
		System.out.println(a);
		System.out.println(b);
		int n = 7;
		printFib(a , b , n-2 );
		
//		
//		int x = 2 , n = 5;
//		int  square= calcPow(x , n);
//		System.out.println(square);
		
//		int x = 2 , n=5;
//		int sq =  calcPow(x , n);
//		System.out.println(sq);
//		
		
	}
	
}
