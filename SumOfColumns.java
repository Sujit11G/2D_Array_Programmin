package com.jsp.Matrix;

public class SumOfColumns {

	public static int sumOfEachColumns(int a[][]) {
		int sum=0;
		for(int i=0;i<a[0].length;i++) {
			sum=0;
			for(int j=0;j<a.length;j++) {
				sum=sum+a[j][i];
			}
			System.out.println("Sum of "+(i+1)+" column is "+sum);
		}
		
		return sum;
		
	}
	public static void main(String[] args) {
		int a[][]=Matrix.readMatrix();
		int b=sumOfEachColumns(a);
		//System.out.println(b);
	}
}
