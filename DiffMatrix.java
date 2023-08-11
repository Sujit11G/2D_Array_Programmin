package com.jsp.Matrix;

public class DiffMatrix {

	public static int diffEvenOdd(int a[][]) {
		
		int sum1=0;
		int sum2=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]%2==0)
					sum1=sum1+a[i][j];
				else
					sum2=sum2+a[i][j];		
			}
			
		}
		int diff=sum1-sum2;
		return diff;
	}
	public static void main(String[] args) {
		int a[][]=Matrix.readMatrix();
		int b=diffEvenOdd(a);
		System.out.println(b);
	}
}
