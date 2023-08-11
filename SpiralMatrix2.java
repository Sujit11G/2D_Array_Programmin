package com.jsp.Matrix;

import java.util.Scanner;

public class SpiralMatrix2 {

	public static int[][]  spiralMatrix1(int a[][]){
		
			
			
			int left=0;
			int right=a[0].length-1;
			int top=0;
			int bottom=a.length-1;
			int index=1;
		   		
			while(top<=bottom&&left<=right) {
				//int	index=1;
				for(int j=left;j<=right;j++) {
					 a[top][j]=index;
					 index++;
				}
			top++;
				
				for(int i=top;i<=bottom;i++) {
					 a[i][right]=index;
					 index++;
				}
				right--;
				
				for(int j=right;j>=left;j--) {
				
					 a[bottom][j]=index;
					 index++;
                }
				bottom--;
				
				for(int i=bottom;i>=top;i--) {
					
					 a[i][left]=index;
					 index++;
				}
				left++;	
			}
		//	System.out.println(index);
			
			return a;
		}
	public static void main(String[] args) {
		int a[][]=Matrix.readMatrix();
		spiralMatrix1(a);
		Matrix.displayMatrix(a);
	}
}
