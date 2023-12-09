//if a=4 ,b=8, c=100 then write code logic for getting who is greater then all
/**
package section7_ConditionalStatement;

import java.util.Scanner;

public class Lect_60_PractisingConditionalStatement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a ki value: ");
		int a=sc.nextInt();
		System.out.println("Enter b ki value: ");
		int b=sc.nextInt();
		System.out.println("Enter c ki value: ");
		int c=sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("Greater number is a: "+a);
		}
		else if(b>c) {
			System.out.println("Greater number is B: "+b);
		}
		else {
			System.out.println("C is Greater Number: "+c);
		}

	}

}**/


// for grade system of students how you wil deal 90 or more marks =A grade, 80 se upar= grade B, 70 se upar = C grade marks
package section7_ConditionalStatement;

import java.util.Scanner;

public class Lect_60_PractisingConditionalStatement {
	public static void main(String[] args) {
		int m;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Marks: ");
		m=sc.nextInt();
		
		if(m>90) {
			System.out.println("congretulations u got a grade A: "+m);
		}
		else if(m>80 && m<90) {
			System.out.println("ooh you got Grade B: "+m);
		}
		else if(m>70 && m<80) {
			System.out.println("hey you got C grade: "+m);
		}
		else {
			System.out.println("Congrets you are failled: "+m+" marks");
		}
		

	}

}
