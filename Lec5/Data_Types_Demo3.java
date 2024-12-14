package Lec5;

import java.util.Scanner;

public class Data_Types_Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'a';
		System.out.println(ch);
		System.out.println((int) (ch));
		ch = (char) (ch + 1);
		System.out.println(ch);
		ch++;// (char) (ch + 1);
		System.out.println(ch);
		ch -= 1;// (char) (ch + 1);
		System.out.println(ch);
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);
		System.out.println(ch);
	}

}
