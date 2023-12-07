// problem 1- reverse a string
//problem 2- to given string is anagram or not
/**package section6_StringClassAndPrinting;
public class Lect_58_StringProblems {
	public static void main(String[] args) {
	
		String str="Hello";
		StringBuilder sb=new StringBuilder();
		for(int i=str.length()-1; i>=0; i--) {
			sb.append(str.charAt(i));
		}
System.out.println(sb);
	}

}**/


// solution 2nd


 package section6_StringClassAndPrinting;

import java.util.Arrays;

public class Lect_58_StringProblems {
	
	public static boolean isAnagram(String s1, String s2) {
		String str1=s1.replaceAll("//s", "");
		String str2=s2.replaceAll("//s", "");
		
		if(str1.length() != str2.length()) {
			return false;
		}else {
			char c1[]= str1.toLowerCase().toCharArray();
			char c2[]=str2.toLowerCase().toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			return Arrays.equals(c1, c2);

			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(isAnagram("cat", "act"));
		

	}

}
  
