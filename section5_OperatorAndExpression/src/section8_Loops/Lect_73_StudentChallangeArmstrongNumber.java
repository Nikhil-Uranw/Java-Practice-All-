
//problem01-display didgits of a number
//problem02-count digits of a number
//problem03-write a code for know armstrong number armstrong number



//solution 01;_-
/**package section8_Loops;;
import java.util.Scanner;
public class Lect_73_StudentChallangeArmstrongNumber {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number: ");
		int n=sc.nextInt();
		
		while(n>0) {
			int r=n%10;
			    n=n/10;
			    System.out.println(r);
		}
		//System.out.println(n);
	}

}**/



//solution 02-
/**package section8_Loops;;
import java.util.Scanner;
public class Lect_73_StudentChallangeArmstrongNumber {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number: ");
		int count=0;
		int n=sc.nextInt();
		while(n>0)
		{
			n=n/10;
			count++;
		}
		System.out.println(count);
	}

}**/



//solution03-armstrong number
package section8_Loops;
import java.util.Scanner;
public class Lect_73_StudentChallangeArmstrongNumber {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to validat it is armstrong number or not: ");
		int n=sc.nextInt();
		int sum=0;
		int orig=n;
		
		while(n>0)
		{
			int r=n%10;
			sum=sum+r*r*r;
			n=n/10;
		}
		if(sum==orig) {
			System.out.println("it is armstrong number: "+orig);
		}else
		{
			System.out.println("It is not an armstrong Number: "+orig);
		}
		}

}
