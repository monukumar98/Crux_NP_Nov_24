package Lec21;

public class Check_Primes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7681;
		System.out.println(isPrime(n));
	}

	public static boolean isPrime(int n) {
		int i = 2;
		while (i * i <= n) {
			if(n%i==0) {
				return false;
			}

			i++;
		}
		return true;
		
	}

}
