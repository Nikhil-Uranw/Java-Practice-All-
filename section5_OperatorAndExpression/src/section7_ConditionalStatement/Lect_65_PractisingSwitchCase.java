//simple program to understand switch case 

package section7_ConditionalStatement;

import java.util.Scanner;

public class Lect_65_PractisingSwitchCase {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
        int n=sc.nextInt();
        
        switch(n) {
        case 0: System.out.println("ZERO");
                break;
                
        case 1: System.out.println("ONE");
                break;
                
        case 2: System.out.println("TWO");
                break;
                
        case 3: System.out.println("Three");
                break;
                
        default : System.out.println("Invalid number");
                  break;
        }
	}

}
