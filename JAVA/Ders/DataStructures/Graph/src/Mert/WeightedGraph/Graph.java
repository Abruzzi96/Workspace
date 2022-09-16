package Mert.WeightedGraph;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    List<List<Node>> adjList;

    Graph(List<Edge> edgeList) {
        adjList = new ArrayList<>();

        for (int i = 0; i < edgeList.size(); i++) {
            adjList.add(i, new ArrayList<>());
        }

        for (Edge e : edgeList) {
            adjList.get(e.src).add(new Node(e.dst, e.weight));
        }
    }

    void printGraph() {
        for (int i = 0; i < adjList.size(); i++) {
            System.out.print("Vertex " + (char)(i+65) + ": ");
            for (Node node : adjList.get(i)) {
                System.out.print(" => " + (char)(node.data+65) + "(" + node.weight + ")");
            }
            System.out.println();
        }
    }
}