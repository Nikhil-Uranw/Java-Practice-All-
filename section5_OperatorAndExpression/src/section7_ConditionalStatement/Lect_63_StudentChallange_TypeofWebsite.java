//problem1: print day based on number like for 1 monday, for 2 tuesday  
// problem 2: print protocol of website and type of website 
// example  http:www.goofgle.com  here protocol is http means hypertext transfer protocol and type is com means commercial 

/**
package section7_ConditionalStatement;

import java.util.Scanner;

public class Lect_63_StudentChallange_TypeofWebsite {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your day Number");
		int day=sc.nextInt();
		
		if(day==1) {
			System.out.println("MONDAY");
		}
		else if(day==2) {
			System.out.println("TUESDAY");
			
		}
		else if(day==3) {
			System.out.println("WEDNESSDAY");
		}
		else if(day==4) {
			System.out.println("THRUSDAY");
		}
		else if(day==5) {
			System.out.println("FRIDAY");
		}
		else if(day==6) {
			System.out.println("SATURDAY");
		}
		else if(day==7) {
			System.out.println("SUNDAY");
		}
		else {
			System.out.println("Invalid day Number");
		}
	}

}
**/


// solution
 package section7_ConditionalStatement;

import java.util.Scanner;

public class Lect_63_StudentChallange_TypeofWebsite {
	public static void main(String[] args) {
		System.out.println("Enter Your website");
       Scanner sc=new Scanner(System.in);
       String url=sc.next();
       
       String protocol=url.substring(0, url.indexOf(":"));
       if(protocol.equals("https")) {
    	   System.out.println("HyperText Transfer Protocol");
       }
       else if(protocol.equals("ftp")) {
    	   System.out.println("FIle Transfer Protocol;");
       }
       
       String type=url.substring(url.lastIndexOf(".")+1);
       if(type.equals("com")) {
    	   System.out.println("Commercial website");
       }
       else if(type.equals("gov")) {
    	   System.out.println("Government website");
       }
       else if(type.equals("net")) {
    	   System.out.println("Network website");
       }
       else {
    	   System.out.println("Invalid Website");
       }
       
	}

}
 
