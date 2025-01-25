package Lec16;

public class Count_SubSequnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
		System.out.println("\n" + CountSubseqnce(ques, ""));
		// System.out.println(c);

	}

	// static int c = 0;

	public static int CountSubseqnce(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			// c++;
			return 1;
		}

		char ch = ques.charAt(0);
		int a = CountSubseqnce(ques.substring(1), ans);
		int b = CountSubseqnce(ques.substring(1), ans + ch);
		return a + b;

	}

}
