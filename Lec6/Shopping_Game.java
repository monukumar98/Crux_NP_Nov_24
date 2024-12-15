package Lec6;

import java.util.Scanner;

public class Shopping_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();// test case
		while (t > 0) {
			int n = sc.nextInt();// aayush
			int m = sc.nextInt();// harshit
			Game(n, m);
			t--;
		}

	}

	public static void Game(int n, int m) { // n--> aayush m-->harshit
		int a = 0;
		int h = 0;
		int phone = 1;
		while (true) {
			a = a + phone;
			if (a > n) {
				System.out.println("Harshit");
				break;

			}
			phone++;
			h = h + phone;
			if (h > m) {
				System.out.println("Aayush");
				break;

			}
			phone++;
		}

	}
}
