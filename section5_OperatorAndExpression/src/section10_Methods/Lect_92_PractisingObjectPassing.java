package section10_Methods;
public class Lect_92_PractisingObjectPassing {
	
	static void change(int A[], int index, int value) {
		A[index]=value;
	}
	
	static void change2(int x, int value) {
		x=value;
	}
	
	public static void main(String[] args) {
	
		int A[]= {2,3,4,5,6,7};
		//when we paas object as a parameter in change method so it will change in original array 
	    change(A,1,999);
	   for(int x:A)
		   System.out.print(x+",");
	   System.out.println("");
	    
	    
	    
	    //but here when we pass primitive as a parameter in change 2 method so it is not changing the original value of x
	    //here we are getting x value as 10 only after calling change2 method
	    int x=10, value=200;
	    change2(x,value);
	    System.out.println(x);
		
	}

}
