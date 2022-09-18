package Dev;

import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class Dijkstra {
    public int[] dist;
    public Set<Integer> settled;
    public PriorityQueue<Node> pq;

    public int V;
    List<List<Node>> adj;

    public Dijkstra(int V){
        this.V = V;
        dist = new int[V];
        settled = new HashSet<>();
        pq = new PriorityQueue<Node>(V,new Node());
    }

    // Method1
    //Dijkstra Algorithm
    public void dijkstra(List<List<Node>> adj, int src){
        this.adj = adj;

        for(int i = 0; i<V; i++){
            dist[i] = Integer.MAX_VALUE;
        }

        // Add source node tp the priority queue
        pq.add(new Node(src,0));

        // Distance to the source is 0
        dist[src-1] = 0;

        while(settled.size() != V){
            // Terminating condition check when the pq is empty
            if(pq.isEmpty())
                return;

            // removing the minimum distance node from the pq
            int u = pq.remove().node;

            // Adding the node whose distance is finalized
            if(settled.contains(u))
                //continue keyword skips execution for following check
                continue;

            // we dont have to call e_Neighbours function if u is already present in the setled set
            settled.add(u);
            e_Neighbours(u);
        }
    }

    private void e_Neighbours(int u){
        int edgeDistance = -1;
        int newDistance = -1;

        // All the neighbors of V
        for(int i = 0; i<adj.get(u-1).size(); i++){
            Node v = adj.get(u-1).get(i);

            // if current node has not already been processed
            if(!settled.contains(v.node)){
                edgeDistance = v.cost;
                newDistance = dist[u-1] + edgeDistance;

                if(newDistance < dist[v.node-1])
                    dist[v.node-1] = newDistance;

                pq.add(new Node(v.node, dist[v.node-1]));
            }
        }
    }
}
