package Mert.AdjacencyMatrix;

public class Graph {
    public boolean graph[][];
    int numOfElements;

    public Graph(int numOfElements) {
        this.graph = new boolean[numOfElements][numOfElements];
        this.numOfElements = numOfElements;
    }

    void add(int i, int j){
        graph[i][j] = true;
        graph[j][i] = true;
    }
    void delete(int i, int j){
        graph[i][j] = false;
        graph[j][i] = false;
    }
    void print(){
        for (int i = 0; i < numOfElements; i++){
            for (int j = 0; j < numOfElements; j++){
                if(!graph[i][j])
                    System.out.print("0 ");
                else
                    System.out.print("1 ");
            }
            System.out.println();
        }
    }

}
