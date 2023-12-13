//problem01- write a code for multiplication table 
//problem02- write a code for sum of n naturals number
//problem03- write a code for find out the factorial of given number;



//solution 01-
/**package section8_Loops;

import java.util.Scanner;

public class Lect_72_StudentChallange {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of that you want multiplication table: ");
		int num=sc.nextInt();
		for(int i=1; i<12; i++)
		{
			System.out.println(num+"*"+i+" = "+num*i);
		}
	}

}**/




// solution 02=
/**package section8_Loops;

import java.util.Scanner;

public class Lect_72_StudentChallange {
	public static void main(String[] args) {
        int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter natural number: ");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			sum=sum+i;
		}
	System.out.println("sum of natural number is: "+n+" is:  = "+sum);
	}

}**/




//solution 03
package section8_Loops;

import java.util.Scanner;

public class Lect_72_StudentChallange {
	public static void main(String[] args) {

		int fect=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number to know factorial: ");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			fect=fect*i;
		}
		System.out.println("Fectorial of given Number is: "+fect);
	}

}
