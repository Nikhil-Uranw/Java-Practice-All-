package section10_Methods;

import java.util.Scanner;

public class Lect_90_WritingMethods {
	int  max(int a, int b) {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a b: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		Lect_90_WritingMethods lw=new Lect_90_WritingMethods();
		System.out.println(lw.max(a, b));
		
	}

}
