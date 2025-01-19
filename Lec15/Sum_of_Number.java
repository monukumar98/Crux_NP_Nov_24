package Lec15;

public class Sum_of_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		System.out.println(sum(n));
	}

	public static int sum(int n) {
		if(n==0) {
			return 0;
		}
		int s=sum(n-1);
		return s+n;

	}
}
