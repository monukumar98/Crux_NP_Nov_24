package Lec37;

public class Stringbuilder_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		// StringBuilder sb = new StringBuilder("hello");capacity--> 16 + 5 =21
		System.out.println(sb.capacity());
		sb.append(1);
		sb.append(2);
		sb.append(true);
		sb.append('a');
		System.out.println(sb);
		sb.append("hello");
		sb.append("Okay");
		System.out.println(sb.length());
		sb.append("a");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.charAt(1));
		System.out.println(sb.substring(1));
		System.out.println(sb.substring(1, 3));
		System.out.println(sb.reverse());
		String s = sb.toString();// stringbulider to string convert
		StringBuilder sb1 = new StringBuilder(s);// String to stringbulider convert

	}

}
