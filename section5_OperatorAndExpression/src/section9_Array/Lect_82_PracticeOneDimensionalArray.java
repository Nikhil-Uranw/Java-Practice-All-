package section9_Array;
public class Lect_82_PracticeOneDimensionalArray {
	public static void main(String[] args) {

		int A[]=new int[10];
		int B[]= {1,2,3,4,5};
		int c[];
		c=new int[10];
		
		B[2] = 99;
		
		for(int i=0; i<B.length; i++) {
			System.out.println(B[i]);
		}
		
		for(int x:B) {
			System.out.println(x);
		}
		
		
		
	}

}
