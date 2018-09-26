/*
Mathew Buck
CIS 27 Lab 4
 */
package graphsdriver;

public class LazyPrimMST {
    
    private boolean[] marked;//MST verticies
    private Queue<Edge> mst;//MST edges
    private MinPriorityQue<Edge> pq;//crossing and ineligible edges
    
    public LazyPrimMST(EdgeWeightedGraph G){
        pq = new MinPriorityQue<Edge>(G.E());
        marked = new boolean[G.V()];
        mst = new Queue<Edge>();
        
        visit(G, 0);
        while(!pq.isEmpty()){
            Edge e = pq.delMin();
            int v = e.either();
            int w = e.other(v);
            if(marked[v] && marked[w]){
                continue;
            }
            mst.enqueue(e);
            if(!marked[v]) visit(G, v);
            if(!marked[w]) visit(G, w);
        }
    }
    
    private void visit(EdgeWeightedGraph G, int v){
        marked[v] = true;
        for(Edge e : G.adj(v)){
            if(!marked[e.other(v)]){
                pq.insert(e);
            }
        }
    }
    
    public Iterable<Edge> edges(){
        return mst;
    }
    
    //Returns the sum of the edge weights in a minimum spanning tree (or forest)
    public double weight() {
        double weight = 0.0;
        for (Edge e : edges())
            weight += e.weight();
        return weight;
    }
    
    public void displayMST(){
        mst.displayQue();
    }
    
}
