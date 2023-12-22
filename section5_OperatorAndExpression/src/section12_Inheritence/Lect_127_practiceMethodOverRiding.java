package section12_Inheritence;
class Super{
	public void display() {
		System.out.println("super class display Method");
	}
	
}
class sub extends Super{
	public void display() {
		System.out.println("Sub class display method:");
	}
}

public class Lect_127_practiceMethodOverRiding {
	public static void main(String[] args) {
		
		Super sup=new Super();
		sup.display();
		
		sub s=new sub();
		s.display();
		
		Super su=new sub();
		su.display();

	}

}
