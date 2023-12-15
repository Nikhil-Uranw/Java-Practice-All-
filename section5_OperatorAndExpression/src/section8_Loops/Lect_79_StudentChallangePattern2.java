//check patterns from book

//pattern1:
/**package section8_Loops;
public class Lect_79_StudentChallangePattern2 {
	public static void main(String[] args) {

		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+",");
			}
			System.out.println("");
		}
	}

}**/




//pattern 2
/**
package section8_Loops;
public class Lect_79_StudentChallangePattern2 {
	public static void main(String[] args) {

		int count=0;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				count++;
				System.out.print(count+",");
			}
			System.out.println("");
		}
	}

}**/




//pattern 3 star pattern
/**package section8_Loops;
public class Lect_79_StudentChallangePattern2 {
	public static void main(String[] args) {

		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
			
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}**/






// pattern4 check fromm book lecture
package section8_Loops;
public class Lect_79_StudentChallangePattern2 {
	public static void main(String[] args) {

	
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5-i+1; j++) {
			    
				System.out.print(j+",");
			}
			System.out.println("");
		}
	}

}
