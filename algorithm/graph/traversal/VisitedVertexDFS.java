package algorithm.graph.traversal;

import datastructure.graph.*;

/**
 * Generic vertex returned by a graph DFS visit
 * @param <D> type of the data object in the graph vertexes
 */
public class VisitedVertexDFS<D> implements VisitedVertex<D> {

	/** visited vertex */
	protected Vertex<D> visited;
	
	/** parent of the visited vertex */
	protected VisitedVertexDFS<D> parent;

	/** discovery time */
	protected int dt;

	/** finish time */
	protected int ft;
	
	/**
   	 * Constructs a vertex visited during a DFS
	 * @param visited visited vertex
   	 * @param parent parent of the visited vertex
	 */	
	public VisitedVertexDFS(Vertex<D> visited, VisitedVertexDFS<D> parent) {
		this.visited = visited;
		this.parent = parent;
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
	public VisitedVertexDFS<D> getParent () {
		return this.parent;
	}
	
	/**
	 * Returns the discovery time of the visited vertex
	 * @return the discovery time of the visited vertex
	 */
	public int getDiscoveryTime () {
		return this.dt;
	}

	/**
	 * Returns the finish time of the visited vertex
	 * @return the finish time of the visited vertex
	 */
	public int getFinishTime () {
		return this.ft;
	}
		
}
