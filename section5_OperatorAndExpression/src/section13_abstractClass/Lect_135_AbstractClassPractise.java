package section13_abstractClass;

abstract class super123{
	public void meth1() {System.out.println("Meth1 of super:");}
	
	abstract void meth2();
}

class sub123 extends super123{
	
	public void meth2() {System.out.println("meth2 of sub123 class:");}
	
}


public class Lect_135_AbstractClassPractise {

	public static void main(String[] args) {
		super123 sup=new sub123();
		sup.meth1();
		sup.meth2();

	}

}
