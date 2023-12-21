// lets create inheritence from circle to cylinder

package section12_Inheritence;
class circl{
	public int radius;
	
	public double area() {
		return Math.PI*radius*radius;
	}
	
	public double Perimeter() {
		return 2*Math.PI*radius*radius;
	}
	
	public double Circumfrence() {
		return Perimeter();
	}
	
}

class Cylindder extends circl{
	double hight;
	public double volume() {
		return area()*hight;
	}
}
public class Lect_121_PractisingInheritence {
	public static void main(String[] args) {
		
		// here we extend the properti of circle class in cylindder class so we can create object of cylindder class
		//only anwe can access all the methods and properties of circle class
		
		Cylindder clndr=new Cylindder();
		
		clndr.radius=19;
		clndr.hight=78;
		
		System.out.println(clndr.area());
		System.out.println(clndr.volume());
		
		
		
		
	}

}
