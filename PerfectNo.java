package com.jsp.Matrix;

public class PerfectNo {

	public static boolean isPerfect(int n) {
		
		int sum =0;		
			for(int i=1;i<n;i++) {
				if(n%i==0)
					sum=sum+i;
			}
			
		
		
		return sum==n;
		
		
	}	
	private static int countPerfect(int a[][]) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(isPerfect(a[i][j]))
					count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int a[][]=Matrix.readMatrix();
		int b=countPerfect(a);
		System.out.println(b);
	}
}

