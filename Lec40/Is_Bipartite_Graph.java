package Lec40;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;



public class Is_Bipartite_Graph {

	class Solution {
		public boolean isBipartite(int[][] graph) {
			Queue<BipartitePair> q = new LinkedList<>();
			HashMap<Integer, Integer> visited = new HashMap<>();
			for (int vtx = 0; vtx < graph.length; vtx++) {
				if (visited.containsKey(vtx)) {
					continue;
				}
				q.add(new BipartitePair(vtx, 0));
				while (!q.isEmpty()) {
					// 1. remove
					BipartitePair rp = q.poll();
					// 2. Ignore if already visited
					if (visited.containsKey(rp.vtx)) {
						if (visited.get(rp.vtx) != rp.dis) {
							return false;// odd length
						}
						continue;
					}
					// 3. Marked visited
					visited.put(rp.vtx, rp.dis);
					// 4. Self Work
					// 5. Add unvisited nbrs
					for (int nbrs : graph[rp.vtx]) {
						if (!visited.containsKey(nbrs)) {
							q.add(new BipartitePair(nbrs, rp.dis + 1));
						}
					}
				}
			}
			return true;
		}
	}

	class BipartitePair {
		int vtx;
		int dis;

		public BipartitePair(int vtx, int dis) {
			// TODO Auto-generated constructor stub
			this.dis = dis;
			this.vtx = vtx;
		}
	}

}
