package com.jsp.Matrix;

public class ReverseRow {

	public static int [][] reverseEachRow(int a[][]){
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<(a[i].length)/2;j++) {
				int temp=a[i][j];
				a[i][j]=a[i][a[0].length-1-j];
				a[i][a[0].length-1-j]=temp;
			}
		}	
		return a;
	}
	public static void main(String[] args) {
		int a[][]=Matrix.readMatrix();
		int b[][]=reverseEachRow(a);
		Matrix.displayMatrix(b);
	}
}
