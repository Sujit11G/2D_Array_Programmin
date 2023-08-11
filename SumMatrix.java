package com.jsp.Matrix;

public class SumMatrix {

	public static int sumOfMatrix(int a[][]){
		int sum =0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
			sum+=a[i][j];	
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		int a[][]=Matrix.readMatrix();
		int b=sumOfMatrix(a);
		System.out.println(b);
		
	}
}
