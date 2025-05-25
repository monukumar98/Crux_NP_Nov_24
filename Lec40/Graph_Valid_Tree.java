package Lec40;

import java.util.*;
import java.util.HashMap;
import java.util.List;

public class Graph_Valid_Tree {

	class Solution {
		public boolean validTree(int n, int[][] edges) {
			HashMap<Integer, List<Integer>> map = new HashMap<>();
			for (int i = 0; i < n; i++) {
				map.put(i, new ArrayList<>());
			}
			for (int i = 0; i < edges.length; i++) {
				int a = edges[i][0];
				int b = edges[i][1];
				map.get(a).add(b);
				map.get(b).add(a);
			}
			return BFT(map);
		}
		public boolean BFT(HashMap<Integer, List<Integer>> map) {
			Queue<Integer> q = new LinkedList<>();
			HashSet<Integer> visited = new HashSet<>();
			int c=0;
			for (int src : map.keySet()) {
				if (visited.contains(src)) {
					continue;
				}
				c++;
				q.add(src);
				while (!q.isEmpty()) {
					// 1. remove
					int r = q.poll();
					// 2. Ignore if ALready visited
					if (visited.contains(r)) {
						return false;
					}

					// 3. marked visited
					visited.add(r);

					// 4. self work
					System.out.print(r + " ");
					// 5. add unvisited nbrs
					for (int nbrs : map.get(r)) {
						if (!visited.contains(nbrs)) {
							q.add(nbrs);
						}
					}
				}
			}
			return c==1;
		}
	}

}
