package section6_StringClassAndPrinting;

public class Lect_48PractisingStringMethods1 {

	public static void main(String[] args) {
		
		String str=new String("NetBeans");
		
		int len=str.length();
		System.out.println(len);
		
		String str2=str.toUpperCase();
		System.out.println(str2);
		
		String str3=str.toLowerCase();
		System.out.println(str3);
		
		String str4=str.trim();
		System.out.println(str4);
		
		String str5=str.substring(1);
		System.out.println(str5);
		
		String str6=str.substring(2, 7);
		System.out.println(str6);
		
		String str7=str.replace('e', 'M');
		System.out.println(str7);
		

	}

}
