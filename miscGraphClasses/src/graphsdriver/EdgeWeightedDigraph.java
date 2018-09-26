/*
Mathew Buck
CIS 27 Lab 4
 */
package graphsdriver;

public class EdgeWeightedDigraph {

    private final int V;//number of verticies
    private int E;//number of edges
    private Bag<DirectedEdge>[] adj;//adjacency lists

    public EdgeWeightedDigraph(int V) {
        this.V = V;
        this.E = 0;
        adj = (Bag<DirectedEdge>[]) new Bag[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new Bag<DirectedEdge>();
        }
    }

    public int V() {
        return V;
    }

    public int E() {
        return E;
    }

    public void addEdge(DirectedEdge e) {
        adj[e.from()].add(e);
        E++;
    }

    public Iterable<DirectedEdge> adj(int v) {
        return adj[v];
    }

    public Iterable<DirectedEdge> edges() {
        Bag<DirectedEdge> bag = new Bag<DirectedEdge>();
        for (int v = 0; v < V; v++) {
            for (DirectedEdge e : adj[v]) {
                bag.add(e);
            }
        }
        return bag;
    }

     public void displayEWDG(){
        for(int i = 0; i < adj.length; i++){
            adj[i].displayBag();
        }
    }
    
}
