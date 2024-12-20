package com.array;

import java.util.HashSet;

public class ArrayProblems {
	// Linear Search
	// Time Complexity == O(n)
	public static int linearSearch(int arr[], int key) {

		for (int i = 0; i <= arr.length; i++) {
			if (key == arr[i]) {
				return i;
			}
		}
		return -1;
	}

	// Find Largest
	// Tc = O(n)
	public static int largestVal(int arr[]) {
		int largest = Integer.MIN_VALUE; // This gives us -infinity (minimum value in integer)

		for (int i = 0; i < arr.length; i++) {
			if (largest < arr[i]) {
				largest = arr[i];
			}
		}
		return largest;
	}

	// Binary Search
	// O(logn) as the iteration incresed size decreased
	public static int binarySearch(int arr[], int key) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = ((start + end) / 2);

			if (arr[mid] == key) {
				return mid;
			}

			if (arr[mid] < key) {
				start = mid + 1;
			}

			if (arr[mid] > key) {
				end = mid - 1;
			}

		}
		return -1; // if key becomes greater or smaller than index

	}

	// print pairs
	// tc = O(n^2)
	public static void printPairs(int arr[]) {
		int totalPairs = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			int curr = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				System.out.print("(" + curr + "," + arr[j] + ")");
				totalPairs++;
			}
			System.out.println();
		}
		System.out.println("Total number of pairs: " + totalPairs);
	}

	// Time Complexity = O(n^3)
	public static void printSubArray(int arr[]) {
		int pairs = 0;
		int sum = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			int start = i;

			for (int j = i; j < arr.length; j++) {
				int end = j;
				sum = 0;

				for (int k = start; k <= end; k++) {
//				   System.out.print(arr[k]+" ");
					sum = sum + arr[k];
				}

				System.out.println("" + sum);
				if (max < sum) {
					max = sum;
				}
				if (min > sum) {
					min = sum;
				}

				System.out.println();
				pairs++;
			}

			System.out.println();
		}

		System.out.println("Total pairs in array: " + pairs);
		System.out.println(" maximum sum: " + max);
		System.out.println(" minimum sum: " + min);
	}

	public static void maxSubArray(int arr[]) {
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int start = i;

			for (int j = start; j < arr.length; j++) {
				int end = j;

				currSum = 0;
				for (int k = start; k <= end; k++) {
					currSum += arr[k];
				}
				
				System.out.print(currSum);
				if (maxSum < currSum) {
					maxSum = currSum;
				}
			}
			System.out.println();
		}
	}

	
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
	
//      int num[]  = {-2,-3,4,-1,-2,1,5,-3};
//--------------  Kadanes Algorithm   --------
	public static void printMax(int num[]) {
		int currSum = 0;
		int maxSum = 0;
		
		for(int i=0; i<num.length; i++) {
			currSum = currSum + num[i];
			if(currSum < 0) {
				currSum = 0;
			}
			maxSum = Math.max(currSum, maxSum);
		}
		
		System.out.println("Maximum sum of subarray is :"+maxSum);
	}

	
	public static void main(String[] args) {

		int arr[] = {-1,-2,-3,4 };
//		printSubArray(arr);
		
		int num[] = {1,-2,6,-1,3};
		
		printMaxSum(num);

	}
	
	//Find the number of elements which has at least 1 element greater than itself.
	public static int countNum(int arr[]) {
		
		int max = arr[0];
		for(int i =1; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		int count = 0; 
		
		for(int i= 0; i<arr.length; i++) {
			if(arr[i]==max) {
				count++;
			}
		}
		
		return arr.length - count;
	}


	//given array check if there exists a pair(	i,j) such that
	//arr[i] + arr[j] == k and i!=j
	public static void twoSum(int arr[], int k) {
		
		for(int i = 0; i<arr.length; i++) {
			int start = i;
			for(int j =start ;j<arr.length; j++) {
				int end = j; 
				
				if(arr[start] + arr[end]== k) {
					System.out.println("("+arr[start]+" , "+arr[end]+")");
				}
				
			}
			System.out.println();
		}
	}


	//three sum brute force.............
	public static void threeSum(int arr[], int sum ) {

		int size = arr.length;


		for(int i =0; i<arr.length -2; i++){
			for(int j = i+1; j<arr.length - 1; j++){
				for(int k = j+1; k<arr.length; k++){
                  if(arr[i] + arr[j] + arr[k] == sum){
					  System.out.print(arr[i]+"("+i+")"+ " "+arr[j]+"("+j+")"+" "+arr[k]+"("+k+")");
				  }

				}
			}
		}

	}	


	//three sum using two pointers...
	public static boolean threeSumWithPointer(int arr[], int target) {

		for (int i = 0; i < arr.length - 2; i++) {
			int left = i + 1;
			int right = arr.length - 1;

			while (left < right) {

				if (arr[i] + arr[left] + arr[right] == target) {
					return true;
				}

				else if (arr[i] + arr[left] + arr[right] < target) {
					left++;
				} else {
					right--;
				}
			}
		}
		return false;
	
	}
	
	//three sum using hashing technique.......
	public static boolean threeSumHashing(int arr[], int target) {

		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length - 2; i++) {

			int currSum = target - arr[i];

			for (int j = i + 1; j < arr.length; j++) {

				int requiredSum = currSum - arr[j];

				if (set.contains(requiredSum)) {
					System.out.println(arr[i] + "," + arr[j] + "," + requiredSum);
					return true;
				} else {
					set.add(arr[j]);
				}
			}
		}

		return false;
	}


}
