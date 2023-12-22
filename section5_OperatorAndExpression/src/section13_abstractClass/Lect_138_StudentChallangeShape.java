//you have shape as abstract class so how u wil create concrete class for thos


package section13_abstractClass;

abstract class shape{
	
	public abstract double area();
	public abstract double perimeter();
	
}

class circle123 extends shape{
	double radius;
	
	public double area() {
		return Math.PI*radius*radius;
	}
	
	public double perimeter() {
		return 2*Math.PI*radius*radius;
	}
	
}

class rectengle123 extends shape{
	double length;
	double breadth;
	
	public double area() {
		return length*breadth;
	}
	
	public double perimeter() {
		return 2*length*breadth;
	}
	
}


public class Lect_138_StudentChallangeShape {

	public static void main(String[] args) {
		rectengle123 rec=new rectengle123();
		rec.length=20;
		rec.breadth=28;
		System.out.println(rec.area());
		System.out.println(rec.perimeter());
		
		
		circle123 cir=new circle123();
		cir.radius=90;
		System.out.println(cir.area());
		System.out.println(cir.perimeter());
		
		

	}

}
