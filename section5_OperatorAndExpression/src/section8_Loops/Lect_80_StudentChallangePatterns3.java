
//pattern 1;
/**package section8_Loops;
public class Lect_80_StudentChallangePatterns3 {

	public static void main(String[] args) {
  
		for(int i=1; i<=5;i++) {
			for(int j=1; j<=5; j++) {
				if(j>=i) {
					System.out.print(j+",");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}

}**/




//pattern 2;
/**package section8_Loops;
public class Lect_80_StudentChallangePatterns3 {

	public static void main(String[] args) {

		for(int i=1; i<=5;i++) {
			for(int j=1; j<=5; j++) {
				if(j>=i) {
					System.out.print("*"+"");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}

}**/





package section8_Loops;

public class Lect_80_StudentChallangePatterns3 {

	public static void main(String[] args) {
	
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++){
				if((i+j)>5) {
					System.out.print("*");
				}else {
				System.out.print(" ");
				}
			}
			System.out.println("");
		}

	}

}

