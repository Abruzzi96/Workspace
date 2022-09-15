package Ayberk.SearchAlgorithms;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS {
    private int V;
    private LinkedList<Integer> adjList[];

    BFS(int numOfVertices){
        this.V = numOfVertices;
        this.adjList = new LinkedList[V]; // niye this ile yaptık ?

        for(int i = 0; i<V; i++){
            adjList[i] = new LinkedList<>();
        }
    }

    void addEdge(int source, int destination){
        adjList[source].add(destination);
    }

    void bfs(int start){
        boolean[] visited = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[start] = true; // fonksyonlar diğerleri gibi while içerisinde değil, peki w içerisinde olamaz mı ?
        queue.add(start);

        while(queue.size() != 0){
            start = queue.poll();
            System.out.print(start + " ");

            for (int num : adjList[start]) {
                if (!visited[num]) {
                    visited[num] = true;
                    queue.add(num);
                }
            }
        }
    }

    public static void main(String[] args) {
        BFS graph = new BFS(5);

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(1,2);
        graph.addEdge(2,4);

        graph.bfs(0);
    }
}
