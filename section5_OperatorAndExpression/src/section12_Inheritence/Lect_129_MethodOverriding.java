package section12_Inheritence;

class car{
	public void start() {System.out.println("car started: ");}
	public void accelarate() {System.out.println("car is accelerated : ");}
	public void changeGear() {System.out.println("Car gear is changed: ");}
	
	
}

class LuxuryCar extends car{
	public void changeGear() {System.out.println("Automatic gear: ");}
	public void openRoof() {System.out.println("Luxury car open roof is open :");}
}


public class Lect_129_MethodOverriding {
	public static void main(String[] args) {
		car c=new car();
		c.start();
		c.accelarate();
		c.changeGear();
		
		LuxuryCar lx=new LuxuryCar();
		lx.changeGear();
		lx.openRoof();
		lx.start();
		lx.accelarate();
		
		car cl=new LuxuryCar();
		cl.accelarate();
		cl.changeGear();
		cl.start();
		cl.changeGear();
	}

}
