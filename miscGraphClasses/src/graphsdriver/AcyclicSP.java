/*
Mathew Buck
CIS 27 Lab 4
 */
package graphsdriver;

//Need to change Topological to take an regualr Digraph to use this code
public class AcyclicSP {

//    
//    
//    private double[] distTo;// distTo[v] = distance  of shortest s->v path
//    private DirectedEdge[] edgeTo;// edgeTo[v] = last edge on shortest s->v path
//
//    //Computes a shortest paths tree from {@code s} to every other vertex in
//    //the directed acyclic graph {@code G}.
//    public AcyclicSP(EdgeWeightedDigraph G, int s) {
//        distTo = new double[G.V()];
//        edgeTo = new DirectedEdge[G.V()];
//
//        validateVertex(s);
//
//        for (int v = 0; v < G.V(); v++) {
//            distTo[v] = Double.POSITIVE_INFINITY;
//        }
//        distTo[s] = 0.0;
//
//        // visit vertices in toplogical order
//        Topological topological = new Topological(G);
//        if (!topological.hasOrder()) {
//            throw new IllegalArgumentException("Digraph is not acyclic.");
//        }
//        for (int v : topological.order()) {
//            for (DirectedEdge e : G.adj(v)) {
//                relax(e);
//            }
//        }
//    }
//
//    // relax edge e
//    private void relax(DirectedEdge e) {
//        int v = e.from(), w = e.to();
//        if (distTo[w] > distTo[v] + e.weight()) {
//            distTo[w] = distTo[v] + e.weight();
//            edgeTo[w] = e;
//        }
//    }
//
//    //Returns the length of a shortest path from the source vertex {@code s} to
//    //vertex {@code v}.
//    public double distTo(int v) {
//        validateVertex(v);
//        return distTo[v];
//    }
//
//    //Is there a path from the source vertex {@code s} to vertex {@code v}?
//    public boolean hasPathTo(int v) {
//        validateVertex(v);
//        return distTo[v] < Double.POSITIVE_INFINITY;
//    }
//
//    //Returns a shortest path from the source vertex {@code s} to vertex
//    public Iterable<DirectedEdge> pathTo(int v) {
//        validateVertex(v);
//        if (!hasPathTo(v)) {
//            return null;
//        }
//        Stack<DirectedEdge> path = new Stack<DirectedEdge>();
//        for (DirectedEdge e = edgeTo[v]; e != null; e = edgeTo[e.from()]) {
//            path.push(e);
//        }
//        return path;
//    }
//
//    // throw an IllegalArgumentException unless {@code 0 <= v < V}
//    private void validateVertex(int v) {
//        int V = distTo.length;
//        if (v < 0 || v >= V) {
//            throw new IllegalArgumentException("vertex " + v
//                    + " is not between 0 and " + (V - 1));
//        }
//    }

}
