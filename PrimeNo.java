package com.jsp.Matrix;

public class PrimeNo {
	

	public static int countPrime(int a[][]) {
		int count =0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(isPrime(a[i][j]))
					count++;
			}
		}
		
			return count;
	}
	public static boolean isPrime(int n) {
		if(n==1) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(i%2==0) {
				return false;
			}
		}
			
		
		return true;
	}
	public static void main(String[] args) {
		int a[][]=Matrix.readMatrix();
		int b=countPrime(a);
		System.out.println(b);
	}
}
