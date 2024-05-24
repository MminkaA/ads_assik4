import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch<V> extends Search<V> {
    public BreadthFirstSearch(MyGraph<V> graph, V source) {
        super(source);
        bfs(graph, source);
    }

    private void bfs(MyGraph<V> graph, V source) {
        Queue<V> queue = new LinkedList<>();
        queue.add(source);
        marked.add(source);

        while (!queue.isEmpty()) {
            V v = queue.poll();
            Vertex<V> vertex = graph.getVertex(v);

            for (Vertex<V> adjacentVertex : vertex.getAdjacentVertices().keySet()) {
                V adjacentVertexData = adjacentVertex.getData();
                if (!marked.contains(adjacentVertexData)) {
                    marked.add(adjacentVertexData);
                    edgeTo.put(adjacentVertexData, v);
                    queue.add(adjacentVertexData);
                }
            }
        }
    }
}
