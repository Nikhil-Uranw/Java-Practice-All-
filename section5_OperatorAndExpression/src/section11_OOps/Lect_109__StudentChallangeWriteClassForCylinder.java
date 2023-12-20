package section11_OOps;

import java.util.Scanner;

class Cylinder{
	public double radius;
	public double hight;
	
	public double lidArea() {
		double lidArea1= Math.PI*radius*radius;
		return lidArea1;
	}
	
	public double perimeter() {
		double perimeter1=2*Math.PI*radius*radius;
		return perimeter1;
		
	}
	
	public double drumArea() {
		double totaldrumArea= 2*lidArea()+perimeter()*hight;
		return totaldrumArea;
	}
	
	public double volume() {
		double volume1=lidArea()*hight;
		return volume1;
	}
	
}

public class Lect_109__StudentChallangeWriteClassForCylinder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius and hight of cylinder: ");
		
		double radius=sc.nextDouble();
		double hight=sc.nextDouble();
		
		Cylinder c1=new Cylinder();
		c1.hight=hight;
		c1.radius=radius;
		
		System.out.println("LidArea of cylinder is: "+c1.lidArea());
		System.out.println("perimetr of cylinder is: "+c1.perimeter());
		System.out.println("totalDr5um Area of cylinder is: "+c1.drumArea());
		System.out.println("Volume of cylinder is: "+c1.volume());
		
		

	}

}
