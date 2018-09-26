/*
Mathew Buck
CIS 27 Lab 4
 */
package detconectcompsofdigraph;

//Conected Components of a graph.
public class ConComps {

    private boolean[] marked;
    private int[] id;
    private int count = 0;

    public ConComps(DiGraph g) {
        marked = new boolean[g.verts()];
        id = new int[g.verts()];
        for (int s = 0; s < g.verts(); s++) {
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

    public boolean connected(int v, int w) {
        return id[v] == id[w];
    }

    public int id(int v) {
        return id[v];
    }

    public int count() {
        return count;
    }
}
