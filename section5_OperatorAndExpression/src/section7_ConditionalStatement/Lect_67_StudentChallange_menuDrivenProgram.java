// write java program for menu add,substrcat,divison , multiplication use switch case 

package section7_ConditionalStatement;

import java.util.Scanner;

public class Lect_67_StudentChallange_menuDrivenProgram {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 
	 System.out.println("MENU");
	 System.out.println("==============================================================");
	 System.out.println("ADD");
	 System.out.println("SUB");
	 System.out.println("MUL");
	 System.out.println("DIV");
	 
	 System.out.println("Enter two numbers");
	 int x=sc.nextInt();
	 int y=sc.nextInt();
	 
	 System.out.println("Enter options from menu");
	 String option=sc.next();
	 
	 String option1=option.toUpperCase();
	 
	 switch (option1) {
	 
	 case "ADD": System.out.println("Addition is : "+(x+y));
	             break;
	 case "SUB": System.out.println("Substraction is: "+(x-y)); 
	             break;
	 case "MUL": System.out.println("Multiplicatiopn is: "+(x*y)); 
	             break;
	 case "DIV": System.out.println("Divison is: "+(x%y)); 
	             break;
	 default :  System.out.println("Invalid option");
	            break;
	 
	 }
	 
	 

	}

}
