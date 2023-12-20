//Problem01: overload method to calculate area;
//problem02: overload method for to revers an int or an array
//Problem03 overload a method for name and age



// Solution 01
/**package section10_Methods;
import java.util.Scanner;
public class Lect_97_StudentChallangeMethodOverLoading {
	static double area(double length, double breadth) {
		double areaRectangle=length*breadth;
		return areaRectangle;
	}
	static double area(double radius) {
		double areaCircle=Math.PI*radius*radius;
		return areaCircle;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius and length, breadth: ");
		double radius=sc.nextDouble();
		double length=sc.nextDouble();
		double breadth=sc.nextDouble();
		
		double circ=area(radius);
		double rect=area(length, breadth);
		
		System.out.println(circ);
		System.out.println(rect);

	}

}**/




/**package section10_Methods;
public class Lect_97_StudentChallangeMethodOverLoading {

	static int[] reversen(int A[]) {
		int B[]=new int[A.length];
		
		for(int i=A.length-1,j=0;i>0;i--,j++) 
			B[j]=A[i];
		
		return B;
	
	}
	
	static int reversen(int n) {
		int rev=0;
		while(n!=0) {
			rev=rev*10+n%10;
			n=n/10;
		}
		return rev;
			
	}
	
	public static void main(String[] args) {

		int A[]= {2,3,4,5,6,7,8,9};
		for(int x:A) 
			System.out.print(x+",");
		System.out.println("");
		
		A=reversen(A);
		for(int x:A)
			System.out.print(x+",");
		System.out.println(",");
		
		
		int n=2345;
		System.out.println(n);
		System.out.println(reversen(n));

	}

}**/





// solution03:--- validate name is in correct formate and age is between 3 to 20
package section10_Methods;
public class Lect_97_StudentChallangeMethodOverLoading {
	
	static boolean validate(int age) {
		if(age>3 && age<18)
			return true;
		else
			return false;
	}
	
	static boolean validate(String name) {
		if(name.matches("[a-zA-Z//s]+"))
			return true;
		else
			return false;
				
	}
	
	public static void main(String[] args) {
		
		String name="Nikhil";
		int age=12;
		System.out.println(validate(name));
		System.out.println(validate(age));

	}

}
