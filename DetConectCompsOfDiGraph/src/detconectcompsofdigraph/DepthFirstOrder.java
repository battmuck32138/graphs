/*
Mathew Buck
CIS 27 Lab 4
 */
package detconectcompsofdigraph;

//Allows clients to iterate through the vertices in varioius orders by 
//depth first search.
public class DepthFirstOrder {

    private boolean[] marked;
    private Queue<Integer> pre;//verticies in pre-order
    private Queue<Integer> post;//verticies in post-order
    private Stack<Integer> reversePost;//verticies in reverse post-order

    public DepthFirstOrder(DiGraph g) {
        pre = new Queue<Integer>();
        post = new Queue<Integer>();
        reversePost = new Stack<Integer>();
        marked = new boolean[g.verts()];

        for (int v = 0; v < g.verts(); v++) {
            if (!marked[v]) {
                dfs(g, v);
            }
        }
    }

    private void dfs(DiGraph g, int v) {
        pre.enqueue(v);
        marked[v] = true;
        for (int w : g.adj(v)) {
            if (!marked[w]) {
                dfs(g, w);
            }
        }
        post.enqueue(v);
        reversePost.push(v);
    }

    public Iterable<Integer> pre() {
        return pre;
    }

    public Iterable<Integer> post() {
        return post;
    }

    public Iterable<Integer> reversePost() {
        return reversePost;
    }

}
