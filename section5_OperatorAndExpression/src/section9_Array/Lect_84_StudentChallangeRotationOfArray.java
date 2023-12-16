//Rotation of an arrray from left to right and also for right to left
//insert an elliment in array
//deletion of an array


//solution 01: Rotation from right to left
/**package section9_Array;
public class Lect_84_StudentChallangeRotationOfArray {
	public static void main(String[] args) {
		
		int A[]= {11,12,13,14,15,16,17,18};
		int temp;
		temp=A[0];
		
		for(int x:A)
			System.out.print(x+",");
		System.out.println("");
		
		for(int i=1; i<A.length; i++) {
			A[i-1]=A[i];
		}
		A[A.length-1]=temp;
		
		for(int x:A)
			System.out.print(x+",");
		System.out.println("");

	}

}**/


//solution 01: rotaion of an array from left to right
/**package section9_Array;
public class Lect_84_StudentChallangeRotationOfArray {
	public static void main(String[] args) {

		int A[]= {11,12,13,14,15,16,17,18,19,20};
		int temp;
		temp=A[A.length-1];
		
		for(int x:A)
			System.out.print(x+",");
		System.out.println("");
		
		for(int i=A.length-2; i>=0; i--) {
			A[i+1]=A[i];
		}
		A[0]=temp;
		
		for(int x:A)
			System.out.print(x+",");
		System.out.println("");
		

	}

}**/









//2nd Solution
/**package section9_Array;
public class Lect_84_StudentChallangeRotationOfArray {
	public static void main(String[] args) {
		int A[]=new int[10];
		A[0]=11;
		A[1]=22;
		A[2]=33;
		A[3]=44;
		A[4]=55;
		A[5]=66;
		
		int index=2;
		int num=222;
		int n=6;
		for(int x:A)
			System.out.print(x+",");
		System.out.println("");
		
		for(int i=n; i>index; i--) {
			A[i+1]=A[i];
			A[index]=num;
		}
		
		for(int x:A)
			System.out.print(x+",");
		System.out.println("");

	}

}**/






//3RD SOLUTION::based on remove an ellement in givaen index
/**package section9_Array;

public class Lect_84_StudentChallangeRotationOfArray {
    public static void main(String[] args) {

        int A[] = {11, 12, 13, 14, 15};
        int index = 2;

        int B[] = new int[A.length - 1];

        int j = 0; // Index for array B
        for (int i = 0; i < A.length; i++) {
            if (i != index) {
                B[j] = A[i];
                j++;
            }
        }

        System.out.println("Original Array:");
        for (int x : A) {
            System.out.print(x + ",");
        }
        System.out.println("");

        System.out.println("Array after removal:");
        for (int x : B) {
            System.out.print(x + ",");
        }
        System.out.println("");
    }
}**/




// 4th remove given element ifif its index is not given
package section9_Array;
public class Lect_84_StudentChallangeRotationOfArray {
	public static void main(String[] args) {

		int A[]={11,12,13,14,15,16,17};
		int B[]=new int[A.length-1];
		
		int j=0;
		int re=14;
		
		for(int i=0; i<A.length; i++) {
			if(A[i] != re) {
				B[j]=A[i];
				j++;
			}
		}
		
		System.out.println("original Array: ");
		for(int x:A)
			System.out.print(x+",");
		System.out.println("");
		
		System.out.println("Array after removal an element: ");
		for(int x:B)
			System.out.print(x+",");
		System.out.println("");

	}

}
