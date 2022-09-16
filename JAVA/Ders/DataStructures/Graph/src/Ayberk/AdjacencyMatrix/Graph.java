package Ayberk.AdjacencyMatrix;

public class Graph {
   private final boolean[][] adjMatrix;
   private final int numOfVertices;

    public Graph(int numOfVertices) {
        this.numOfVertices = numOfVertices;
        adjMatrix = new boolean[numOfVertices][numOfVertices];
    }

    public void addEdge(int source, int destination){
        adjMatrix[source][destination] = true;
        adjMatrix[destination][source] = true;
    }

    public void removeEdge(int source, int destination){
        adjMatrix[source][destination] = false;
        adjMatrix[destination][source] = false;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i<numOfVertices; i++){
            stringBuilder.append(i).append("| ");
            for(boolean j : adjMatrix[i]){
                stringBuilder.append(j ? 1 : 0).append(" ");
            }
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }
}
