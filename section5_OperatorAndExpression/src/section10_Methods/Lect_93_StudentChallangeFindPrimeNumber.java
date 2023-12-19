//Problem01: find prime number 
// Problem02 find GCD
// Probleom03: find max element in an array;


// Solution 01: prime number means jo bhi number ya to 1 se completely devide hoga ya fir khud us number se itself.
//alway factor nikalo us number ka aur key point 
//agar koi number for example 35 to uske half yane ki 17 tk check karo ko vo devide hota hai ki nhi completly
// no need to check pura halfr hi check kro its rule agar half tk ke number se devide ho gya to thik fir usake baad kisi number se devide nhi9 hota
/**package section10_Methods;
import java.util.Scanner;
public class Lect_93_StudentChallangeFindPrimeNumber {
	static boolean isPrimeNumber(int num) {
		for(int i=2;i<num/2; i++) {
			if(num%2==0)
				return false;
			
		}
		return true;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter your number");
		int num=sc.nextInt();
		if(isPrimeNumber(num)) {
			System.out.println("It is Prime number: "+num);
		}else
			System.out.println("it is not a prime number: "+num);
	
		
	}

}**/



//Solution02: finde GCD of two numbers 
// bets trick for this take two number m and n
// now isame jo bhi bada hoga usko chhote vale me ghata do means agar m bada hai to  m=m-n 
// similarly agar n bada hai to n=n-m ye proces ko loop me lga do jab tk ki m==n nahi jata hai
/**package section10_Methods;

import java.util.Scanner;

public class Lect_93_StudentChallangeFindPrimeNumber {
	
	static int findGCD(int m, int n) {
		while(m!=n) {
			if(m>n)
				m=m-n;
			else
				n=n-m;
		}
		return m;
	}
	
	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your two numbers m,n: ");
		int m=sc.nextInt();
		int n=sc.nextInt();
		
	int	c=findGCD(m, n);
	System.out.println("GCD for "+m+","+n+" is: "+c);	
		
		
	}

}**/



// Solution03: finding max element in an array
package section10_Methods;

import java.util.Scanner;

public class Lect_93_StudentChallangeFindPrimeNumber {
	static int maxElement(int A[]) {
		int max1=0;
		for(int i=0; i<A.length;i++) {
			if(A[i]>max1) {
				max1=A[i];
			}
		}
		return max1;
	}
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your array: ");
		int A[]=new int[5];
		for(int i=0; i<A.length; i++) {
			A[i]=sc.nextInt();
		}
		System.out.println("Mex element is: "+maxElement(A));
		
	}

}
