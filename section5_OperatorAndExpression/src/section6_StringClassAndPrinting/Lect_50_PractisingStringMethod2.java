package section6_StringClassAndPrinting;

public class Lect_50_PractisingStringMethod2 {

	public static void main(String[] args) {
		 
       /** String str1="Mr. Shahrukh Khan";
        System.out.println(str1.startsWith("Mr."));
        System.out.println(str1.startsWith("Shah" , 4));
        System.out.println(str1.endsWith("Khan"));
        System.out.println(str1.charAt(4));
        
        for(int i=0;i<str1.length();i++)
            System.out.println(str1.charAt(i)); **/
        
		String str2="www.GeeksForGeeks.com";
		System.out.println(str2.indexOf("G"));
		System.out.println(str2.indexOf("G",5));
		System.out.println(str2.lastIndexOf("."));
		System.out.println(str2.lastIndexOf(".",16));

	}

}
