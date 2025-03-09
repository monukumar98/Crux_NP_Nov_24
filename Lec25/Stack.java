package Lec25;

public class Stack {
	private int[] arr;
	private int idx = -1;

	public Stack() {
		// TODO Auto-generated constructor stub
		this(5);
	}

	public Stack(int n) {
		// TODO Auto-generated constructor stub
		arr = new int[n];
	}

	// O(1)
	public boolean isEmpty() {
		return idx == -1;
	}

	// O(1)
	public boolean isFull() {
		return idx == arr.length - 1;
	}

	// O(1)
	public void push(int item) throws Exception {
		if (isFull()) {
			throw new Exception("Bklol stack full hai");
		}
		idx++;
		arr[idx] = item;

	}

	// O(1)
	public int size() {
		return idx + 1;
	}

	// O(1)
	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("Bklol stack isempty hai");
		}
		return arr[idx];
	}

	// O(1)
	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Bklol stack isempty hai");
		}
		int v = arr[idx];
		idx--;
		return v;
	}

	public void Display() {
		for (int i = 0; i < size(); i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
