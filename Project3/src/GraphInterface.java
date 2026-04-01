import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * Interface representing all functionalities of an undirected graph data structure.
 *
 * @param <T> the type of vertex labels
 */
public interface GraphInterface<T> {

    /**
     * Adds a given vertex to this graph.
     *
     * @param vertexLabel the label of the vertex to add
     * @return true if successful, false if vertexLabel is null or already exists
     */
    boolean addVertex(T vertexLabel);

    /**
     * Removes the vertex with the given label from this graph.
     *
     * @param vertexLabel the label of the vertex to remove
     * @return the removed vertex, or null if it does not exist
     */
    VertexInterface<T> removeVertex(T vertexLabel);

    /**
     * Adds a weighted undirected edge between two distinct vertices.
     *
     * @param begin      label of the first vertex
     * @param end        label of the second vertex
     * @param edgeWeight weight of the edge
     * @return true if the edge was added successfully, false otherwise
     */
    boolean addEdge(T begin, T end, double edgeWeight);

    /**
     * Adds an unweighted undirected edge between two distinct vertices.
     *
     * @param begin label of the first vertex
     * @param end   label of the second vertex
     * @return true if the edge was added successfully, false otherwise
     */
    boolean addEdge(T begin, T end);

    /**
     * Removes a weighted undirected edge between two distinct vertices.
     *
     * @param begin      label of the first vertex
     * @param end        label of the second vertex
     * @param edgeWeight weight of the edge
     * @return true if removal was successful, false otherwise
     */
    boolean removeEdge(T begin, T end, double edgeWeight);

    /**
     * Removes an unweighted undirected edge between two distinct vertices.
     *
     * @param begin label of the first vertex
     * @param end   label of the second vertex
     * @return true if removal was successful, false otherwise
     */
    boolean removeEdge(T begin, T end);

    /**
     * Sees whether an undirected edge exists between two given vertices.
     *
     * @param begin label of the first vertex
     * @param end   label of the second vertex
     * @return true if the edge exists, false otherwise
     */
    boolean hasEdge(T begin, T end);

    /**
     * Returns the number of vertices in this graph.
     *
     * @return number of vertices
     */
    int getNumberOfVertices();

    /**
     * Returns the number of undirected edges in this graph.
     *
     * @return number of edges
     */
    int getNumberOfEdges();

    /**
     * Returns true if this graph is empty, false otherwise.
     *
     * @return true if empty
     */
    boolean isEmpty();

    /**
     * Returns the list of all vertices in the graph, or null if the graph is empty.
     *
     * @return list of vertices, or null
     */
    List<VertexInterface<T>> getVertices();

    /**
     * Clears the graph.
     */
    void clear();

    /**
     * Performs a breadth-first traversal of the graph starting from origin.
     *
     * @param origin the starting vertex label
     * @return a queue containing labels in BFS order
     */
    Queue<T> getBreadthFirstTraversal(T origin);

    /**
     * Returns the shortest path distance between origin and destination.
     * Fills the path stack with vertex labels from origin (top) to destination (bottom).
     * Returns Integer.MAX_VALUE if no path exists.
     *
     * @param origin      starting vertex label
     * @param destination ending vertex label
     * @param path        stack to fill with the path
     * @return shortest distance, or Integer.MAX_VALUE if no path
     */
    int getShortestPath(T origin, T destination, Stack<T> path);
}
