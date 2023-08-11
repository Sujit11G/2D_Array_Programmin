package com.jsp.Matrix;

public class ReverseColumns {

public static int [][] reverseEachCol(int a[][]){
		
		for(int i=0;i<a[0].length;i++) {
			for(int j=0;j<(a.length)/2;j++) {
				int temp=a[j][i];
				a[j][i]=a[a.length-1-j][i];
				a[a.length-1-j][i]=temp;
			}
		}	
		return a;
	}
	public static void main(String[] args) {
		int a[][]=Matrix.readMatrix();
		int b[][]=reverseEachCol(a);
		Matrix.displayMatrix(b);
	}
}
