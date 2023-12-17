package section9_Array;

public class Lect_87_Practising2DArray {

	public static void main(String[] args) {
		
		// creating an array of size 5*5
		/*
		 * int A[][]=new int[5][5];
		 * 
		 * //creating 2D Array of size 5*5 int B[][]; B=new int[5][5]; int [][]c=new
		 * int[5][5]; int []D[]=new int[5][5];
		 * 
		 * //E will be 2d array and F will be 1d array if we will wright like below
		 * 
		 * int [] E[], F; E=new int[5][5]; F=new int[5];
		 * 
		 * //if we will write like below then all will be 1D Array
		 * 
		 * int [] G,H,I,J;
		 * 
		 * // creating an array of size 3*4;
		 * 
		 * int M[][]= {{1,2,3,4},{4,5,6,7},{7,8,9,0}};
		 * 
		 * for(int i=0;i<M.length;i++) { for(int j=0; j<M[i].length;j++) {
		 * System.out.print(M[i][j]+""); } System.out.println(""); }
		 * 
		 * //now same above thing how to do it by using for each loop
		 * 
		 * for(int x[]:M) { for(int y:x) { System.out.print(y+""); }
		 * System.out.println(""); }
		 */
		
		
		/// Example of jagged Array;
		
		int N[][]=new int[3][];
		N[0]=new int[3];
		N[1]=new int[5];
		N[2]=new int[8];
		
	//	N[0][0]= {1,2,3};
		
		for(int i=0; i<N.length;i++) {
			for(int j=0;j<N[i].length; j++) {
				System.out.print(N[i][j]+"");
			}
			System.out.println("");
		}
		
		
		
		
		
		

	}

}
