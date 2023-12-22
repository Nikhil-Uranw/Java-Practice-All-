package section12_Inheritence;

class TV{
	public void switchOn() {System.out.println("Tv is ON");}
	
	public void changeChannle() {System.out.println("Tv channle is changed: ");}
}

class smartTv extends TV{
	public void switchOn() {System.out.println("Smart Tv switch on: ");}
	
	public void changeChannle() {System.out.println("smart tv channle changed: ");}
}

public class Lect_128_ExampleForMethodOverriding {
	public static void main(String[] args) {
		
		TV t=new TV();
		t.switchOn();
		t.changeChannle();
		
		smartTv smt=new smartTv();
		smt.switchOn();
		smt.changeChannle();
		
		TV s=new smartTv();
		s.changeChannle();
		s.switchOn();
	}

}
