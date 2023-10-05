package section5_OperatorAndExpression;

import java.util.Scanner;

public class Lect_33_StudentChallange_Cuboid {

	public static void main(String[] args) {
		
		int breadth ,length, height;
		int totalArea, volume;
		
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter base: ");
	breadth=sc.nextInt();
	System.out.println("Enter height: ");
	height=sc.nextInt();
	System.out.println("Enter Length: ");
	length=sc.nextInt();
	
	totalArea= (length*height+length*breadth+breadth*height);
	volume=breadth*length*height;
	
    System.out.println("the total area is: "+totalArea);
    System.out.println("the Volume is: "+volume);

	}

}
