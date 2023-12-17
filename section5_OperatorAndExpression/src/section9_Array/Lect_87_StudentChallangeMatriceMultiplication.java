//adding two matrices
//multiplying 2 matrices
//sorting arrays of String



//solutin 01: 

/**package section9_Array;
public class Lect_87_StudentChallangeMatriceMultiplication {
	public static void main(String[] args) {
		
		int A[][]= {{1,2,3},{2,3,4},{3,4,5}};
		int B[][]= {{1,0,0},{0,1,0},{0,0,1}};
		
		int C[][]=new int [3][3];
		
		for(int i=0; i<A.length; i++) {
			for(int j=0;j<B.length; j++) {
				C[i][j]=A[i][j]+B[i][j];
			}
		}
		for(int x[]:C) {
			for(int y:x) {
				System.out.print(y+"");
			}
			System.out.println();
		}
	}

}**/


// Solution 2nd;;;
 /**package section9_Array;
public class Lect_87_StudentChallangeMatriceMultiplication {
	public static void main(String[] args) {
		
		int A[][]= {{1,2,3},{2,3,4},{3,4,5}};
		int B[][]= {{1,0,0},{0,1,0},{0,0,1}};
		
		int C[][]=new int [3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0; j<3; j++) {
				for(int k=0; k<3; k++) {
					 C[i][j]=0;
					C[i][j]=C[i][j]+A[i][k]*B[k][j];
				}
			}
		}
		for(int x[]:C) {
		
			for(int y:x) {
			System.out.print(y+"");
			}
			System.out.println("");
		}
	}

}**/



// Solution 03
package section9_Array;

import java.util.Arrays;

public class Lect_87_StudentChallangeMatriceMultiplication {
	public static void main(String[] args) {
	
		String A[]= {"Ekant", "Bagga", "Mayank", "Abhishek", "Anurag"};
		Arrays.sort(A);
		for(String x:A)
			System.out.println(x);
	}

}

