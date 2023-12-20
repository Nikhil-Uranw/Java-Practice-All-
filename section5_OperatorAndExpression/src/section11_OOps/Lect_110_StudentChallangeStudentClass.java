package section11_OOps;
 class student {
	 public int roll;
	 public String name;
	 public String course;
	 public int m1,m2,m3;
	 
	 public int totalMarks() {
		 return m1+m2+m3;
	 }
	 
	 public float average() {
		 return (float)totalMarks()/3;
	 }
	 
	 public char Grade() {
		 if(average()>=70)
			 return 'A';
		 else
			 return 'B';
	 }
	 
	 public String toString() {
		return "Roll No."+roll+"/n"+"name: "+name+"/n"+"courser"+course+"/n";
		 
	 }
	 
	 
 }
public class Lect_110_StudentChallangeStudentClass {
	public static void main(String[] args) {
		
		student s1=new student();
		s1.roll=26;
		s1.name="Nikhil Kumar";
		s1.course="Mechanical Engineeringt";
		s1.m1=80;
		s1.m2=99;
		s1.m3=60;
		
		System.out.println("Total is: "+s1.totalMarks());
		System.out.println("Average is: "+s1.average());
		System.out.println("Details is: "+"/n"+ s1);

	}

}
