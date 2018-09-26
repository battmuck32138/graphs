package lab11.graphs;

import java.util.LinkedList;

public class MazeBreadthFirstPaths extends MazeExplorer {
    /* Inherits public fields:
    public int[] distTo;
    public int[] edgeTo;
    public boolean[] marked;
    */
    private int source;
    private int target;
    private Maze mz;
    private LinkedList<Integer> fringeQ = new LinkedList<>();

    public MazeBreadthFirstPaths(Maze m, int sourceX, int sourceY, int targetX, int targetY) {
        super(m);
        this.mz = m;
        this.source = maze.xyTo1D(sourceX, sourceY);
        this.target = maze.xyTo1D(targetX, targetY);
        distTo[source] = 0;
        edgeTo[source] = source;
    }

    /** Conducts a breadth first search of the maze starting at the source. */
    private void bfs() {
        if (source == target) {
            announce();
            return;
        }

        fringeQ.addLast(source);
        while (!fringeQ.isEmpty()) {
            int current = fringeQ.removeFirst();
            marked[current] = true;

            if (current == target) {
                announce();
                return;
            }

            for (int v : maze.adj(current)) {
                if (!marked[v]) {
                    edgeTo[v] = current;
                    fringeQ.addLast(v);
                }
                distTo[v] = distTo[current] + 1;
            }
            announce();
        }
    }



    @Override
    public void solve() {
        bfs();
    }
}

