// write constructor and everything for rectangle class

package section11_OOps;
class Rectengle2{
	
	public double length;
	public double breadth;
	
	public Rectengle2() {
		length=1;
		breadth=1;
	}
	public Rectengle2(double l, double b) {
		length=l;
		breadth=b;
	}
	
	public double getLength() {
		return length;
	}
	
	public void setLength(double l) {
		if(l>0)
			length=l;
		else
			l=0;
	}
	
	public  double getBreadth() {
		return breadth;
	}
	
	public void setBreadth(double b) {
		if(b>0)
			breadth=b;
		else
			b=0;
	}
	
	public double area() {
		return length*breadth;
	}
	
	public double perimeter() {
		return 2*length*breadth;
		
	}
	
	public boolean isSquare() {
		if(length==breadth)
			return true;
		else
			return false;
	}
}

public class Lect_115_PractisingConstructor {

	public static void main(String[] args) {
		 Rectangle r=new Rectangle();
	        r.length=10.5;
	        r.breadth=5.5;
	        
	        System.out.println("Area"+r.area());
	        System.out.println("perimeter"+r.perimeter());
	        
	        System.out.println("Is it a Square"+r.isSquare());

	}

}
