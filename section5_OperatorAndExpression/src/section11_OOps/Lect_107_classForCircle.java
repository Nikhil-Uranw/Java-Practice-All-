//write code for creating class for circle

package section11_OOps;

import java.util.Scanner;

class circle{
	public double radius;
	
	public double area(double radius) {
	 double areaa=Math.PI*radius*radius;
	 return areaa;
	}
	
	public double perimeter(double radius) {
		double perimetere= 2*Math.PI*radius*radius;
		return perimetere ;
	}
	
	public double circumfrence() {
		return perimeter(radius);
		
	}
	
}

public class Lect_107_classForCircle {
	public static void main(String[] args) {
	 
		circle c1=new circle();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your radius for circle: ");
		double radius=sc.nextDouble();
		
		System.out.println("Area is :  "+c1.area(radius));
		System.out.println("circumfrence is:  "+c1.circumfrence());
		System.out.println("Perimeter is: "+c1.perimeter(radius));
		

	}

}
