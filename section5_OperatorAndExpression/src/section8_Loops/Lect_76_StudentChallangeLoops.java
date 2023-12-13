//problem 01- write a code to display AP series for Nth Term.
// problem 02- Display GP series for Nth term.
// display fibonaci series for NTh Term


//solution 01---
/**package section8_Loops;
import java.util.Scanner;
public class Lect_76_StudentChallangeLoops {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a, d and n:");
		int a=sc.nextInt();
	    int d=sc.nextInt();
	    int n=sc.nextInt();
	    int term=a;
	    for(int i=0; i<n; i++)
	    {
	    	System.out.print(term+","+"");
	    	term=term+d;
	    }
		
	}

}**/




/**package section8_Loops;

import java.util.Scanner;

public class Lect_76_StudentChallangeLoops {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a,r,n:  ");
		int a=sc.nextInt();
		int r=sc.nextInt();
		int n=sc.nextInt();
		
		int term=a;
		for(int i=0; i<n; i++)
		{
			System.out.print(term+","+"");
			term=term*r;
		}
	}

}**/
 





package section8_Loops;

import java.util.Scanner;

public class Lect_76_StudentChallangeLoops {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a and b, n:  ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int n=sc.nextInt();
		int c;
		System.out.print(a+","+b+",");
		for(int i=0; i<n-2; i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+",");
		}
	}

}
