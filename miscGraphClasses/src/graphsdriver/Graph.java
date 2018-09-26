/*
Mathew Buck
CIS 27 Lab 4
 */
package graphsdriver;

public class Graph {

    private final int verts;//Num of vertices
    private int edges;//Num of edges
    private Bag<Integer>[] adj;//Adjaceny list

    //Create a v-vertex graph with no edges.
    public Graph(int verts) {
        this.verts = verts;
        this.edges = 0;
        adj = (Bag<Integer>[]) new Bag[this.verts];
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
        adj[vert2].add(vert1);
        edges++;
    }

    //Vertices adjacent to v.
    public Iterable<Integer> adj(int vert) {
        return adj[vert];
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
