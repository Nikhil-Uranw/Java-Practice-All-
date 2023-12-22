// inner class 4 types ke hote hai:
//1) nested inner class 2)local inner class 3)anonymus inner class 4) static inner class



//solution 1 local inner class
package section15_InnerClass;

class outer1{
	int x=10;
	public void outerDisplay() {
		System.out.println("under the outer display method:");
		class inner{
			public void innerDisplay() {
				System.out.println("Under inner method");
			}
		}
		inner y=new inner();
		y.innerDisplay();
		
	}
}

public class Lect_151_localAnonymusStaticClass {

	public static void main(String[] args) {
		
		outer1 o=new outer1();
		o.outerDisplay();

	}

}


/**
 package section15_InnerClass;

public class Lect_151_localAnonymusStaticClass {

	public static void main(String[] args) {
		

	}

}
 * */
