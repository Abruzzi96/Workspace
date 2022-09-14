package Ayberk.SearchAlgorithms;

public class Main {
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
