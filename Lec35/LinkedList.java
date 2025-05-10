package Lec35;

public class LinkedList<T> {

	private class Node {
		T val;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	// O(1)
	public void addfirst(T item) {
		Node nn = new Node();
		nn.val = item;
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			nn.next = head;
			head = nn;
			size++;
		}
	}

	// O(1)
	public void addlast(T item) {
		if (size == 0) {
			addfirst(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			tail.next = nn;
			tail = nn;
			size++;
		}

	}

	// O(N)
	public void addatindex(T item, int k) throws Exception {
		if (k == 0) {
			addfirst(item);
		} else if (k == size) {
			addlast(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			Node prev = getNode(k - 1);
			nn.next = prev.next;
			prev.next = nn;
			size++;
		}
	}

	private Node getNode(int k) throws Exception {
		if (k < 0 || k >= size) {
			throw new Exception("Bklol k range me nhi hai ");
		}
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;

	}

	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "-->");
			temp = temp.next;
		}
		System.out.println(".");
	}

	public T getfirst() {
		return head.val;
	}

	public T getlast() {
		return tail.val;
	}

	public T getatindex(int i) throws Exception {
		return getNode(i).val;
	}

	public T removefirst() {
		Node curr = head;
		if (size == 1) {
			head = null;
			tail = null;
			size = 0;
		} else {
			head = head.next;
			curr.next = null;
			size--;
		}
		return curr.val;
	}

	// O(N)
	public T removelast() throws Exception {
		if (size == 1) {
			return removefirst();
		} else {
			T val = tail.val;
			tail = getNode(size - 2);
			tail.next = null;
			return val;
		}

	}

	public T removeatindex(int k) throws Exception {
		if (k == 0) {
			return removefirst();
		} else if (k == size - 1) {
			return removelast();
		} else {
			Node curr = getNode(k);
			Node prev = getNode(k - 1);
			prev.next = curr.next;
			curr.next = null;
			size--;
			return curr.val;

		}
	}

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.addlast("Raj");
		ll.addlast("Kamlesh");
		ll.addlast("Amisha");
		ll.addlast("kaju");
		ll.addlast("Ankit");
		ll.addlast("Ankita");
		ll.Display();

	}
}













