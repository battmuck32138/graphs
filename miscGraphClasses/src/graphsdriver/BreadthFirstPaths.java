/*
Mathew Buck
CIS 27 Lab 4
 */
package graphsdriver;

//Finds the shortest path from the source vertex given in the constructor to 
//the pathTo(vertex).
public class BreadthFirstPaths {

    private boolean[] marked;//Is a shortest known path to this vertex.
    private int[] edgeTo;//Last vertex on known path to this vertex.
    private final int s;//source

    public BreadthFirstPaths(Graph g, int s) {
        marked = new boolean[g.verts()];
        edgeTo = new int[g.verts()];
        this.s = s;
        bfs(g, s);
    }

    private void bfs(Graph g, int s) {
        Queue<Integer> q = new Queue<Integer>();
        marked[s] = true;
        q.enqueue(s);
        while (!q.isEmpty()) {
            int v = q.dequeue();
            for (int w : g.adj(v)) {
                if (!marked[w]) {
                    edgeTo[w] = v;
                    marked[w] = true;
                    q.enqueue(w);
                }
            }
        }
    }

    public boolean hasPathTo(int v) {
        return marked[v];
    }

    public Iterable<Integer> pathTo(int v) {
        if (!hasPathTo(v)) {
            return null;
        }
        Stack<Integer> path = new Stack<Integer>();
        for (int x = v; x != s; x = edgeTo[x]) {
            path.push(x);
        }
        path.push(s);
        return path;
    }
    
}
