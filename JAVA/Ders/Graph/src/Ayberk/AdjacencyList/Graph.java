package Ayberk.AdjacencyList;

import java.util.ArrayList;

public class Graph {
    ArrayList<ArrayList<Integer>> adjList;
    int numberOfElements;

    public Graph(int numberOfElements) {
        this.numberOfElements = numberOfElements;
        adjList = new ArrayList<>(numberOfElements);

        for(int i = 0; i<numberOfElements; i++){
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(Integer source, Integer destination){
        adjList.get(source).add(destination);
        adjList.get(destination).add(source);
    }

    public void removeEdge(Integer source, Integer destination){
        adjList.get(source).remove(destination);
        adjList.get(destination).remove(source);
    }

    void printGraph(){
        for(int i = 0; i<numberOfElements; i++){
            System.out.print("Vertex " + i + ":");
            for(int j = 0; j<adjList.get(i).size(); j++){
                System.out.print(" -> " + adjList.get(i).get(j));
            }
            System.out.println();
        }
    }
}
