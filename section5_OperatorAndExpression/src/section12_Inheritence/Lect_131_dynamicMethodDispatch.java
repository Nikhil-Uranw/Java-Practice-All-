package section12_Inheritence;

class Super1{
	public void meth1() {System.out.println("Meth1 of super class");}
	
	public void meth2() {System.out.println("Meth2 of super class:");}
}

class sub1 extends Super1 {
	
	public void meth2() {System.out.println("meth2 of sub class: ");}
	public void meth3() {System.out.println("Meth3 of sub class: ");}
}

public class Lect_131_dynamicMethodDispatch {

	public static void main(String[] args) {
		
		Super1 su=new sub1();// here we have taken refrence of super class and object of sub clas so it will be able to call
		su.meth1(); // only thos methods which aree available on object class as welll as refrence class
		su.meth2();// so here we can call only two methods that are in met1 and meth2 this is called dynamic methd dispatch.

	}

}
