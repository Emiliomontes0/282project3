
import java.util.*;
import java.io.*;

public class Graph<V> {
	private List<V> vertices = new ArrayList<>();
	private List<List<Edge>> neighbors = new ArrayList<>(); // Adjacency lists

	public Graph(V[] vertices, int[][] edges) {
		this.vertices = new ArrayList<>(Arrays.asList(vertices));
		createGraph(this.vertices, edges);
	}

	public void createGraph(List<V> vertices, int[][] edges) {
		for (int i = 0; i < vertices.size(); ++i)
			neighbors.add(new ArrayList<Edge>());

		for (int i = 0; i < edges.length; ++i) {
			neighbors.get(edges[i][0]).add(new WeightedEdge(edges[i][0], edges[i][1], edges[i][2]));
		}

	}

	public void dfs(V startVertex) {
		// TODO
	}

	public void bfs(V startVertex) {
		// TODO
            Queue <V> queue = new LinkedList<V>();
            queue.add(startVertex);
            while(!queue.isEmpty())
            {
                
            }
	}

	public void kruskalMST() {
		// TODO

	}

	public void shortestPath(V startVertex, V endVertex) {
		// TODO
	      
	}

	public void printGraph() {
		for (int i = 0; i < vertices.size(); ++i) {
			System.out.print(vertices.get(i) + ":");
			System.out.println(neighbors.get(i));
		}
	}
}
