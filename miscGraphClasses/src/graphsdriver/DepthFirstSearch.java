/*
Mathew Buck
CIS 27 Lab 4
 */
package graphsdriver;

public class DepthFirstSearch {

    private boolean[] marked;
    private int count;

    public DepthFirstSearch(Graph graph, int source) {
        marked = new boolean[graph.verts()];
        dfs(graph, source);
    }

    private void dfs(Graph graph, int vertex) {
        marked[vertex] = true;
        count++;
        for (int w : graph.adj(vertex)) {
            if (!marked[w]) {
                dfs(graph, w);
            }
        }
    }

    public boolean marked(int w) {
        return marked[w];
    }

    public int count() {
        return count;
    }

    public void displayMarked(){
        for(int i = 0; i < marked.length; i++){
            System.out.println(marked[i]);
        }
    }
}
