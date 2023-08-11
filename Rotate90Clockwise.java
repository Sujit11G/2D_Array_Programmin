package com.jsp.Matrix;

public class Rotate90Clockwise {

	public static int [][] rotateMatrix90Clockwise(int a[][]){
		int b[][]=new int[a[0].length][a.length];
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				 b[i][j]=a[j][i];
			}
		}
			
			for(int i1=0;i1<b.length;i1++) {
				for(int j1=0;j1<b[i1].length/2;j1++) {
					int temp1=b[i1][j1];
		           b[i1][j1]=b[i1][b[0].length-1-j1];
	            	b[i1][b[0].length-1-j1]=temp1;
				}	
			}
		
		return b;
	}
	
	public static void main(String[] args) {
		int a[][]=Matrix.readMatrix();
		int b[][]=rotateMatrix90Clockwise(a);
		Matrix.displayMatrix(b);
	}
}

//1 2 3
//4 5 6
//7 8 9