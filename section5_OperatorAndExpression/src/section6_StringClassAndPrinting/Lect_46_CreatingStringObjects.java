package section6_StringClassAndPrinting;

public class Lect_46_CreatingStringObjects {

	public static void main(String[] args) {

		String str1 = "Java Program";
		System.out.println(str1);
		
		//in this case we will get true coz both str1 and str11 object has been created in java pool
		String str11 = "Java Program";
		System.out.println(str11==str1);

		
		String str2 = new String("Java program");
		System.out.println(str2);
		
		//in this case we will get false answer coz both str1 object has created in java pool and str2 has created in java heap so both object is not equal 
		String str12 = "Java Program";
		System.out.println(str2==str1);
		

		// method to creating an string when we have char type array
		char c[] = { 'H', 'E', 'L', 'l', 'o' };
		String str3 = new String(c);
		System.out.println(str3);

		// Method for creating String when we have byte type array
		byte b[] = { 65, 66, 67, 68 };
		String str4 = new String(b);
		System.out.println(str4);

		// Method for creating String when we have byte type array
		byte bb[] = { 65, 66, 67, 68 };
		String str5 = new String(bb,1,2);
		System.out.println(str5);
		
		

	}

}
