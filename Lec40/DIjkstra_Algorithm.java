package Lec40;

import java.util.*;

public class DIjkstra_Algorithm {
	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public DIjkstra_Algorithm(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	class DIjkstraPair {
		int vtx;
		String acqpath;
		int cost;

		public DIjkstraPair(int vtx, String acqpath, int cost) {
			// TODO Auto-generated constructor stub
			this.acqpath = acqpath;
			this.cost = cost;
			this.vtx = vtx;
		}

		@Override
		public String toString() {
			return vtx + " " + acqpath + " @ " + cost;

		}
	}

	public void DIjkstra(int src) {
		PriorityQueue<DIjkstraPair> pq = new PriorityQueue<>(new Comparator<DIjkstraPair>() {

			@Override
			public int compare(DIjkstraPair o1, DIjkstraPair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
		});
		HashSet<Integer> visited = new HashSet<>();
		pq.add(new DIjkstraPair(src, "" + src, 0));
		while (!pq.isEmpty()) {
			DIjkstraPair rp = pq.poll();
			if (visited.contains(rp.vtx)) {
				continue;
			}
			visited.add(rp.vtx);
			System.out.println(rp);
			for (int nbrs : map.get(rp.vtx).keySet()) {
				if (!visited.contains(nbrs)) {
					int cost = map.get(rp.vtx).get(nbrs);
					pq.add(new DIjkstraPair(nbrs, rp.acqpath + nbrs, rp.cost + cost));
				}
			}
		}

	}

	public static void main(String[] args) {
		DIjkstra_Algorithm pa = new DIjkstra_Algorithm(7);
		pa.AddEdge(1, 2, 2);
		pa.AddEdge(2, 3, 3);
		pa.AddEdge(1, 4, 10);
		pa.AddEdge(4, 5, 8);
		pa.AddEdge(3, 4, 1);
		pa.AddEdge(5, 6, 5);
		pa.AddEdge(5, 7, 6);
		pa.AddEdge(6, 7, 4);
		pa.DIjkstra(1);

	}
}
