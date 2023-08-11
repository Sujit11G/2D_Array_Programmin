package com.jsp.Matrix;

import java.util.Scanner;

public class Matrix {

	public static int [][] readMatrix(){
		
		Scanner sc = new Scanner(System.in);
	//	System.out.println("Enter Size of Matrix");
		System.out.println("Enter Row of Matrix");
		int n =sc.nextInt();
		System.out.println("Enter Column of Matrix");
		int m=sc.nextInt();
		
		System.out.println("Enter the Elements in Matrix");
		int a[][]=new int[n][m];
		for(int i=0;i<a.length;i++) {
			for(int j=0; j<a[i].length;j++) {
				
				a[i][j]=sc.nextInt();		
			}
		}
		
		return a;
	}
	
	public static void displayMatrix(int a[][]) {
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
