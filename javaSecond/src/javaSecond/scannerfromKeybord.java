package javaSecond;

import java.util.Scanner;

public class scannerfromKeybord {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number");
		int A = sc.nextInt();
		int B= sc.nextInt();
		
		int sum = A+B;
		
		System.out.println("sum is: "+ sum);

	}

}
