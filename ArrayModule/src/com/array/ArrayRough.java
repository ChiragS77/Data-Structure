package com.array;

public class ArrayRough {
	
	public static void printMaxSum(int arr[]) {
		
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE; 
		
		int prefix[] = new int[arr.length];
		prefix[0] = arr[0];
		
		for(int i = 1 ; i<arr.length; i++) {
			prefix[i] = prefix[i-1] + arr[i];
		}
		
		for(int i=0; i<arr.length;i++) {
			int start = i;
			for(int j=i;j<arr.length; j++) {
				int end = j;
				currSum =start==0? prefix[end]:  prefix[end] - prefix[start-1];
				
				if(maxSum < currSum) {
					maxSum = currSum;
				}
			}
			System.out.println();
		}
		
		System.out.println("the maximum sum is :"+maxSum);
		
	}
	
	public static void kadansAlgo(int arr[]) {
		
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;
		
		for(int i= 0; i<arr.length; i++) {
			currSum += arr[i];
			if(currSum < 0) {
				currSum = 0;
			}
			if(maxSum < currSum) {
				maxSum = currSum;
			}
		}
		
		System.out.println("Maximum sum is: "+maxSum);
	}
	
	static int count_greater(int arr[], int n)
	{
	    int min = Integer.MAX_VALUE;
	    int counter = 0;
	 
	    // Comparing the given element
	    // with minimum element till
	    // occurred till now.
	    for (int i = n - 1; i >= 0; i--)
	    {
	        if (arr[i] > min)
	        {
	            counter++;
	        }
	 
	        // Updating the min variable
	        if (arr[i] <= min)
	        {
	            min = arr[i];
	        }
	    }
	    return counter;
	}
	//two sum
	public static int twoSum(int arr[], int s) {
		int start = 0;
		int end = arr.length -1;
		
		while(start<end) {
			if(arr[start]+arr[end]==s) {
				return 1;
			}
			if(arr[start]+arr[end]>s) {
				end--;
			}
			if(arr[start] + arr[end]< s) {
				start++;
			}
			
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = { 1,-2,6,-1,3 };
		int sum = 22;
//		printMaxSum(arr); 
//		kadansAlgo(arr);
		
//		int a[] = {3, 9, 4, 6, 7, 5 };
//	int c =	count_greater(a,a.length);
//	System.out.println(c);

		int a[]= {1,2,3,4,5};
		int x =twoSum(a,4); 
		System.out.println(x);
	}


}
