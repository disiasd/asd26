package algorithm.graph.SCC;

import datastructure.graph.*;
import java.util.Map;

/**
 * Implementation of an algorithm for computing Strongly Connected Components
 * on a directed graph containing generic data.
 * <p>
 * Students must implement the {@link #StronglyConnectedComponents(Graph)} method.
 *
 * @param <D> type of the data object stored in the graph vertices
 */
public class SCCcompute<D> implements SCC<D> {

	/**
	 * Constructs a SCCcompute object exposing the StronglyConnectedComponents method.
	 */
	public SCCcompute() {
		// empty on purpose because there is nothing to initialize
	}

	/**
	 * Performs a visit of a passed graph and returns a Map associating to each vertex
	 * the index (an Integer) of its strongly connected component.
	 *
	 * @param graph the directed graph to consider
	 * @return the Map associating to each vertex the index (an Integer) of its strongly connected component
	 */
	public Map<Vertex<D>, Integer> StronglyConnectedComponents(Graph<D> graph) {
		return null;
	}

}
