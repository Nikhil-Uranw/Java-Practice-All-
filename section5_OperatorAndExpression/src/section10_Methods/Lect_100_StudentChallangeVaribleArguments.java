//problem01: maximum number by using varags
//problem02: sum of all elements using varargs

/**package section10_Methods;
public class Lect_100_StudentChallangeVaribleArguments {
	static int max(int ... A) {
		int m=0;
		for(int i=0;i<A.length;i++) {
			if(A[i]>m)
				m=A[i];
		}
		return m;
		
	} 
	public static void main(String[] args) {
		
		System.out.println(max());
		System.out.println(max(10,20));
		System.out.println(max(10,20,30,40));
	}

}**/



//solution02: 
/**package section10_Methods;
public class Lect_100_StudentChallangeVaribleArguments {
	static int sumElement(int ... A) {
		int sum=0;
		for(int i=0;i<A.length;i++)
			sum=sum+A[i];
		
		return sum;
	}
	
	
	public static void main(String[] args) {
		System.out.println(sumElement(0));
		System.out.println(sumElement(2,3,4,5,9));
		System.out.println(sumElement(100,200,300));
	}

}**/




//solution 03 calculate discount
package section10_Methods;
public class Lect_100_StudentChallangeVaribleArguments {
	
	static double calculateDiscount(double ... A) {
		double total=0;
		for(int i=0;i<A.length;i++)
			total=total+A[i];
		
		double discount = 0;
		if(total>=100)
			discount=total*0.1; //10% discount
		else if(total>50 && total<100)
			discount=total*0.5;
		
		return discount;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(calculateDiscount(12,45,20));
	}

}
 
