package com.jsp.Matrix;

public class TransposeMatrix {

	public static int [][] transposeMatrix(int a[][]) {
		int b[][]=new int[a[0].length][a.length];
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[0].length;j++) {
				 b[i][j]=a[j][i];
			}
		}
		
		return b;
	}
	public static void main(String[] args) {
		int a[][]=Matrix.readMatrix();
		int b[][]=transposeMatrix(a);
		Matrix.displayMatrix(b);
	}
}
