package section13_abstractClass;

abstract class Super11{
	Super11(){
		System.out.println("Super class constructor: ");
	}
	
	public void meth1() {System.out.println("Super1 meth1: ");}
	
	abstract void meth2();
}

class Sub11 extends Super11{
	
	public void meth2() {
		System.out.println("sub class meth2: ");
	}
}


public class Lect_134_AbstractClass {
	public static void main(String[] args) {
		
// we can create reference of abstract class we cannot create an object of abstract class so
		
		Super11 su=new Sub11();
		su.meth1();
		su.meth1();
	}

}
