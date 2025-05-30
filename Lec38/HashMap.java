package Lec38;

import java.util.ArrayList;

public class HashMap<K, V> {
	class Node {
		K key;
		V value;
		Node next;
	}

	private ArrayList<Node> bukt;
	private int size = 0;

	public HashMap() {
		// TODO Auto-generated constructor stub
		this(4);
	}

	public HashMap(int n) {
		// TODO Auto-generated constructor stub
		bukt = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			bukt.add(null);
		}
	}

	public void put(K key, V value) {
		int idx = hashfun(key);
		Node temp = bukt.get(idx);// start
		while (temp != null) {
			if (temp.key.equals(key)) {
				temp.value = value;
				return;
			}
			temp = temp.next;
		}
		temp = bukt.get(idx);// start
		Node nn = new Node();
		nn.key = key;
		nn.value = value;
		nn.next = temp;
		bukt.set(idx, nn);
		size++;
		double thf=2.0;
		double lf=(1.0*size)/bukt.size();
		if(lf>thf) {
			rehashing();
		}

	}

	private void rehashing() {
		// TODO Auto-generated method stub
		ArrayList<Node> new_bukt = new ArrayList<>();
		for (int i = 0; i < 2*bukt.size(); i++) {
			new_bukt.add(null);
		}
		ArrayList<Node> temp=bukt;
		size=0;
		bukt=new_bukt;
		for(Node head: temp) {
			while(head!=null) {
				put(head.key, head.value);
				head=head.next;
			}
		}
		
	}
	@Override
	public String toString() {
		String s="{";
		for(Node head: bukt) {
			while(head!=null) {
				s=s+head.key+"="+head.value+", ";
				head=head.next;
			}
		}
		return s+"}";
	}
	

	public V get(K key) {
		int idx = hashfun(key);
		Node temp = bukt.get(idx);// start
		while (temp != null) {
			if (temp.key.equals(key)) {

				return temp.value;
			}
			temp = temp.next;
		}
		return null;
	}

	public boolean containKey(K key) {
		int idx = hashfun(key);
		Node temp = bukt.get(idx);// start
		while (temp != null) {
			if (temp.key.equals(key)) {

				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public V reomve(K key) {
		int idx = hashfun(key);
		Node curr = bukt.get(idx);// start
		Node prev = null;
		while (curr != null) {
			if (curr.key.equals(key)) {
				break;
			}
			prev = curr;
			curr = curr.next;

		}
		if (curr == null) {
			return null;
		}
		if (prev == null) {
			bukt.set(idx, curr.next);

		} else {
			prev.next = curr.next;
		}
		curr.next = null;
		size--;
		return curr.value;

	}

	public int hashfun(K key) {
		int bn = key.hashCode() % bukt.size();
		if (bn < 0) {
			bn += bukt.size();
		}
		return bn;
	}
}
