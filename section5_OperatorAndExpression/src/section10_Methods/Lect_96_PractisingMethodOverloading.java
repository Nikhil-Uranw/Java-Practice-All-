package section10_Methods;
public class Lect_96_PractisingMethodOverloading {
	
	static int max(int x, int y) {
		if(x>y)
			return x;
	 else
		return y;
}
	static float max(float x, float y) {
		if(x>y)
			return x;
		else
			return y;
	}
	
	static int max(int x, int y, int z) {
		if(x>y && x>z)
			return x;
		else if(y>z)
			return y;
		else
			return z;
	}
	
	
	public static void main(String[] args) {
		
		int x=10, y=20; //z=30;
		//float x=2f,y=6f;
		
		//float c=max(x, y);
		int c=max(x, y);
		System.out.println(c);
		
	}

}
