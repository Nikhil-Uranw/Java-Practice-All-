//there is two types of typeCasting
//widening or implicity = when data types is converting from small data type to big data type size byte>short>int>long>double
//narrowing or explicity = when data type is converting from big data type to small data type double<long<int,short<byte


package javaSecond;

public class TypeCasting {

	public static void main(String[] args) {
		//widening
		int A = 14;
		long B= A;
		double C = B;
		
		System.out.println("A before convert into long: "+A);
		System.out.println("A after convert into long: "+B);
		System.out.println("B before convert into double: "+B);
		System.out.println("A after convert into double: "+C);	
		
		
		//narrowing
		
		double x= 17.10;
		
		long y=(long)x;
		
		int z=(int)y;
		
		System.out.println("x before convert double to long: "+x);
		System.out.println("x after convert double to long: "+y);
		System.out.println("y after convert  long to int: "+z);

		

	}

}
