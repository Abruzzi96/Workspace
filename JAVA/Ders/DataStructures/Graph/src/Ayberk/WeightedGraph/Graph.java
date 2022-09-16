package Ayberk.WeightedGraph;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    List<List<Node>> adj_list;

    // graph constructor
    public Graph(List<Edge> edges){
        adj_list = new ArrayList<>();

        // adjacency list memory allocation
        for(int i = 0; i<edges.size(); i++){
            adj_list.add(i,new ArrayList<>());
        }

        // add edges to the graph
        for(Edge e : edges){
            // allocate new node in adjacency list from src to dest
            adj_list.get(e.src).add(new Node(e.dest,e.weight));
        }
    }

    public void printGraph(){
        int srcVertex = 0;
        int listSize = adj_list.size();

        System.out.println("The contents of the graph: ");

        while(srcVertex < listSize){
            for(Node edge : adj_list.get(srcVertex)){
                System.out.println("Vertex: " + srcVertex + " ==> " + edge.value + " (" + edge.weight + ")\t");
            }

            System.out.println();
            srcVertex++;
        }
    }
}
