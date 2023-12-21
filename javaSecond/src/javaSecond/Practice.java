//display number in words event tailling zeroa also 

package javaSecond;
class parent{
	public parent() {
		System.out.println("non param from Parent constructor: ");
	}
	
	public parent(int x) {
		System.out.println("param from parent: "+x);
	}
	
	
}

class child extends parent{
	public child() {
		System.out.println("Non param from child: ");
	}
    
	public child( int y) {
		System.out.println("param from child: "+y);
	}

}

class grandChild extends child{
	public grandChild() {
		System.out.println("non param from grand child: ");
	}
	public grandChild(int x, int y, int z) {
		super(x);
		System.out.println("x value is: "+x+","+" "+" y value is: "+y+", "+"z value is: "+z);
	}
}


public class Practice {

	public static void main(String[] args) {
		
		grandChild gc=new grandChild(11,12,13);
		

	}

}
