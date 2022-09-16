package Mert.AdjacencyMatrix;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(4);

        graph.add(0,1);
        graph.add(0,2);
        graph.add(0,3);
        graph.add(1,2);

        graph.print();
    }
}
