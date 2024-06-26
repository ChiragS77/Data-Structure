package com.TwoDArrays;

import java.util.Scanner;

public class TwoDArrayRought {
	
	

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the rows and columns: ");
			int rows = sc.nextInt();
			int cols = sc.nextInt();
			
			int arr[][] = new int[rows][cols];
			int x = 11;
	
		
			for(int i=0; i<rows ; i++) {
				for(int j=0; j<cols; j++) {
					arr[i][j] = sc.nextInt();
				}
				System.out.println();
			}
			
			for(int i=0 ; i<rows; i++) {
				for(int j=0; j<cols;j++) {
					if(arr[i][j]== x) {
						System.out.print(" "+i+","+j);
					}
				}
			}
			
		
	}
}
