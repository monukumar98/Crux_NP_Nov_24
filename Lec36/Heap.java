package Lec36;

import java.util.ArrayList;

public class Heap {
	private ArrayList<Integer> ll = new ArrayList<>();

	public void add(int item) {
		ll.add(item);
		upheapify(ll.size() - 1);
	}

	private void upheapify(int ci) {
		// TODO Auto-generated method stub
		int pi = (ci - 1) / 2;
		if (ll.get(ci) < ll.get(pi)) {
			swap(ci, pi);
			upheapify(pi);
		}

	}

	private void swap(int ci, int pi) {
		// TODO Auto-generated method stub
		int pth = ll.get(pi);
		int cth = ll.get(ci);
		ll.set(pi, cth);
		ll.set(ci, pth);

	}
	public int size() {
		return ll.size();
	}
	public int  get() {
		return ll.get(0);
	}
	public void Display() {
		System.out.println(ll);
	}
	public int remove() {
		swap(0, ll.size()-1);
		int rv=ll.remove(ll.size()-1);
		Downheapify(0);
		return rv;
	}

	private void Downheapify(int pi) {
		// TODO Auto-generated method stub
		int lci=2*pi+1;
		int rci=2*pi+2;
		int mini=pi;
		if(lci<ll.size() && ll.get(lci)<ll.get(mini)) {
			mini=lci;
		}
		if(rci<ll.size() && ll.get(rci)<ll.get(mini)) {
			mini=rci;
		}
		if(mini!=pi) {
			swap(mini, pi);
			Downheapify(mini);
		}
		
	}
	
}




















