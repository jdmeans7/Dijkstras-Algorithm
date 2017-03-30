import java.util.*;

/** \Class
 * 
 * @author Jason
 * Class that uses Dijkstra's algorithm to find the shortest path from source vertex to all other vertices in a graph
 * 
 */

public class Dijkstra {
	/** \method shortestPath
	 * 
	 * @param Graph g
	 * @param int s
	 * @return int[]
	 * 
	 */
	public static int[] shortestPath(Graph g, int s){
		int[] dist = new int[g.size()];
		int[] prev = new int[g.size()];
		dist[s] = 0;
		ArrayList<Integer> S = new ArrayList<Integer>();
		ArrayList<Integer> Q = new ArrayList<Integer>();
		for(int j = 0; j<g.size();j++){
			dist[j] = 500;
			Q.add(j);
		}
		dist[s] = 0;
		int index = 0;
		while(!Q.isEmpty()){
			int min = 501;
			for(int i = 0;i<Q.size();i++){
				if (dist[Q.get(i)] < min){
					min = dist[Q.get(i)];
					index = i;
				}
			}
			int u = Q.remove(index);
			S.add(u);
			int[] neighbors = g.neighbors(u);
			for(int v:neighbors){
				int alt = dist[u] + 1;
				if(alt<dist[v]){
					dist[v] = alt;
					prev[v] = u;
				}
			}
		}
		return dist;
	}
}
