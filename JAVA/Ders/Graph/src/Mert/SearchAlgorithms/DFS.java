package Mert.SearchAlgorithms;

import java.util.ArrayList;
import java.util.LinkedList;

public class DFS {
    LinkedList<Integer>[] adjList; // que yok ?
    boolean[] visited;

    public DFS(int numOfElements) {
        adjList = new LinkedList[numOfElements];
        visited = new boolean[numOfElements];

        for (int i = 0; i < numOfElements; i++){
            adjList[i] = new LinkedList<>();
        }
    }

    void add(int source, int destination){
        adjList[source].add(destination);
    }

    void dfs(int start){
        visited[start] = true;
        System.out.print(start + " ");

        for (int i : adjList[start]){
            if (!visited[i]){ // direkt visited ekliyoruz başka bişey yok kodlar aynı ??
                dfs(i);
            }
        }
    }

    public static void main(String[] args) {
        DFS dfs = new DFS(5);
        dfs.add(0,1);
        dfs.add(0,2);
        dfs.add(0,3);
        dfs.add(1,2);
        dfs.add(2,4);

        dfs.dfs(0);
    }
}
