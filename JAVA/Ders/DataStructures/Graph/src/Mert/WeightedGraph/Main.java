package Mert.WeightedGraph;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Edge> edges = Arrays.asList(
                new Edge(0,1,4), new Edge(1,2,3),
                new Edge(1,3,3), new Edge(2,0,2),
                new Edge(2,4,2), new Edge(4,1,5),
                new Edge(4,3,2)
        );

        Graph graph = new Graph(edges);
        graph.printGraph();
    }
}
