/*
Mathew Buck
CIS 27 Lab 4
 */
package graphsdriver;

//Directed Graph data type
public class DiGraph {

    private final int verts;//Num of vertices
    private int edges;//Num of edges
    private Bag<Integer>[] adj;//Adjaceny list

    //Create a v-vertex graph with no edges.
    public DiGraph(int verts) {
        this.verts = verts;
        this.edges = 0;
        adj = (Bag<Integer>[]) new Bag[verts];
        for (int i = 0; i < verts; i++) {
            adj[i] = new Bag<Integer>();
        }
    }

    //Number of verticies.
    public int verts() {
        return verts;
    }

    //Number of edges.
    public int edges() {
        return edges;
    }

    //Add edgge v-w to the graph.
    public void addEdge(int vert1, int vert2) {
        adj[vert1].add(vert2);
        edges++;
    }

    //Vertices adjacent to v.
    public Iterable<Integer> adj(int v) {
        return adj[v];
    }

    //returns a copy with all edges reversed. 
    public DiGraph reverse() {
        DiGraph r = new DiGraph(verts);
        for (int v = 0; v < verts; v++) {
            for (int w : adj(v)) {
                r.addEdge(w, v);
            }
        }
        return r;
    }

    //Displays the graphs adjacency list. 
    public String toSting() {
        String s = verts + " vertices, " + edges + " edges\n";
        for (int i = 0; i < verts; i++) {
            s += i + ": ";
            for (int w : this.adj(i)) {
                s += w + " ";
            }
            s += "\n";
        }
        return s;
    }

}
