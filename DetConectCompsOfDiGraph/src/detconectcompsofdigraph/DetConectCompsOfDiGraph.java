/*
Mathew Buck
CIS 27 Lab4 
Programming Assignment 2C
 */
package detconectcompsofdigraph;

//Program determines the connected and also the strongly connected 
//components in a DiGraph.
public class DetConectCompsOfDiGraph {

    public static void main(String[] args) {

        DiGraph dg = new DiGraph(50);
        int strongCt = 0;
        int conCt = 0;
        //(v,w) edges.
        int[] vArr = new int[]{0, 0, 25, 2, 2, 38, 26, 26, 46, 20, 36, 36, 39,
            44, 7, 10, 10, 10, 7, 10, 10, 41, 41, 10, 28, 28, 34, 34, 34, 49,
            34, 2, 19, 40, 15, 15, 39, 28, 29, 18, 18, 3, 3, 20, 3, 3, 3, 27,
            4, 27, 31, 17, 4, 18, 20, 20, 31, 17, 24, 27, 27, 27, 18, 24, 32,
            32, 17, 6, 6, 28, 22, 29, 24, 49, 5, 43, 13, 32, 37, 32, 43, 32,
            37, 1, 38, 38, 37, 13, 23, 21, 1, 45, 37, 19, 1, 45, 45, 33, 8,
            15, 45, 14, 33, 1, 1, 8, 14, 14, 48, 23, 30, 23, 11, 48, 12, 11,
            30, 12, 9, 9, 12, 26, 35, 16, 12, 9, 35};
        int[] wArr = new int[]{7, 34, 34, 25, 33, 33, 48, 16, 16, 46, 20, 42,
            42, 39, 44, 7, 0, 34, 41, 41, 29, 44, 28, 28, 44, 39, 29, 2, 19,
            34, 40, 19, 40, 15, 34, 49, 18, 29, 49, 28, 42, 36, 42, 3, 17, 4,
            27, 42, 27, 31, 18, 20, 17, 32, 35, 38, 32, 24, 4, 24, 25, 32, 6,
            5, 5, 6, 38, 28, 13, 22, 6, 22, 38, 22, 43, 48, 22, 13, 5, 47, 37,
            37, 47, 22, 37, 35, 35, 23, 22, 22, 49, 48, 39, 15, 45, 15, 14, 19,
            19, 8, 8, 8, 8, 14, 21, 48, 48, 21, 21, 21, 23, 11, 21, 12, 21, 30,
            37, 11, 30, 11, 9, 9, 9, 9, 26, 46, 46};

        
        //build the directed graph
        for (int i = 0; i < vArr.length; i++) {
            dg.addEdge(vArr[i], wArr[i]);
        }

        //Strong Components
        StrongComponents sc = new StrongComponents(dg);
        System.out.println("Strongly Connected Components: ");
        for (int i = 0; i < vArr.length; i++) {
            if (sc.stronglyConnected(vArr[i], wArr[i])) {
                strongCt++;
                System.out.println("(" + vArr[i] + ", " + wArr[i] + ")");
            }
        }
        System.out.println("There were " + strongCt + " Strongly Connected "
                + "Components in the graph.");
        System.out.println();

        //Connected Components
        ConComps cc = new ConComps(dg);
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                if (cc.connected(i, j)) {
                    conCt++;
                    //System.out.println("(" + i + ", " + j + ")");
                }
            }
        }
        System.out.println("There are " + conCt + " regularly Connected "
                + "Component Combinations in the DiGraph.");
    }

}

/*

run:
Strongly Connected Components: 
(25, 34)
(2, 25)
(2, 33)
(26, 48)
(26, 16)
(46, 16)
(36, 20)
(44, 39)
(28, 44)
(28, 39)
(34, 29)
(34, 2)
(34, 19)
(49, 34)
(34, 40)
(2, 19)
(19, 40)
(40, 15)
(15, 34)
(15, 49)
(39, 18)
(28, 29)
(29, 49)
(18, 28)
(3, 36)
(20, 3)
(3, 17)
(3, 4)
(3, 27)
(4, 27)
(17, 20)
(4, 17)
(18, 32)
(17, 24)
(24, 4)
(27, 24)
(18, 6)
(32, 5)
(32, 6)
(6, 28)
(6, 13)
(28, 22)
(22, 6)
(29, 22)
(49, 22)
(5, 43)
(43, 48)
(13, 22)
(32, 13)
(37, 5)
(43, 37)
(32, 37)
(37, 35)
(13, 23)
(23, 22)
(21, 22)
(37, 39)
(19, 15)
(33, 19)
(8, 19)
(15, 8)
(33, 8)
(8, 48)
(48, 21)
(23, 21)
(30, 23)
(23, 11)
(11, 21)
(48, 12)
(12, 21)
(11, 30)
(30, 37)
(12, 11)
(9, 30)
(9, 11)
(12, 9)
(26, 9)
(35, 9)
(16, 9)
(12, 26)
(9, 46)
(35, 46)
There were 82 Strongly Connected Components in the graph.

There are 1460 regularly Connected Component Combinations in the DiGraph.
BUILD SUCCESSFUL (total time: 0 seconds)

*/