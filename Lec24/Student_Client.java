package Lec24;

public class Student_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		System.out.println("Hey");
		Student s = new Student();
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.Roll_Number);
		s.name = "Ankit";
		s.age = 18;
		s.Roll_Number = 21;
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.Roll_Number);
		s.Intro_yourSelf();
		Student s1 = new Student();
		s1.name="Raju";
		s1.age=17;
		s1.Roll_Number=89;
		s1.Intro_yourSelf();
		s.SayHey("Kaju");
	//	s.MentorName();
		Student.MentorName();
		
	}
	static {
		System.out.println("I am in static block1 in Student_Clinet class");
	}
	static {
		System.out.println("I am in static block2 in Student_Clinet class");
	}

}
