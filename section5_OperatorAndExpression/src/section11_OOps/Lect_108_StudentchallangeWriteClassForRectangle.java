package section11_OOps;
class Rectangle{
	public double length;
	public double breadth;
	
	public Rectangle() {
		length=1;
	}
	
	public Rectangle(double l, double b) {
		breadth=b;
	}
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	public double area()
    {
        return length*breadth;
    }
    
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    
    public boolean isSquare()
    {
        if(length==breadth)
            return true;
        else
            return false;
    }
    
}

public class Lect_108_StudentchallangeWriteClassForRectangle {
	public static void main(String[] args) {
		
		 Rectangle r=new Rectangle();
	        r.length=10.5;
	        r.breadth=5.5;
	        
	        System.out.println("Area"+r.area());
	        System.out.println("perimeter"+r.perimeter());
	        
	        System.out.println("Is it a Square"+r.isSquare());

	}

}
