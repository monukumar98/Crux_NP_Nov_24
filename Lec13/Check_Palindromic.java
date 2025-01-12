package Lec13;

public class Check_Palindromic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "naman";
		System.out.println(Palindromic(s));

	}

	public static boolean Palindromic(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;

	}
}
