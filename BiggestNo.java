package com.jsp.Matrix;

public class BiggestNo {

	public static int rowMaxElement(int a[][]) {
		int max=0;
		
		for(int i=0;i<a.length;i++) {
			 max=0;
			for(int j=0;j<a[i].length;j++) {
				if(max<a[i][j])
					max=a[i][j];
			}
			System.out.println("Max no of "+(i+1)+" row is "+max);
		}
		
		return max;
	}
	public static int colMaxElement(int a[][]) {
		int max1=0;
		for(int i=0;i<a[0].length;i++) {
			max1=0;
			for(int j=0;j<a.length;j++) {
				if(max1<a[j][i])
					max1=a[j][i];
			}
			System.out.println("Max no of "+(i+1)+" column is "+max1);
		}
		
		return max1;
		
	}
	public static void main(String[] args) {
		int a[][]=Matrix.readMatrix();
		int b=rowMaxElement(a);
	     int c=colMaxElement(a);
	}
}
