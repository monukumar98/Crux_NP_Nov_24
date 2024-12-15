package Lec6;

import java.util.Scanner;

public class Inverse_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// logic
		System.out.println(Inverse(n));

	}

	public static int Inverse(int n) {
		int sum = 0;
		int place = 1;
		while (n > 0) {
			int rem = n % 10;
			sum = (int) (sum + place * Math.pow(10, rem-1));
			n = n / 10;
			place++;
		}
		return sum;
	}

}











