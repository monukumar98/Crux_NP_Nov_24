package Lec28;

import Lec25.Queue;

public class Dynamic_Queue extends Queue {
	@Override
	public void Enqueue(int item) throws Exception {
		if (isFull()) {
			int[] new_Array = new int[2 * arr.length];
			for (int i = 0; i < arr.length; i++) {
				int idx = (front + i) % arr.length;
				new_Array[i] = arr[idx];
			}
			arr = new_Array;
			front=0;
		}
		super.Enqueue(item);
	}

	public static void main(String[] args) throws Exception {
		Dynamic_Queue dq = new Dynamic_Queue();
		dq.Enqueue(10);
		dq.Enqueue(20);
		dq.Enqueue(30);
		dq.Enqueue(40);
		dq.Enqueue(50);
		System.out.println(dq.Dequeue());
		System.out.println(dq.Dequeue());
		dq.Enqueue(60);
		dq.Enqueue(70);
		dq.Enqueue(80);
		dq.Display();
	}
}

