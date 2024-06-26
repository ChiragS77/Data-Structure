package com.TwoDArrays;

import java.util.Scanner;

public class TwoDArrays {

	//Intializing 2D arrays........
	public static void initTwoDArrays() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows and columns: ");
		int rows = sc.nextInt();
		int cols = sc.nextInt();

		int arr[][] = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = sc.nextInt();
			}
			System.out.println();
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}



}
