/**package section10_Methods;
public class Lect_99_VariableArgument {
	
	static void show(int ... A) {
		for(int x:A)
			System.out.print(x+",");
		System.out.println("");
	}
	
	public static void main(String[] args) {
		show();
		show(1,2,3,4,5,6,7);
	    show(10,20,30);
	    show(new int[] {22,23,24,25,26});

	}

}**/


// now if i want to print string and by serial wise
 /**package section10_Methods;
public class Lect_99_VariableArgument {
	
	static void showlist(String ... s) {
		for(int i=0; i<s.length;i++) {
			System.out.println(i+1+". "+s[i]);
		}
	}
	
	public static void main(String[] args) {
		
		showlist("Nikhil", "Pankaj", "Ekant", "Mayank");

	}

} **/



// now if i want to same thing serial of starting name should start from 5 then 
package section10_Methods;
public class Lect_99_VariableArgument {
	
	static void showlist(int start, String ... s) {
		for(int i=0; i<s.length;i++) {
			System.out.println(start+". "+s[i]);
			start++;
		}
	}
	
	public static void main(String[] args) {

		showlist(5,"Nikhil", "Pankaj", "Ekant", "Mayank");

	}

} 

