// problem 01- code for reverse a number
//problem 02- code for pallindrome number



//solution 01---
/**package section8_Loops;
import java.util.Scanner;
public class Lect_74_StudentChallangePellindromeNumber {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number for reverse: ");
		int rev=0, r;
		int n=sc.nextInt();
		
		while(n>0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		System.out.println(rev);
	}

}**/



//solution 02----
package section8_Loops;

import java.util.Scanner;

public class Lect_74_StudentChallangePellindromeNumber {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number to check pellindrome: ");
		int n=sc.nextInt();
		int rev=0,m,r;
		m=n;
		while(n>0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
	 if(rev==m) {
		 System.out.println("it is a pallindrome number:  "+rev);
	 }else
	 {
		 System.out.println("It is not a pallindromne number: "+m);
	 }
	}

}
