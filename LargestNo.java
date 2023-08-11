package com.jsp.Matrix;

public class LargestNo {

	public static int largestNo(int a[][]) {
		int max=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]>max)
					max=a[i][j];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int a[][]=Matrix.readMatrix();
		int b=largestNo(a);
		System.out.println(b);
	}
}
