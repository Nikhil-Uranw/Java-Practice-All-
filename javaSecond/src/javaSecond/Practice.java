//display number in words event tailling zeroa also 

package javaSecond;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
	
		while(n>0)
		{
			int r=n%10;
			n=n/10;
			System.out.println(r);
		}
		

	}

}
