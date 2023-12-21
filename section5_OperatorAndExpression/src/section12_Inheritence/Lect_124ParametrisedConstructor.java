// example of parametrised constructor


package section12_Inheritence;

class parent{
	parent(){
		System.out.println("Non param of parent");
	}
	parent(int x){
		System.out.println("param of parent: "+x);
	}
}

class child extends parent{
	
	child(){
		System.out.println("Non param of child: ");
	}
	
	child(int y){
		System.out.println("param of child: "+y);
	}
	child(int x, int y){
		super(x);
		System.out.println("double param from child X and value of Y is :  "+x+","+y);
	}
	
	
}

public class Lect_124ParametrisedConstructor {
	public static void main(String[] args) {
		//child c=new child();
		//child c=new child(10);
		child c=new child(20,30);

	}

}
