package Lec24;

public class Student {
	String name;
	int age;
	int Roll_Number;

	public void Intro_yourSelf() {
		System.out.println("My name is " + this.name + " age is " + this.age + " and roll_nuber " + this.Roll_Number);

	}

	public void SayHey(String name) {
//		MentorName();
		System.out.println(this.name + " Say Hey " + name);
	}

	public static void MentorName() {
		// Intro_yourSelf();
		System.out.println("Monu Bhaiya");
	}

	static {
		System.out.println("I am in static block in Student class");
	}
}
