// here we will see diffrence between method overloading and method overriding 
//01-method overloading work in compile time polymorphism

//02- then how method overriding works on run time polymorphism


/**
package section12_Inheritence;
public class Lect_133_polyMorphismUsingoverloadingOverriding {
	
	public int max(int a, int b) {
		if(a>b)
			return a;
		else
			return b;
	}
	
	public int max(int a, int b, int c) {
		if(a>b && a>c)
			return a;
		else if(b>c)
			return b;
		else
			return c;
	}
	
	
	public static void main(String[] args) {
		Lect_133_polyMorphismUsingoverloadingOverriding ss=new Lect_133_polyMorphismUsingoverloadingOverriding();
	      System.out.println(ss.max(10, 20));
	       System.out.println(ss.max(10, 20, 30));
		

	}

}**/


// 02-for run time polymorphism method overriding
package section12_Inheritence;
class super12{
	public void display() {System.out.println("display of super class: ");}
	
}

class sub12 extends super12{
	public void display() {System.out.println("display of sub class");}
}

public class Lect_133_polyMorphismUsingoverloadingOverriding {
	public static void main(String[] args) {
		super12 sup=new super12();
		sup.display();
		
		sub12 su=new sub12();
		su.display();
		
		super12 s=new sub12();
		s.display();

	}

}
