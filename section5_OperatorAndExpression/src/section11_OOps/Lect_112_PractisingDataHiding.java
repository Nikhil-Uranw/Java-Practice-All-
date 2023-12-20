
//data hiding matlab us class ke property ko hide kar dena means private kr dena;
// now agar data private kr denge to usko keval usi same hi class me access kr payeng but if we wnat to access that data out of this class then what we can do is-
// we can create getter and setter for each data with the help of this we can access the data outside from the class;

//lets undesrtand it by creating class for rectangle
package section11_OOps;

class Rectangle1 {
	private double length;
	private double breadth;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		if (length > 0)
			this.length = length;
		else
			this.length = 0;

	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		if (breadth > 0)
			this.breadth = breadth;
		else
			this.breadth = 0;
	}

	public double area() {
		double area1 = breadth * length;
		return area1;
	}

	public double perimeter() {
		double perimeter1 = 2 * breadth * length;
		return perimeter1;
	}

}

public class Lect_112_PractisingDataHiding {
	public static void main(String[] args) {

		Rectangle1 r1 = new Rectangle1();

		r1.setBreadth(12);
		r1.setLength(90);

		System.out.println(r1.getBreadth());
		System.out.println(r1.getLength());
		System.out.println(r1.area());
		System.out.println(r1.perimeter());

	}

}
