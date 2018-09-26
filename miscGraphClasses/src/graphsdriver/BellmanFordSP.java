/*
Mathew Buck
CIS 27 Lab 4
 */
package graphsdriver;

//Finds shortest path from source v to all nodes. 
public class BellmanFordSP {

    private double[] distTo;//length of path to v
    private DirectedEdge[] edgeTo;//last edge on path to v
    private boolean[] onQ;//is this vertex on the queue?
    private Queue<Integer> queue;//verticies being relaxed
    private int cost;//number of calls to relax()
    private Iterable<DirectedEdge> cycle;//negative cycle in edgeTo[]
    private int source;
    private int pathSize;

    //s is source 
    public BellmanFordSP(EdgeWeightedDigraph G, int s) {
        this.source = s;
        distTo = new double[G.V()];
        edgeTo = new DirectedEdge[G.V()];
        onQ = new boolean[G.V()];
        queue = new Queue<Integer>();
        for (int v = 0; v < G.V(); v++) {
            distTo[v] = Double.POSITIVE_INFINITY;
        }
        distTo[s] = 0.0;
        queue.enqueue(s);
        onQ[s] = true;
        while (!queue.isEmpty() && !this.hasNegativeCycle()) {
            int v = queue.dequeue();
            onQ[v] = false;
            relax(G, v);
        }
        pathSize = edgeTo.length;
    }

    private void relax(EdgeWeightedDigraph G, int v) {
        for (DirectedEdge e : G.adj(v)) {
            int w = e.to();
            if (distTo[w] > distTo[v] + e.weight()) {
                distTo[w] = distTo[v] + e.weight();
                edgeTo[w] = e;
                if (!onQ[w]) {
                    queue.enqueue(w);
                    onQ[w] = true;
                }
            }
            if (cost++ % G.V() == 0) {
                findNegativeCycle();
            }
        }
    }

    private void findNegativeCycle() {
        int V = edgeTo.length;
        EdgeWeightedDigraph spt;
        spt = new EdgeWeightedDigraph(V);
        for (int v = 0; v < V; v++) {
            if (edgeTo[v] != null) {
                spt.addEdge(edgeTo[v]);
            }
        }
        EdgeWeightedCycleFinder cf;
        cf = new EdgeWeightedCycleFinder(spt);
        cycle = cf.cycle();
    }

    public boolean hasNegativeCycle() {
        return cycle != null;
    }

    public Iterable<DirectedEdge> negativeCycle() {
        return cycle;
    }

    public void displayPath() {
        System.out.println("Edge Weighted Directed Graph, Path from "
                + "source " + source + ": ");
        for (int i = 0; i < edgeTo.length; i++) {
            System.out.print("Edge: " + edgeTo[i] + ", Distance from source "
                    + source + " is " + distTo[i]);
            System.out.println();
        }
    }

    public DirectedEdge[] edges() {
        return edgeTo;
    }

    public double[] distTo() {
        return distTo;
    }

    public int pathSize(){
        return pathSize;
    }
}
