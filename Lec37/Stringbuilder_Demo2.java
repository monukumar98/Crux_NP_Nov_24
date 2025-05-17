package Lec37;

public class Stringbuilder_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_Time();
	//	StringBuilder_Time();

	}

	public static void String_Time() {
		String s = "";
		for (int i = 0; i < 1000000; i++) {
			s = s + i;
		}
	}

	public static void StringBuilder_Time() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 1000000; i++) {
			sb = sb.append(i);
		}
	}
}
