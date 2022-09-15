package Ayberk.SearchAlgorithms;

import java.util.Iterator;
import java.util.LinkedList;

public class DFS {
    private LinkedList<Integer>[] adjList;
    private boolean visited[];

    DFS(int vertices){
        adjList = new LinkedList[vertices];
        visited = new boolean[vertices];

        for(int i = 0; i<vertices; i++){
            adjList[i] = new LinkedList<>();
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
                dfs(i); // sadece visited bastırdığımız için q add num ve visited true yok doğru mudur ? vertex printliyoruz sadece
        }
    }

    public static void main(String[] args) {
        DFS dfs = new DFS(5);
        dfs.addEdge(0,1);
        dfs.addEdge(0,2);
        dfs.addEdge(0,3);
        dfs.addEdge(1,2);
        dfs.addEdge(2,4);

        dfs.dfs(0); // 0 ?
    }
}
