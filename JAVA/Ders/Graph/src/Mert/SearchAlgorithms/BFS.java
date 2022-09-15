package Mert.SearchAlgorithms;

import java.util.LinkedList;

public class BFS {
    LinkedList<Integer>[] adjList;
    LinkedList<Integer> queue; // neden array oluşturmadık ?
    boolean[] visited;

    BFS(int numOfVertices) {
        adjList = new LinkedList[numOfVertices];
        queue = new LinkedList<>();
        visited = new boolean[numOfVertices];

        for (int i = 0; i < numOfVertices; i++){
            adjList[i] = new LinkedList<>();
        }
    }

    void add(int source, int destination){
        adjList[source].add(destination);
    }

    void bfs(int start){
        queue.add(start);
        visited[start] = true;

        while (queue.size() != 0){ // bu yüzden, peki her birini que'ya nası atadık ekledik ?
            start = queue.poll();
            System.out.print(start + " ");

            for(int num: adjList[start]){
                if(!visited[num]){
                    visited[num] = true;
                    queue.add(num); // bu şekilde ?? dimi
                }
            }
        }
    }

    public static void main(String[] args) {
        BFS graph = new BFS(5);

        graph.add(0,1);
        graph.add(0,2);
        graph.add(0,3);
        graph.add(1,2);
        graph.add(2,4);

        graph.bfs(0);
    }
}
