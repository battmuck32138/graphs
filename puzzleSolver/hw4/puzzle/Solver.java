package hw4.puzzle;
import java.util.ArrayList;
import java.util.Collections;
import edu.princeton.cs.algs4.MinPQ;


public class Solver {


    private MinPQ<SearchNode> fringeQ = new MinPQ<>();
    private SearchNode end;


    /*
    Constructor which solves the puzzle, computing
    everything necessary for moves() and solution() to
    not have to solve the problem again. Solves the
    puzzle using the A* algorithm. Assumes a solution exists.
    */
    public Solver(WorldState initial) {
        SearchNode source = new SearchNode(initial, 0, null);
        fringeQ.insert(source);

        while (true) {
            SearchNode current = fringeQ.delMin();
            if (current.ws.isGoal()) {
                end = current;
                return;
            }
            enqueueNeighbors(current);
        }
    }


    /*
    Helper method for the constructor.
    Enqueues all neighbor nodes that are NOT equal to the neighbor's grandfather
    and updates the moves counter for the current level of the graph.
     */
    private void enqueueNeighbors(SearchNode node) {
        for (WorldState ws : node.ws.neighbors()) {
            if (node.prev == null || !ws.equals(node.prev.ws)) {
                SearchNode newNode = new SearchNode(ws, node.moves + 1, node);
                fringeQ.insert(newNode);
            }
        }
    }


    /*
    Returns the minimum number of moves to solve the puzzle starting
    at the initial WorldState.
    */
    public int moves() {
        return end.moves;
    }


    /*
    Returns a sequence of WorldStates from the source WorldState
    to the target WorldState by back-tracking from the end node.
    */
    public Iterable<WorldState> solution() {
        ArrayList<WorldState> path = new ArrayList<>();
        SearchNode current = end;

        //Build path from the end, then reverse it.
        while (current != null) {
            path.add(current.ws);
            current = current.prev;
        }
        Collections.reverse(path);

        return path;
    }


    /****************************************************************************************
     * Helper Class
     ***************************************************************************************/
    private class SearchNode implements Comparable<SearchNode> {
        WorldState ws;
        int moves;
        SearchNode prev;
        int priority;


        private SearchNode(WorldState ws, int moves, SearchNode prev) {
            this.ws = ws;
            this.moves = moves;
            this.prev = prev;
            this.priority = ws.estimatedDistanceToGoal() + moves;
        }


        @Override
        public int compareTo(SearchNode that) {
            if (this.priority < that.priority) {
                return -1;
            }
            if (this.priority > that.priority) {
                return 1;
            }
            return 0;
        }

    }

}

