package algorithm.graph.APSP;

import datastructure.graph.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

/**
 * Generic graph computation of the shortest path for each pair of source-target vertexes
 * using the Floyd-Warshall algorithm
 * @param <D> type of the data object in the graph vertexes
 */
public class FloydWarshall<D> implements APSP<D> {

	/**
   	 * Constructs a FloydWarshall object exposing the AllPairsShortestPaths method
	 */	
	public FloydWarshall() { }
	
	/**
	 * Computates the shortest paths for each pair of source-target vertexes using the Floyd-Warshall algorithm
	 * and returns the next relation that associates to each pair of source-target vertexes the
	 * first edge in the corresponding shortest path (returns null if there are negative cycles); Cost: O(n<sup>3</sup>),
	 * where n is the number of vertexes in the graph
	 * @param graph the graph on which the shortest paths must be computed
	 * @return a map that associates to each vertex another map associating 
	 * to each target destination the next edge in the corresponding shortest path	
   	 * (null in case of negative cycles)	
	 */	
	public  Map<Vertex<D>, Map<Vertex<D>,Edge<D>>> AllPairsShortestPaths(Graph<D> graph) {

		Map<Vertex<D>, Map<Vertex<D>,Edge<D>>> next = 
				new HashMap<Vertex<D>, Map<Vertex<D>,Edge<D>>>();

		ArrayList<Vertex<D>> vert = graph.vertexes();
		ArrayList<Edge<D>> edge = graph.edges();

		Map<Vertex<D>, Integer> map = new HashMap<Vertex<D>, Integer>();		

		for (int i = 0; i < vert.size(); i++) {
			map.put(vert.get(i), i);
			next.put(vert.get(i), new HashMap<Vertex<D>,Edge<D>>());
		}
		
		double[][] dist = new double[vert.size()][vert.size()];
		
		for (int i=0; i<vert.size(); i++) {
			for (int j=0; j<vert.size(); j++) {
				if (i==j) 
					dist[i][j] = 0.0;
				else 
					dist[i][j] = Double.POSITIVE_INFINITY;
					next.get(vert.get(i)).put(vert.get(j),null);
			}
		}
		
		for (int l=0; l<edge.size(); l++) {
			Edge<D> e = edge.get(l);
			int s = map.get(e.getSource());
			int d = map.get(e.getDest());
			dist[s][d] = e.getWeight();
			next.get(vert.get(s)).put(vert.get(d),e);
		}
		
		for (int k=0; k<vert.size(); k++) {
			for (int x=0; x<vert.size(); x++) {
				for (int y=0; y<vert.size(); y++) {
					if (dist[x][k]+dist[k][y] < dist[x][y]) {
						dist[x][y] = dist[x][k]+dist[k][y];
						next.get(vert.get(x)).
							put(vert.get(y), next.get(vert.get(x)).get(vert.get(k)));
					}
				}		
			}
		}
		// negative cycles check
		for (int x=0; x<vert.size(); x++) {
			if  (dist[x][x] < 0) {
				return null;
			}
		}
		
		return next;	
	}

}

