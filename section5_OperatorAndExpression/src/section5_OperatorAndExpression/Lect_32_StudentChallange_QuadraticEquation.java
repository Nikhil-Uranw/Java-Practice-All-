package section5_OperatorAndExpression;

import java.util.Scanner;

public class Lect_32_StudentChallange_QuadraticEquation {

	public static void main(String[] args) {
		int a,b,c;
		double r1,r2;
		
		System.out.println("Enter value of a,b,c:  ");
		Scanner sc=new Scanner(System.in);

		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		r1= (-b+Math.sqrt((b*b)-(4*a*c))/(2*a));
		r2= (-b-Math.sqrt((b*b)-(4*a*c))/(2*a));
		
		System.out.println("root r1 is here: "+r1);
		System.out.println("Root r2 is here: "+r2);

		

	}

}
