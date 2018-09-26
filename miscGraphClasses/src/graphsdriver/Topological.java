/*
Mathew Buck
CIS 27 Lab 4
 */
package graphsdriver;


//Need to change my DepthFirstOrder class to take a DirectedGraph instead of
//a WeightedDirectedGraph to use this code.  
public class Topological {

    
//    
//    
//    private Iterable<Integer> order;// topological order
//    private int[] rank;// rank[v] = position of vertex v in topological order
//
//    //Determines whether the digraph {@code G} has a topological order and, if
//    //so, finds such a topological order.
//    public Topological(DiGraph G) {
//        DirectedCycle finder = new DirectedCycle(G);
//        if (!finder.hasCycle()) {
//            DepthFirstOrder dfs = new DepthFirstOrder(G);
//            order = dfs.reversePost();
//            rank = new int[G.V()];
//            int i = 0;
//            for (int v : order) {
//                rank[v] = i++;
//            }
//        }
//    }
//
//    //Determines whether the edge-weighted digraph {@code G} has a topological
//    //order and, if so, finds such an order.
//    public Topological(EdgeWeightedDigraph G) {
//        EdgeWeightedDirectedCycle finder = new EdgeWeightedDirectedCycle(G);
//        if (!finder.hasCycle()) {
//            DepthFirstOrder dfs = new DepthFirstOrder(G);
//            order = dfs.reversePost();
//        }
//    }
//
//    //Returns a topological order if the digraph has a topologial order, and
//    //{@code null} otherwise.
//    public Iterable<Integer> order() {
//        return order;
//    }
//
//    //Does the digraph have a topological order?
//    public boolean hasOrder() {
//        return order != null;
//    }
//
//    //Does the digraph have a topological order?
//    public boolean isDAG() {
//        return hasOrder();
//    }
//
//    //The the rank of vertex {@code v} in the topological order; -1 if the
//    //digraph is not a DAG
//    public int rank(int v) {
//        validateVertex(v);
//        if (hasOrder()) {
//            return rank[v];
//        } else {
//            return -1;
//        }
//    }
//
//    // throw an IllegalArgumentException unless {@code 0 <= v < V}
//    private void validateVertex(int v) {
//        int V = rank.length;
//        if (v < 0 || v >= V) {
//            throw new IllegalArgumentException("vertex " + v + 
//                    " is not between 0 and " + (V - 1));
//        }
//    }

}
