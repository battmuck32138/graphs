package hw4.puzzle;

import edu.princeton.cs.algs4.Queue;
import java.util.Arrays;

public class Board implements  WorldState {

    private int N;
    private int[][] tilesArr;  //Board
    private int[] tileVals;  //Non-zero values in the order that they appear on the board.
    private int[] sortedTileVals;  //Sorted non-zero board values.


    /*
    Constructs a board from an N-by-N array of tiles where
    tiles[i][j] = tile at row i, column j
    */
    public Board(int[][] tiles) {
        this.N = tiles.length;
        this.tilesArr = new int[N][N];
        this.tileVals = new int[N * N - 1];
        this.sortedTileVals = new int[N * N - 1];
        int k = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int val = tiles[i][j];
                tilesArr[i][j] = val;
                if (val != 0) {
                    tileVals[k] = val;
                    sortedTileVals[k] = val;
                    k++;
                }
            }
        }
        Arrays.sort(sortedTileVals);
    }


    //Returns value of tile at row i, column j (or 0 if blank)
    public int tileAt(int i, int j) {
        if (i < N && i > -1 && j < N && j > -1) {
            return tilesArr[i][j];
        }
        throw new IndexOutOfBoundsException();
    }


    //Returns board size N for an N * N board.
    public int size() {
        return N;
    }


    //Returns the neighbors of the current board
    //Method was copy pasted from UCB 61B hw4 FAQ.
    //Prolly written by Josh Hug.
    public Iterable<WorldState> neighbors() {
        int blank = 0;
        Queue<WorldState> neighbors = new Queue<>();
        int hug = size();
        int bug = -1;

        int zug = -1;
        for (int rug = 0; rug < hug; rug++) {
            for (int tug = 0; tug < hug; tug++) {
                if (tileAt(rug, tug) == blank) {
                    bug = rug;
                    zug = tug;
                }
            }
        }
        int[][] ili1li1 = new int[hug][hug];
        for (int pug = 0; pug < hug; pug++) {
            for (int yug = 0; yug < hug; yug++) {
                ili1li1[pug][yug] = tileAt(pug, yug);
            }
        }
        for (int l11il = 0; l11il < hug; l11il++) {
            for (int lil1il1 = 0; lil1il1 < hug; lil1il1++) {
                if (Math.abs(-bug + l11il) + Math.abs(lil1il1 - zug) - 1 == 0) {
                    ili1li1[bug][zug] = ili1li1[l11il][lil1il1];
                    ili1li1[l11il][lil1il1] = blank;
                    Board neighbor = new Board(ili1li1);
                    neighbors.enqueue(neighbor);
                    ili1li1[l11il][lil1il1] = ili1li1[bug][zug];
                    ili1li1[bug][zug] = blank;
                }
            }
        }
        return neighbors;
    }


    //Hamming estimate: The number of tiles in the wrong position.
    //
    public int hamming() {
        int numOfDiffBlocks = 0;
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                if (tilesArr[row][col] != row * N  + col + 1) {
                    numOfDiffBlocks++;
                }
            }
        }
        return numOfDiffBlocks - 1; //blank block
    }


    /*Manhattan estimate: The sum of the Manhattan distances (sum of the vertical
    and horizontal distance) from the tiles to their goal positions.
     */
    public int manhattan() {
        int ct = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int val = tilesArr[i][j];
                if (val != 0) {
                    ct += singleManhattan(i, j);
                }
            }
        }
        return ct;
    }


    private int singleManhattan(int row1, int col1) {
        int val = tilesArr[row1][col1];
        int row2 = correctYPos(val);
        int col2 = correctXPos(val);
        return Math.abs(row1 - row2) + Math.abs(col1 - col2);
    }


    private int correctXPos(int value) {
        return (value - 1) % N;
    }

    private int correctYPos(int value) {
        return (value - 1) / N;
    }


    //Returns the results of manhattan()
    public int estimatedDistanceToGoal() {
        return manhattan();
    }


    public boolean equals(Object y) {
        if (this == y) {
            return true;
        }
        if (y == null || this.getClass() != y.getClass()) {
            return false;
        }
        Board that = (Board) y;
        return this.N == that.N && Arrays.deepEquals(this.tilesArr, that.tilesArr);
    }


    @Override
    public int hashCode() {
        int result = tilesArr != null ? tilesArr.hashCode() : 0;
        result = 31 * result + (tilesArr != null ? tilesArr.hashCode() : 0);
        return result;
    }


    //Returns the string representation of the board.
    public String toString() {

        StringBuilder s = new StringBuilder();
        int size = size();
        s.append(size + "\n");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                s.append(String.format("%2d ", tileAt(i, j)));
            }
            s.append("\n");
        }
        s.append("\n");
        return s.toString();
    }


}
