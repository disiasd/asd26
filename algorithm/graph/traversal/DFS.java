package algorithm.graph.traversal;

import datastructure.graph.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Stack;


/**
 * Implementation of the DFS traversal for graphs containing generic data. Returns an ArrayList of VisitedVertex<D>
 * @param <D> type of the data object in the graph vertexes
 */
public class DFS<D> implements Traversal<D> {
	
	private int time;
	private ArrayList<VisitedVertex<D>> l;
	private Map<Vertex<D>, Boolean> visited;
		
	/**
   	 * Constructs a DFS object exposing the visit method
	 */	
	public DFS() { 
		// empty on purpose because there is nothing to initialize
	}
	
	/**
	 * Performs a visit of a passed graph and returns tha ArrayList with the visited vertexes
	 * created as objects of type VisitedVertexDFS<D>
	 * @param graph the graph to visit
	 * @param source the initial source vertex (irrelevant in case of DFS)
	 * @return the ArrayList with the visited vertexes
	 */	
	public ArrayList<VisitedVertex<D>> visit(Graph<D> graph, Vertex<D> source) {
		visited = new HashMap<Vertex<D>, Boolean>();
		Vertex<D> u;
		time = 0;
		
		ArrayList<Vertex<D>> vert = graph.vertexes();	
		for (int i=0; i<vert.size(); i++) {
			visited.put(vert.get(i), false);
		}
		
		l = new ArrayList<VisitedVertex<D>>();
	
		for (int i=0; i<vert.size(); i++) {
			u = vert.get(i);
			if (!visited.get(u)) 
				DFSvisit(graph, new VisitedVertexDFS<D>(u,null));
		}
		
		return l;
	}
	
	/**
	 * Auxiliary function used in the recursive implementation of the DFS visit
	 */	
	private void DFSvisit(Graph<D> g, VisitedVertexDFS<D> v) {
		ArrayList<Edge<D>> adj;
		Vertex<D> u = v.visited, w;
		
		visited.put(u,true);
		l.add(v);
		time++;
		v.dt = time;
		adj = g.outEdges(u);
		for (int j=0; j<adj.size(); j++) {
			w = (adj.get(j)).getDest();
			if (!visited.get(w)) 
				DFSvisit(g, new VisitedVertexDFS<D>(w,v));
		}	
		time++;
		v.ft = time;
	}
	
	
	/**
	 * Auxiliary function used in the iterative implementation of the DFS visit
	 */	
	/*
	private void DFSvisit(Graph<D> g, VisitedVertexDFS<D> v) {
		
		Stack<Pair> s = new Stack<Pair>();
		Pair p;
		ArrayList<Edge<D>> adj;
		Vertex<D> u;
		VisitedVertexDFS<D> w;
		
		visited.put(v.visited,true);
		l.add(v);
		time++;
		v.dt = time;	
		s.push(new Pair(v,0));
		
		while (!s.isEmpty()) {
			
			p=s.peek();
			adj = g.outEdges(p.v.visited);
			if (p.j < adj.size()) {
				u = g.outEdges(p.v.visited).get(p.j++).getDest();
				if (!visited.get(u)) {
					visited.put(u,true);
					w = new VisitedVertexDFS<D>(u,v);
					l.add(w);
					time++;
					w.dt = time;
					s.push(new Pair(w,0));
				}
			} else {
				time++;	
				p.v.ft = time;
				s.pop();
			}
			
		}
		
	}
	
	private class Pair {
		protected VisitedVertexDFS<D> v;
		protected int j;
		public Pair (VisitedVertexDFS<D> v, int j) {
			this.v = v;
			this.j = j;
		}
	}
	*/
		
}
