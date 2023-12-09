//1st problem- Remove special character from string
// 2nd problem Remove extra space from string
//3rd problem- find number of words in string

//solution 1
/**package section6_StringClassAndPrinting;
public class Lect_57_StudentChallangeStringMEthod {
	public static void main(String[] args) {
		String str1="i%L$U#123%%&((0A---     @@#45";
		System.out.println(str1.replaceAll("[^A-Za-z0-9]",""));
		

	}

}**/

//2nd solution
/**package section6_StringClassAndPrinting;
public class Lect_57_StudentChallangeStringMEthod {
	public static void main(String[] args) {
String str="      abc     def     gh   ijk    ";
        
        str=str.replaceAll("\\s+", " ").trim();
        
        String words[]=str.split("\\s");
        
        System.out.println(words.length);
        
	}

}**/

package section6_StringClassAndPrinting;

public class Lect_57_StudentChallangeStringMEthod {
	public static void main(String[] args) {

		String str="Hello";
		StringBuilder sb=new StringBuilder();
		for(int i=str.length()-1; i>=0; i-- ) {
			 sb.append(str.charAt(i));
			 
		}
		System.out.println(sb);
	}
}
