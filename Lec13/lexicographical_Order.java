package Lec13;

public class lexicographical_Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "kunal";
		String s2 = "komal";
//		System.out.println(s1.compareTo(s2));
//		String s3 = "raj";
//		String s4 = "ravi";
//		System.out.println(s3.compareTo(s4));
//		String s5 = "ankit";
//		String s6 = "ankita";
//		System.out.println(s5.compareTo(s6));
		System.out.println(compareTo(s1, s2));

	}

//+ve s1>s2 | -ve s1<s2 | 0 s1==s2
	public static int compareTo(String s1, String s2) {
		if (s1 == s2) {
			return 0;
		}
		int n = Math.min(s1.length(), s2.length());
		for (int i = 0; i < n; i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				return s1.charAt(i) - s2.charAt(i);
			}
		}
		return s1.length()-s2.length();
	}

}










