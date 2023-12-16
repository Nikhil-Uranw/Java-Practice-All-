// copying an array;
//reverse an copying array
//increasing size of an array



// solution 01;
/**package section9_Array;
public class Lect_85_StudentChallangeIncreasingSizeOfAnArray {
	public static void main(String[] args) {
		int A[] = {2,3,4,5,6,7};
		int B[]=new int[A.length];
		for(int i=0; i<A.length; i++){
			B[i]=A[i];
			
		}
		for(int x:B) {
			System.out.print(x+",");
		}

	}

}**/



//2nd solution;
/**package section9_Array;
public class Lect_85_StudentChallangeIncreasingSizeOfAnArray {
	public static void main(String[] args) {

		int A[]= {2,3,4,5,6,7};
		int B[]=new int[A.length];
		
		for(int i=A.length-1, j=0; i>0; i--,j++)
		{
			B[j]=A[i];
		}
		for(int x:A)
			System.out.print(x+",");
		System.out.println("");
		
		for(int x:B)
			System.out.print(x+",");
		System.out.println("");
	}
	

}**/




package section9_Array;
public class Lect_85_StudentChallangeIncreasingSizeOfAnArray {
	public static void main(String[] args) {

		int A[] = { 8, 6, 10, 9, 2 };

		System.out.println("Length of A=" + A.length);

		int B[] = new int[10];

		for (int i = 0; i < A.length; i++) {
			B[i] = A[i];
		}
		A = B;

		System.out.println("Length of A=" + A.length);

	}

}




/**
package section9_Array;
public class Lect_85_StudentChallangeIncreasingSizeOfAnArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
**/