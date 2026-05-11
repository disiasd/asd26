package algorithm.graph.SCC;

import datastructure.graph.*;
import java.util.Map;

/**
 * Generic SCC copmutation interface that returns a Map associating to each vertex
 * the index (an Integer) of its strongly connected component
 */
public interface SCC<D> {

	/**
	 * Performs a visit of a passed graph and returns a Map associating to each vertex
	 * the index (an Integer) of its strongly connected component
	 * @param graph the graph to consider
	 * @return the Map associating to each vertex the index (an Integer) of its strongly connected component
	 */	
	public Map<Vertex<D>,Integer> StronglyConnectedComponents(Graph<D> graph);

}