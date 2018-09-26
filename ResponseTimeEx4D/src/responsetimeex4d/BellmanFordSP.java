/*
Mathew Buck
CIS 27 Lab 4
 */
package responsetimeex4d;

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
    private double weight = 0;

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

        for (int i = 0; i < edgeTo.length; i++) {
            if (edgeTo[i] != null) {
                weight += edgeTo[i].weight();
            }
        }
    }

    public double weight() {
        return weight;
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

    public void displayTree() {
        System.out.println("Edge Weighted Directed Graph, Path from "
                + "source node " + source + ": ");
        for (int i = 0; i < edgeTo.length; i++) {
            System.out.println("Edge: " + edgeTo[i]);
        }
    }

    public DirectedEdge[] edges() {
        return edgeTo;
    }

    public double[] distTo() {
        return distTo;
    }

    public int pathSize() {
        return pathSize;
    }

    //total cumulative distance of all edges to the source node.
    public double totDistSource() {
        double tot = 0;
        for (int i = 0; i < distTo.length; i++) {
            tot += distTo[i];
        }
        return tot;
    }

    //finds path from source s to target v
    public Stack<DirectedEdge> pathTo(int v) {
        validateVertex(v);
        if (hasNegativeCycle()) {
            throw new UnsupportedOperationException("Negative cost cycle");
        }
        if (!hasPathTo(v)) {
            return null;
        }
        Stack<DirectedEdge> path = new Stack<DirectedEdge>();
        for (DirectedEdge e = edgeTo[v]; e != null; e = edgeTo[e.from()]) {
            path.push(e);
        }
        return path;
    }

    public boolean hasPathTo(int v) {
        validateVertex(v);
        return distTo[v] < Double.POSITIVE_INFINITY;
    }

    // throw an IllegalArgumentException unless {@code 0 <= v < V}
    private void validateVertex(int v) {
        int V = distTo.length;
        if (v < 0 || v >= V) {
            throw new IllegalArgumentException("vertex " + v
                    + " is not between 0 and " + (V - 1));
        }
    }

    public int source() {
        return source;
    }

}
