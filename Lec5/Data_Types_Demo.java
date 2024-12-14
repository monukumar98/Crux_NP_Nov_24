package Lec5;

import java.util.Scanner;

public class Data_Types_Demo {
	public static void main(String[] args) {
//		int n = -9;
//		System.out.println(Integer.MAX_VALUE);
//		byte b = (byte)(428);//-84
//		byte b = (byte)(300);//44
		byte b = 5;
		short s = 10;
		int i = 10;
		long l = 5067799878564564645l;
		i = b;
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		Scanner sc = new Scanner(System.in);
		b = sc.nextByte();
		s = sc.nextShort();
		i = sc.nextInt();
		l = sc.nextLong();
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
//		b =(byte) (b+ 12);
		b += 12;// (byte) (b+ 12);
	}

}
















