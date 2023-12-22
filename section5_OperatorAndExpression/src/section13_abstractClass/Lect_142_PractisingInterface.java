package section13_abstractClass;

interface Test{
	void meth1();
	void meth2();
}

class IntefacreTest implements Test{
	
	public void meth1() {System.out.println("meth1 from IntefaceTest: ");}
	public void meth2() {System.out.println("meth2 from IntefaceTest class: ");}
}

public class Lect_142_PractisingInterface {
	public static void main(String[] args) {
		
		Test in=new IntefacreTest();
		in.meth1();
		in.meth2();
		
	}

}
