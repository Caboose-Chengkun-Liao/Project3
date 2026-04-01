import java.util.Iterator;

/**
 * Interface representing all functionalities of a vertex in a graph.
 *
 * @param <T> the type of the vertex label
 */
public interface VertexInterface<T> {

    /**
     * Gets this vertex's label.
     *
     * @return the label
     */
    T getLabel();

    /**
     * Returns the number of neighbors of this vertex.
     *
     * @return number of neighbors
     */
    int getNumberOfNeighbors();

    /**
     * Marks this vertex as visited.
     */
    void visit();

    /**
     * Removes this vertex's visited mark.
     */
    void unvisit();

    /**
     * Returns true if the vertex is visited, false otherwise.
     *
     * @return true if visited
     */
    boolean isVisited();

    /**
     * Connects this vertex to endVertex with a weighted edge.
     * The two vertices cannot be the same and must not already have this edge.
     *
     * @param endVertex  the vertex to connect to
     * @param edgeWeight the weight of the edge
     * @return true if the connection was successful, false otherwise
     */
    boolean connect(VertexInterface<T> endVertex, double edgeWeight);

    /**
     * Connects this vertex to endVertex with an unweighted edge.
     * The two vertices cannot be the same and must not already have this edge.
     *
     * @param endVertex the vertex to connect to
     * @return true if the connection was successful, false otherwise
     */
    boolean connect(VertexInterface<T> endVertex);

    /**
     * Disconnects this vertex from endVertex with a weighted edge.
     * The edge must exist in order to be disconnected.
     *
     * @param endVertex  the vertex to disconnect from
     * @param edgeWeight the weight of the edge
     * @return true if the disconnection was successful, false otherwise
     */
    boolean disconnect(VertexInterface<T> endVertex, double edgeWeight);

    /**
     * Disconnects this vertex from endVertex with an unweighted edge.
     * The edge must exist in order to be disconnected.
     *
     * @param endVertex the vertex to disconnect from
     * @return true if the disconnection was successful, false otherwise
     */
    boolean disconnect(VertexInterface<T> endVertex);

    /**
     * Creates an iterator of this vertex's neighbors by following all edges.
     *
     * @return iterator of neighbor vertices
     */
    Iterator<VertexInterface<T>> getNeighborIterator();

    /**
     * Creates an iterator of the weights of edges from this vertex.
     *
     * @return iterator of edge weights
     */
    Iterator<Double> getWeightIterator();

    /**
     * Sees whether this vertex has at least one neighbor.
     *
     * @return true if this vertex has a neighbor
     */
    boolean hasNeighbor();

    /**
     * Gets an unvisited neighbor of this vertex, if any.
     *
     * @return an unvisited neighbor, or null if none
     */
    VertexInterface<T> getUnvisitedNeighbor();

    /**
     * Records the previous vertex on a path to this vertex.
     *
     * @param predecessor the predecessor vertex
     */
    void setPredecessor(VertexInterface<T> predecessor);

    /**
     * Gets the recorded predecessor of this vertex.
     *
     * @return the predecessor vertex
     */
    VertexInterface<T> getPredecessor();

    /**
     * Sees whether a predecessor was recorded for this vertex.
     *
     * @return true if a predecessor was recorded
     */
    boolean hasPredecessor();

    /**
     * Records the cost of a path to this vertex.
     *
     * @param newCost the cost to record
     */
    void setCost(double newCost);

    /**
     * Returns the cost of a path to this vertex.
     *
     * @return the cost
     */
    double getCost();
}
