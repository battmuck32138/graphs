/*
Mathew Buck
CIS 27 Lab 4
 */
package detconectcompsofdigraph;

//Strongly Conected Components of a graph.
public class StrongComponents {

    private boolean[] marked;
    private int[] id;
    private int count = 0;

    public StrongComponents(DiGraph g) {
        marked = new boolean[g.verts()];
        id = new int[g.verts()];
        DepthFirstOrder order = new DepthFirstOrder(g.reverse());
        for (int s : order.reversePost()) {
            if (!marked[s]) {
                dfs(g, s);
                count++;
            }
        }
    }

    private void dfs(DiGraph g, int v) {
        marked[v] = true;
        id[v] = count;
        for (int w : g.adj(v)) {
            if (!marked[w]) {
                dfs(g, w);
            }
        }
    }

    public boolean stronglyConnected(int v, int w) {
        return id[v] == id[w];
    }

    public int id(int v) {
        return id[v];
    }

    public int count() {
        return count;
    }
}
