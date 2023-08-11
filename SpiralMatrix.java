package com.jsp.Matrix;

public class SpiralMatrix {

	public static int [][] spiralMatrix(int a[][]){
	//	int a[][]=Matrix.readMatrix();
		int left=0;
		int right=a[0].length-1;
		int top=0;
		int bottom=a.length-1;
		//int index=1;
	   		
		while(top<=bottom&&left<=right) {
			//int	index=1;
			for(int j=left;j<=right;j++) {
				 System.out.print(a[top][j]+" ");

			
			}
			top++;
			
			for(int i=top;i<=bottom;i++) {
				
				 System.out.print(a[i][right]+" ");

			
			}
			right--;
			
			for(int j=right;j>=left;j--) {
			
				 System.out.print(a[bottom][j]+" ");

		
			}
			bottom--;
			
			for(int i=bottom;i>=top;i--) {
				
				 System.out.print(a[i][left]+" ");

	
			}
			left++;	
		}
		System.out.println();
		
		return a;
	}
	public static void main(String[] args) {
		int a[][]=Matrix.readMatrix();
		int b[][]=spiralMatrix(a);
	    Matrix.displayMatrix(b);
	}
}
		
	

