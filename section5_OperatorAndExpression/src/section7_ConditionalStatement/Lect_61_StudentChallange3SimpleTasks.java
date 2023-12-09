//write a logic to know given number is odd or even
// write a programe to know by persons age he is young or not
//3rd write a programe for grade system depends on average marks of student
/**
package section7_ConditionalStatement;

import java.util.Scanner;

public class Lect_61_StudentChallange3SimpleTasks {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number: ");
		
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println("Number is Even: "+num);
		}
		else {
			System.out.println("Number is odd: "+num);
		}
	
	}

}
**/



//2nd solution
/**
package section7_ConditionalStatement;

import java.util.Scanner;

public class Lect_61_StudentChallange3SimpleTasks {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your Age: ");
	int age=sc.nextInt();
	
	if(age<16) {
		System.out.println("Hii you are children");
	}
	else if(age>16 && age<40) {
		System.out.println("Hii you are very young: ");
	}
	else {
		System.out.println("You are old now:  ");
	}
	

	}

}
**/



package section7_ConditionalStatement;

import java.util.Scanner;

public class Lect_61_StudentChallange3SimpleTasks {
 public static void main(String[] args) {
	 int m1,m2,m3;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter your marks m1  :");
	 m1=sc.nextInt();
	 System.out.println("Enter your Marks m2 : ");
	 m2=sc.nextInt();
	 System.out.println("Enter your Marks m3 : ");
	 m3=sc.nextInt();
	 
	 float avg=(float)m1+m2+m3/3;
	 
	 if(avg>80) {
		 System.out.println("You got A Grade with average: "+avg);
	 }
	 else if(avg<80 && avg>70) {
		 System.out.println("you got B Grade with Average Marks: "+avg);
	 }
	 else if(avg>60 && avg<70) {
		 System.out.println("You got C Grade with average marks : "+avg);
		 
	 }
	 else {
		 System.out.println("E Grade"+avg);
	 }
	  
 }
 }