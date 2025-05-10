package Lec35;

public class Genercis_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = { 10, 20, 30, 40, 50 };
		Display(arr);
		Character[] arr1 = { '1', '2', '3', '4', '5' };
		Display(arr1);
		String[] arr2 = { "Raj", "Kamlesh", "Ankit", "Ankita" };
		Display(arr2);
	}

	public static <T> void Display(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static <T>T get(T[] arr) {
		return arr[0];
	}
}
