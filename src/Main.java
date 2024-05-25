public class Main {
    public static void main(String[] args) {
        WeightedGraph<String> weightedGraph = new WeightedGraph<>(false);
        fillWithWeights(weightedGraph);



        System.out.println("Dijkstra:");
        Search<String> djk = new DijkstraSearch<>(weightedGraph, "Almaty");
        outputPath(djk, "Kyzylorda");



        System.out.println("--------------------------------");



        MyGraph<String> graph = new MyGraph<>(false);
        fillWithoutWeights(graph);



        System.out.println("DFS:");
        Search<String> dfs = new DFS<>(graph, "Almaty");
        outputPath(dfs, "Kyzylorda");



        System.out.println("--------------------------------");



        System.out.println("BreadthFirstSearch:");
        Search<String> bfs = new BreadthFirstSearch<>(graph, "Almaty");
        outputPath(bfs, "Kyzylorda");
    }


    public static void fillWithoutWeights(MyGraph<String> graph) {
        graph.addEdge("Almaty", "Pavlodar");
        graph.addEdge("Shymkent", "Taraz");
        graph.addEdge("Uralsk", "Astana");
        graph.addEdge("Astana", "Almaty");
        graph.addEdge("Shymkent", "Astana");
        graph.addEdge("Astana", "Kostanay");
        graph.addEdge("Aktau", "Taldykorgan");
        graph.addEdge("Almaty", "Karaganda");
        graph.addEdge("Aktobe", "Karaganda");
        graph.addEdge("Pavlodar", "Ust-Kamenogorsk");
        graph.addEdge("Kyzylorda", "Turkestan");
        graph.addEdge("Aktau", "Uralsk");
        graph.addEdge("Kokshetau", "Petropavlovsk");
        graph.addEdge("Semey", "Pavlodar");
        graph.addEdge("Atyrau", "Aktobe");
        graph.addEdge("Taraz", "Kyzylorda");
    }


    public static void fillWithWeights(WeightedGraph<String> graph) {
        graph.addEdge("Almaty", "Astana", 2.1);
        graph.addEdge("Shymkent", "Atyrau", 7.8);
        graph.addEdge("Atyrau", "Astana", 7.1);
        graph.addEdge("Almaty", "Shymkent", 7.2);
        graph.addEdge("Shymkent", "Astana", 3.9);
        graph.addEdge("Astana", "Kostanay", 3.5);
        graph.addEdge("Shymkent", "Kyzylorda", 5.4);
        graph.addEdge("Almaty", "Karaganda", 4.5);
        graph.addEdge("Aktobe", "Karaganda", 6.3);
        graph.addEdge("Pavlodar", "Ust-Kamenogorsk", 2.8);
        graph.addEdge("Kyzylorda", "Turkestan", 3.1);
        graph.addEdge("Aktau", "Uralsk", 8.0);
        graph.addEdge("Kokshetau", "Petropavlovsk", 1.7);
        graph.addEdge("Semey", "Pavlodar", 2.3);
        graph.addEdge("Atyrau", "Aktobe", 5.6);
        graph.addEdge("Taraz", "Kyzylorda", 4.7);
    }


    public static void outputPath(Search<String> search, String key) {
        for (String v : search.pathTo(key)) {
            System.out.print(v + " -> ");
        }
        System.out.println();
    }
}
