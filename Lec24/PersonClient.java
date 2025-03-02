package Lec24;

public class PersonClient {

	public static void main(String[] args) {// throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hey");
		Person p = new Person("Kunal", 26);
//		System.out.println(p.name);
//		System.out.println(p.age);
		Person p1 = new Person("Ankita", 23);
//		p1.age = 90;
//		p.name = "Kunala";
		System.out.println(p.getName());
		System.out.println(p1.getName());
		p1.setAge(-9);
		System.out.println(p1.getAge());
		System.out.println("Hello");

	}

}
