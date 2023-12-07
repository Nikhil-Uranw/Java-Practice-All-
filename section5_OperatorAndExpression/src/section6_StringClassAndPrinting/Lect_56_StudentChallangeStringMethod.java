//1st problem- find a given number is binary or not
// 2nd problem- find given number is a hexadecimal or not
// 3rd is the given date is in date formate or not


//1st solution
/**package section6_StringClassAndPrinting;
public class Lect_56_StudentChallangeStringMethod {
	public static void main(String[] args) {
		
		int num=1010101;
		String str=String.valueOf(num);
		System.out.println(str.matches("[01]+"));
		
	}

}**/


//2nd solution
/**package section6_StringClassAndPrinting;
public class Lect_56_StudentChallangeStringMethod {
	public static void main(String[] args) {
		
		String str1="109VF27J36AB3547";
		System.out.println(str1.matches("[0-9A-F]+"));
		
	}

}**/




//3rd solution
package section6_StringClassAndPrinting;
public class Lect_56_StudentChallangeStringMethod {
	public static void main(String[] args) {
		
		String str1="08/05/2000";
		System.out.println(str1.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));
		
	}

}
