/*
Mathew Buck
CIS 27 Lab 4
 */
package graphsdriver;

//not complete yet
public class DirectedCycle {
    
    private boolean[] marked;
    private int[] edgeTo;
    private Stack<Integer> cycle;//vertices on a cycle (in any exist)
    private boolean[] onStack;//vertices on recursive call stack
    
    public DirectedCycle(EdgeWeightedDigraph G){
        onStack = new boolean[G.V()];
        edgeTo = new int[G.V()];
        marked = new boolean[G.V()];
        for(int v = 0; v < G.V(); v++){
            if(!marked[v]) {
                dfs(G, v);
            }
        }
    }
    
    private void dfs(EdgeWeightedDigraph G, int v){
            onStack[v] = true;
            marked[v] = true;
           
                
                
    }
        
        
        
        
        
        
    
    
    
    
    
    
    
}
