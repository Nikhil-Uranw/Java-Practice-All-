//find a redix redix means given string ya jo number hai vo binary hai ya octal hai ya decimal hai yahexadecimal hai pta lagana:
//find given year is a leap year or what


//solutinon 01
/**package section7_ConditionalStatement;

import java.util.Scanner;

public class Lect_62_StudentChallange_FindRedix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Number: ");
		String str=sc.next();
		
		if(str.matches("[01]+")) {
			System.out.println("it is Binary Redix: "+str);
		}
		else if(str.matches("[0-7]+")) {
			System.out.println("it is octal Redix: "+str);
		}
		else if(str.matches("[0-9]+")) {
			System.out.println("Decimal Redix: "+str);
		}
		else if(str.matches("[0-9A-F]+")) {
			System.out.println("It is HEXADECIMAL Redix: "+str);
		}
		else {
			System.out.println("It is invalid number"
					+ "");
		}
	}

}**/



package section7_ConditionalStatement;

import java.util.Scanner;

public class Lect_62_StudentChallange_FindRedix {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in) ;
	System.out.println("Enter your Year: ");
	int year=sc.nextInt();
	
	if(year%4==0 && year%100 !=0 || year%400==0) {
		System.out.println("It is a leap year: "+year);
	}
	else {
		System.out.println("It is not a leap year: "+year);
	}
	
		
		
	}

}
