// code for summ of all the elements in array
// code for dearch an elliment in array
// code for finding largest elliment in array
// code for finding second largest eliment in array

// solution 01
/**
package section9_Array;
public class Lect_83_StudentChallanegeSecondLargestElliment {
	public static void main(String[] args) {

		int A[]= {2,3,4,5,6,7,8};
		int SUM=0;
			
			for(int i=0; i<A.length;i++) {
				SUM=SUM+A[i];
			}
		System.out.println(SUM);
	}

}
**/




//solution 2nd
/**
package section9_Array;
public class Lect_83_StudentChallanegeSecondLargestElliment {
	public static void main(String[] args) {

		int A[]= {2,4,6,8,0,1,3,5,7,9};
		int key=3;
		
		for(int i=0; i<A.length; i++) {
			if(A[i]==key) {
				System.out.println(i);
				System.exit(0);
			}
		}
		System.out.println(" not found");
		}

}**/





//3rd Solution
/**package section9_Array;
public class Lect_83_StudentChallanegeSecondLargestElliment {
	public static void main(String[] args) {
		int A[]={8,2,3,4,5,6,7,8,9,99,100};

		int max = 0;
		for(int i=0; i<A.length; i++) {
			if(A[i]>max) {
				max=A[i];
			}
		}
		System.out.println(max);
	}

}**/




//4th solution
/**package section9_Array;
public class Lect_83_StudentChallanegeSecondLargestElliment {
	public static void main(String[] args) {

		int A[]= {1,2,3,4,5,6,7,8,99,100};
		int max1=0, max2=0;
		
		for(int i=0; i<A.length; i++) {
			if(A[i]>max1) {
				max1=A[i];
			}	
		}
		for(int i=0; i<A.length; i++) {
			if(A[i]>max2 && A[i]<max1) {
				max2=A[i];
			}
		}
		System.out.println(max2);
	}

}**/



// another method to solve 4th questions:
package section9_Array;
public class Lect_83_StudentChallanegeSecondLargestElliment {
	public static void main(String[] args) {
		
		int A[] = {2,3,4,5,6,7,8,9,99};
		int max1,max2;
		max1=max2=A[0];
		
		for(int i=0; i<A.length; i++) {
			if(A[i]>max1) {
				max2=max1;
				max1=A[i];
			}
			else if(A[i]>max2) {
				max2=A[i];
			}
		}
		System.out.println(max2);
	}
	}
