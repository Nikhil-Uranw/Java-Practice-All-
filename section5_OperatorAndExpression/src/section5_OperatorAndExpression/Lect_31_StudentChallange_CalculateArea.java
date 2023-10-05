//lets calculate thearea of triangle when base and height of traingl is given formula= (1/2)*(base*height)

//package section5_OperatorAndExpression;
//import java.util.Scanner;
//public class Lect_31_StudentChallange_CalculateArea {
//	public static void main(String[] args) {
//		float h,b,Area;
//		Scanner sc=new Scanner(System.in);
//
//		System.out.println("enter all the base");
//		b=sc.nextFloat();
//
//		System.out.println("enter  height");
//		h=sc.nextFloat();
//		
//		Area = (b*h)/2;
//		System.out.println("Area is: "+Area);
//		
//	}
//
//}



// if traingle ke all three sides given ho tb kaise find out karenge area 

package section5_OperatorAndExpression;

import java.util.Scanner;

public class Lect_31_StudentChallange_CalculateArea {

	public static void main(String[] args) {
		
		float a,b,c,s,area;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter all three sides of traingle a,b,c: ");
		
		a=sc.nextFloat();
		b=sc.nextFloat();
		c=sc.nextFloat();
		
		s=(a+b+c)/2;
		area = (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		System.out.println("Area is: "+area);
	

	}

}