package algorithm.graph.traversal;

import datastructure.graph.*;
import java.util.ArrayList;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.HashMap;

/**
 * Implementation of the BFS traversal for graphs containing generic data. Returns an ArrayList of VisitedVertex<D>
 * @param <D> type of the data object in the graph vertexes
 */
public class BFS<D> implements Traversal<D> {
	
	/**
   	 * Constructs a BFS object exposing the visit method
	 */	
	public BFS() { 
		// empty on purpose because there is nothing to initialize
	}
	
	/**
	 * Performs a visit of a passed graph and returns tha ArrayList with the visited vertexes
	 * created as objects of type VisitedVertexBFS<D>
	 * @param graph the graph to visit
	 * @param source the initial source vertex (irrelevant in case of DFS)
	 * @return the ArrayList with the visited vertexes
	 */	
	public ArrayList<VisitedVertex<D>> visit(Graph<D> graph, Vertex<D> source) {
		VisitedVertexBFS<D> u;
		Vertex<D> v;
		ArrayList<Edge<D>> adj;
		Map<Vertex<D>, Boolean> visited = new HashMap<Vertex<D>, Boolean>();
		ArrayList<VisitedVertex<D>> l = new ArrayList<VisitedVertex<D>>();
		Queue<VisitedVertexBFS<D>> q = new ArrayDeque<VisitedVertexBFS<D>>();	
			
		ArrayList<Vertex<D>> vert = graph.vertexes();	
		for (int i=0; i<vert.size(); i++) {
			visited.put(vert.get(i), false);
		}
		visited.put(source, true);
		VisitedVertexBFS<D> visitedVertex = new VisitedVertexBFS<D>(source,null,0);
		l.add(visitedVertex);
		q.add(visitedVertex);
		while (!q.isEmpty()) {
			u = q.remove();
			adj = graph.outEdges(u.getVertex());
			for (int j=0; j<adj.size(); j++) {
				v = (adj.get(j)).getDest();
				if (!visited.get(v)) {
					visited.put(v,true);
					visitedVertex = new VisitedVertexBFS<D>(v,u,u.dist + 1);
					l.add(visitedVertex);
					q.add(visitedVertex);
				}
			}			
		}
		return l;
	}
		
}
