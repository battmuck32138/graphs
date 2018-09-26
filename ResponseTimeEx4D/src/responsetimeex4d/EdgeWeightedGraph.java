/*
Mathew Buck
CIS 27 Lab 4
 */
package responsetimeex4d;

public class EdgeWeightedGraph {

    private final int V;//num of verticies
    private int E;//num of edges
    private Bag<Edge>[] adj;

    public EdgeWeightedGraph(int V) {
        this.V = V;
        this.E = 0;
        adj = (Bag<Edge>[]) new Bag[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new Bag<Edge>();
        }
    }

    //num of verticies
    public int V() {
        return V;
    }

    //num of edges
    public int E() {
        return E;
    }

    public void addEdge(Edge e) {
        int v = e.either();
        int w = e.other(v);
        adj[v].add(e);
        adj[w].add(e);
        E++;
    }

    public Iterable<Edge> adj(int v) {
        return adj[v];
    }

    public Iterable<Edge> edges() {
        Bag<Edge> b = new Bag<Edge>();
        for (int v = 0; v < V; v++) {
            for (Edge e : adj[v]) {
                if (e.other(v) > v) {
                    b.add(e);
                }
            }
        }
        return b;
    }
    
    public void displayEWG(){
        for(int i = 0; i < adj.length; i++){
            adj[i].displayBag();
        }
    }

}
