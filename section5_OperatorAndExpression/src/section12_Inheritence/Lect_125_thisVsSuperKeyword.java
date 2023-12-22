package section12_Inheritence;

class Rectangle1{
	public int length;
	public int breadth;
	int x=10;
	
	public Rectangle1(int length, int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
}

class cuboid1 extends Rectangle1{
	int hight;
	int x=20;
	public cuboid1(int l, int b, int h) {
		super(l,b);
		hight=h;
	}
	
	public void display() {
		System.out.println(super.x);
		System.out.println(x);
	}
}

public class Lect_125_thisVsSuperKeyword {
	public static void main(String[] args) {
		
		cuboid1 c=new cuboid1(10, 20, 30);
		c.display();

	}

}
