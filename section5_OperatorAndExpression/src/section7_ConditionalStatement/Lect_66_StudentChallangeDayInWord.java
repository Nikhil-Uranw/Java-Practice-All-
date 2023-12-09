//display name of a day based on number
// display name of month based on number
// Display type of website




//solution 1
/**
package section7_ConditionalStatement;

import java.util.Scanner;

public class Lect_66_StudentChallangeDayInWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your day number: ");
         int day=sc.nextInt();
         
         switch(day) {
         case 1: System.out.println("MONDAY");
                 break;
         case 2: System.out.println("TUESDAY");
                 break;
         case 3: System.out.println("WEDNESSDAY");
                 break;
         case 4: System.out.println("THRUSDAY");
                 break;
         case 5: System.out.println("FRIDAY");
                 break;
         case 6: System.out.println("SATURDAY");
                 break;
         case 7: System.out.println("SUNDAY");
                 break;
         
         }
	}

}**/


// solution 3rd
 package section7_ConditionalStatement;

import java.util.Scanner;

public class Lect_66_StudentChallangeDayInWord {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your website url");
		String url=sc.next();
		
		String ext=url.substring(url.lastIndexOf(".")+1);
		
		switch(ext) {
		case "com": System.out.println("Commercial website");
		            break;
		            
		case "gov": System.out.println("Government website");            
	                break;
	                
		case "org": System.out.println("Organisational website: ");
		            break;
		            
		default :   System.out.println("Invalid website");
		            break;
		} 
		
		

	}

}


/**
package section7_ConditionalStatement;

public class Lect_66_StudentChallangeDayInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
* */
