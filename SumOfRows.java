package com.jsp.Matrix;

public class SumOfRows {

	public static int sumOfEachRows(int a[][]) {
		
		int sum=0;
		for(int i=0;i<a.length;i++) {
			 sum=0;
			for(int j=0;j<a[i].length;j++) {
				sum=sum+a[i][j];
			}
			System.out.println("Sum of "+(i+1)+" row is "+sum);
		}
		
		return sum;
		
	}
	public static void main(String[] args) {
		int a[][]=Matrix.readMatrix();
		int b=sumOfEachRows(a);
		//System.out.println(b);
	}
}
