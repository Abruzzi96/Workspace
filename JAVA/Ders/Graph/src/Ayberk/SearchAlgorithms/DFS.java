package Ayberk.SearchAlgorithms;

import java.util.Iterator;
import java.util.LinkedList;

public class DFS {
    private LinkedList<Integer>[] adjList;
    private boolean visited[];

    DFS(int vertices){
        adjList = new LinkedList[vertices]; // stack ?
        visited = new boolean[vertices];

        for(int i = 0; i<vertices; i++){
            adjList[i] = new LinkedList<>(); // stack bu mu ?
        }
    }

    void addEdge(int src, int dest){
        adjList[src].add(dest);
    }

    void dfs(int vertex){
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int i : adjList[vertex]) {
            if (!visited[i])
                dfs(i); // dfs(i) ?
        }
    }
}
