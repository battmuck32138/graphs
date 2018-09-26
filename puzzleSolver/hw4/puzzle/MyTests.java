package hw4.puzzle;

public class MyTests {
    public static void main(String[] args) {
        int[][] tiles = new int[3][3];
        tiles[0][0] = 8;
        tiles[0][1] = 1;
        tiles[0][2] = 3;
        tiles[1][0] = 4;
        tiles[1][1] = 0;
        tiles[1][2] = 2;
        tiles[2][0] = 7;
        tiles[2][1] = 6;
        tiles[2][2] = 5;
        Board b = new Board(tiles);
        System.out.println(b.toString());
        System.out.println(b.tileAt(1, 1));
        System.out.println(b.tileAt(2, 1));
        System.out.println(b.size());
        System.out.println(b.hamming());
        System.out.println();
        System.out.println(b.tileAt(0, 0));
        System.out.println(b.manhattan());


    }


}
