package section6_StringClassAndPrinting;

public class Lect_54_StringMatchingWithRegularExpression {
	public static void main(String []args) {
		
		String str1="aaaabbbbbbbccccccc";
		System.out.println(str1.matches("[abc]*"));
		
		String str2="aaacc";
		System.out.println(str2.matches("[abc]{3,7}"));
		
		String str3="johngmail.com";
		System.out.println(str3.matches(".*gmail.*"));
		System.out.println(str3.matches("\\w*gmail(.*)"));
		
		
	}

}
