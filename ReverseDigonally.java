package com.jsp.Matrix;

public class ReverseDigonally {

	public static int[][] reverseDiagonalMatrix(int a[][]){
	//	int b[][]=new int[a[0].length][a.length];
		
		int i=0;
		int j=a.length;
		while(i<j) {
			
			//Reversing Left Side diagonal
			int temp=a[i][i];
			a[i][i]=a[j-1][j-1];
			a[j-1][j-1]=temp;
			
			//Reversing Right Side diagonal
			temp=a[i][j-1];
			a[i][j-1]=a[j-1][i];
			a[j-1][i]=temp;
			
			i++;  //i starts from 0
			j--;  //j starts from a.length
		}
		for( i=0;i<a.length;i++) {
			for(j=0;j<a[i].length;j++) {
				
			}
		}
		return a;
	}
	public static void main(String[] args) {
		int a[][]=Matrix.readMatrix();
		int b[][]= reverseDiagonalMatrix(a);
		Matrix.displayMatrix(b);
	}
}


//1 2 3 4 6
//5 6 7 8 9
//4 5 6 9 3
//8 5 2 3 1
//8 2 3 3 2

//4 2 3 1 
//5 7 6 8 
//4 6 5 9 
//3 5 2 8 

//8 2 3 3 
//5 5 6 8 
//4 6 7 9 
//1 5 2 4







