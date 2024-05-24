public class DFS<V> extends Search<V> {
    public DFS(MyGraph<V> graph, V source) {
        super(source);
        dfs(graph, source);
    }

    private void dfs(MyGraph<V> graph, V source) {
        marked.add(source);

        for (Vertex<V> vertex : graph.getVertex(source).getAdjacentVertices().keySet()) {
            V v = vertex.getData();
            if (!marked.contains(v)) {
                edgeTo.put(v, source);
                dfs(graph, v);
            }
        }
    }
}
