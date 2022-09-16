package Mert.AdjacencyList;

import java.util.ArrayList;

public class Graph {
    ArrayList<ArrayList<Integer>> graph;
    int numberOfElements;

    public Graph(int numberOfElements) {
        this.graph = new ArrayList<>();
        this.numberOfElements = numberOfElements;

        for (int i = 0; i < numberOfElements; i++){
            graph.add(new ArrayList<>());
        }
    }

    void add(int i, int j){
        graph.get(i).add(j);
        graph.get(j).add(i);
    }

    void remove(Integer i, Integer j){
        graph.get(i).remove(j);
        graph.get(j).remove(i);
    }

    void print(){
        for (int i = 0; i < numberOfElements; i++){
            System.out.print("Vertex " + i + ":");
            for (int j = 0; j < graph.get(i).size(); j++ ){
                System.out.print(" -> " + graph.get(i).get(j));
            }
            System.out.println();
        }
    }

}
