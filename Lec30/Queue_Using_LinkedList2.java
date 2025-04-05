package Lec30;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Using_LinkedList2 {
	public static void main(String[] args) {
		//LinkedList<Integer> q = new LinkedList<>();
		Queue<Integer> q = new LinkedList<>();
		q.add(10);// addlast
		q.add(20);// addlast
		q.add(1);// addlast
		q.add(109);// addlast
		System.out.println(q.poll());// remove() --> removefirst
		System.out.println(q.peek());// getfirst()--> get fornt

	}

}
