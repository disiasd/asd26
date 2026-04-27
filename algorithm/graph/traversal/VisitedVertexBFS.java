package algorithm.graph.traversal;

import datastructure.graph.*;

/**
 * Generic vertex returned by a graph BFS visit
 * @param <D> type of the data object in the graph vertexes
 */
public class VisitedVertexBFS<D> implements VisitedVertex<D> {
	
	/** visited vertex */
	protected Vertex<D> visited;

	/** parent of the visited vertex */
	protected VisitedVertexBFS<D> parent;
	
	/** distance */
	protected int dist;
	
	/**
   	 * Constructs a visited vertex during a BFS
	 * @param visited visited vertex
   	 * @param parent parent of the visited vertex
   	 * @param dist distance of the visited vertex from the source vertex
	 */	
	public VisitedVertexBFS(Vertex<D> visited, VisitedVertexBFS<D> parent, int dist) {
		this.visited = visited;
		this.parent = parent;
		this.dist = dist;
	}
	
	/**
   	 * Constructs a visited vertex 
	 * @param visited visited vertex
   	 * @param parent parent of the visited vertex
	 */	
	public VisitedVertexBFS(Vertex<D> visited, VisitedVertexBFS<D> parent) {
		this.visited = visited;
		this.parent = parent;
		this.dist = -1;
	}
	
	/**
	 * Returns the visited vertex
	 * @return the visited vertex
	 */
	public Vertex<D> getVertex () {
		return this.visited;
	}

	/**
	 * Returns the parent of the visited vertex
	 * @return the parent of the visited vertex
	 */
	public VisitedVertexBFS<D> getParent () {
		return this.parent;
	}
	
	/**
	 * Returns the distance of the visited vertex from the source vertex 
	 * @return the distance of the visited vertex from the source vertex
	 */
	public int getDistance () {
		return this.dist;
	}
		
	
}
