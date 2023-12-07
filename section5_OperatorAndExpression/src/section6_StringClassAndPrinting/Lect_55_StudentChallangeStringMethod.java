//find if the email id is on gmail
//find username and domain name in gmail

package section6_StringClassAndPrinting;

import java.util.Scanner;

public class Lect_55_StudentChallangeStringMethod {

	public static void main(String[] args) {
		/*
		 * Scanner sc=new Scanner(System.in); System.out.println("Enter email ID:  ");
		 * String str1; str1=sc.next();
		 */
		String str="nikhiluranw123@gmail.com";
		
		int i=str.indexOf("@");
		String uname= str.substring(0, i);
		String domain= str.substring(i+1, str.length());
		
		System.out.println("Usernam is: "+uname);
		System.out.println("Domain name is: "+domain);
		
		int j=domain.indexOf(".");
		String str2=domain.substring(0, j);
		System.out.println(str2.equalsIgnoreCase("Gmail"));
		
		
	}

}
