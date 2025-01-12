package Lec13;

public class SubString_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="codingblocks";
		System.out.println(s.substring(2, 7));
		System.out.println(s.substring(2));
		System.out.println(s.substring(4, 4));
		printSubString(s);

	}

	public static void printSubString(String s) {
		// TODO Auto-generated method stub
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j <=s.length(); j++) {
				System.out.println(s.substring(i, j));
			}
		}
	}

}
