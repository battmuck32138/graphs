/*
Mathew Buck
CIS 27 Lab 4
ABC Utility Company Min Cable
EX C
 */
package minspanlab4exc;

public class MinSpanLab4ExC {

    //Program to calculate teh shortes route between field stations 
    //as laid out in an edgeweighted graph. 
    public static void main(String[] args) {

        EdgeWeightedGraph ewg = new EdgeWeightedGraph(50);

        Edge e1 = new Edge(1, 0, 33);
        Edge e2 = new Edge(0, 2, 30);
        Edge e3 = new Edge(2, 10, 35);
        Edge e4 = new Edge(10, 13, 28);
        Edge e5 = new Edge(1, 4, 25);
        Edge e6 = new Edge(4, 16, 40);
        Edge e7 = new Edge(16, 27, 50);
        Edge e8 = new Edge(27, 42, 26);
        Edge e9 = new Edge(42, 44, 24);
        Edge e10 = new Edge(44, 47, 26);
        Edge e12 = new Edge(47, 11, 33);
        Edge e13 = new Edge(11, 48, 44);
        Edge e14 = new Edge(48, 49, 32);
        Edge e15 = new Edge(49, 38, 45);
        Edge e16 = new Edge(26, 38, 55);
        Edge e17 = new Edge(26, 20, 30);
        Edge e18 = new Edge(20, 13, 40);
        Edge e19 = new Edge(1, 6, 18);
        Edge e20 = new Edge(1, 5, 13);
        Edge e21 = new Edge(4, 5, 20);
        Edge e22 = new Edge(5, 6, 20);
        Edge e23 = new Edge(0, 9, 25);
        Edge e24 = new Edge(2, 9, 20);
        Edge e25 = new Edge(2, 12, 27);
        Edge e26 = new Edge(2, 3, 15);
        Edge e27 = new Edge(6, 9, 21);
        Edge e28 = new Edge(10, 12, 22);
        Edge e29 = new Edge(13, 15, 28);
        Edge e30 = new Edge(12, 15, 30);
        Edge e31 = new Edge(9, 3, 31);
        Edge e32 = new Edge(3, 12, 23);
        Edge e33 = new Edge(4, 7, 31);
        Edge e34 = new Edge(5, 8, 30);
        Edge e35 = new Edge(6, 8, 25);
        Edge e36 = new Edge(9, 8, 16);
        Edge e37 = new Edge(5, 7, 15);
        Edge e38 = new Edge(16, 7, 25);
        Edge e39 = new Edge(7, 8, 35);
        Edge e40 = new Edge(3, 8, 15);
        Edge e41 = new Edge(12, 14, 22);
        Edge e42 = new Edge(14, 15, 36);
        Edge e43 = new Edge(3, 14, 15);
        Edge e44 = new Edge(15, 20, 25);
        Edge e45 = new Edge(16, 17, 30);
        Edge e46 = new Edge(7, 17, 20);
        Edge e47 = new Edge(7, 32, 30);
        Edge e48 = new Edge(8, 21, 35);
        Edge e49 = new Edge(3, 21, 20);
        Edge e50 = new Edge(8, 32, 32);
        Edge e51 = new Edge(14, 20, 35);
        Edge e52 = new Edge(17, 32, 15);
        Edge e53 = new Edge(32, 21, 26);
        Edge e54 = new Edge(21, 14, 16);
        Edge e55 = new Edge(14, 19, 23);
        Edge e56 = new Edge(16, 22, 35);
        Edge e57 = new Edge(22, 28, 17);
        Edge e58 = new Edge(21, 19, 30);
        Edge e59 = new Edge(19, 20, 30);
        Edge e60 = new Edge(32, 18, 15);
        Edge e61 = new Edge(18, 21, 20);
        Edge e62 = new Edge(21, 24, 45);
        Edge e63 = new Edge(18, 24, 30);
        Edge e64 = new Edge(17, 23, 25);
        Edge e65 = new Edge(23, 32, 30);
        Edge e66 = new Edge(23, 18, 30);
        Edge e67 = new Edge(17, 28, 38);
        Edge e68 = new Edge(19, 26, 40);
        Edge e69 = new Edge(24, 19, 35);
        Edge e70 = new Edge(19, 25, 25);
        Edge e71 = new Edge(22, 28, 30);
        Edge e72 = new Edge(23, 28, 18);
        Edge e73 = new Edge(24, 25, 25);
        Edge e74 = new Edge(25, 26, 30);
        Edge e75 = new Edge(27, 22, 35);
        Edge e76 = new Edge(18, 29, 40);
        Edge e77 = new Edge(23, 29, 32);
        Edge e78 = new Edge(24, 29, 15);
        Edge e79 = new Edge(27, 28, 43);
        Edge e80 = new Edge(28, 29, 42);
        Edge e81 = new Edge(29, 30, 35);
        Edge e82 = new Edge(25, 30, 30);
        Edge e83 = new Edge(26, 31, 20);
        Edge e84 = new Edge(25, 31, 21);
        Edge e85 = new Edge(25, 37, 50);
        Edge e86 = new Edge(31, 37, 35);
        Edge e87 = new Edge(27, 34, 25);
        Edge e88 = new Edge(34, 28, 30);
        Edge e89 = new Edge(28, 35, 25);
        Edge e90 = new Edge(29, 35, 30);
        Edge e91 = new Edge(29, 36, 37);
        Edge e92 = new Edge(29, 36, 37);
        Edge e93 = new Edge(30, 37, 30);
        Edge e94 = new Edge(31, 38, 40);
        Edge e95 = new Edge(30, 36, 33);
        Edge e96 = new Edge(35, 36, 43);
        Edge e97 = new Edge(36, 37, 28);
        Edge e98 = new Edge(34, 35, 33);
        Edge e99 = new Edge(42, 47, 36);
        Edge e100 = new Edge(42, 43, 34);
        Edge e101 = new Edge(42, 34, 20);
        Edge e102 = new Edge(47, 43, 15);
        Edge e103 = new Edge(35, 40, 35);
        Edge e104 = new Edge(35, 41, 30);
        Edge e105 = new Edge(34, 43, 37);
        Edge e106 = new Edge(34, 41, 25);
        Edge e107 = new Edge(37, 38, 25);
        Edge e108 = new Edge(36, 40, 30);
        Edge e109 = new Edge(36, 39, 25);
        Edge e110 = new Edge(39, 37, 30);
        Edge e111 = new Edge(37, 33, 35);
        Edge e112 = new Edge(33, 38, 25);
        Edge e113 = new Edge(41, 40, 27);
        Edge e114 = new Edge(40, 39, 40);
        Edge e115 = new Edge(39, 33, 25);
        Edge e116 = new Edge(33, 49, 20);
        Edge e117 = new Edge(39, 46, 20);
        Edge e118 = new Edge(40, 46, 28);
        Edge e119 = new Edge(43, 41, 14);
        Edge e120 = new Edge(41, 45, 23);
        Edge e121 = new Edge(40, 45, 20);
        Edge e122 = new Edge(46, 33, 30);
        Edge e123 = new Edge(46, 49, 35);
        Edge e124 = new Edge(46, 48, 15);
        Edge e125 = new Edge(45, 48, 33);
        Edge e126 = new Edge(45, 46, 30);
        Edge e127 = new Edge(43, 45, 30);
        Edge e128 = new Edge(43, 11, 35);
        Edge e129 = new Edge(11, 45, 21);

        ewg.addEdge(e1);
        ewg.addEdge(e2);
        ewg.addEdge(e3);
        ewg.addEdge(e4);
        ewg.addEdge(e5);
        ewg.addEdge(e6);
        ewg.addEdge(e7);
        ewg.addEdge(e8);
        ewg.addEdge(e9);
        ewg.addEdge(e10);
        ewg.addEdge(e12);
        ewg.addEdge(e13);
        ewg.addEdge(e14);
        ewg.addEdge(e15);
        ewg.addEdge(e16);
        ewg.addEdge(e17);
        ewg.addEdge(e18);
        ewg.addEdge(e19);
        ewg.addEdge(e20);
        ewg.addEdge(e21);
        ewg.addEdge(e22);
        ewg.addEdge(e23);
        ewg.addEdge(e24);
        ewg.addEdge(e25);
        ewg.addEdge(e26);
        ewg.addEdge(e27);
        ewg.addEdge(e28);
        ewg.addEdge(e29);
        ewg.addEdge(e30);
        ewg.addEdge(e31);
        ewg.addEdge(e32);
        ewg.addEdge(e33);
        ewg.addEdge(e34);
        ewg.addEdge(e35);
        ewg.addEdge(e36);
        ewg.addEdge(e37);
        ewg.addEdge(e38);
        ewg.addEdge(e39);
        ewg.addEdge(e40);
        ewg.addEdge(e41);
        ewg.addEdge(e42);
        ewg.addEdge(e43);
        ewg.addEdge(e44);
        ewg.addEdge(e45);
        ewg.addEdge(e46);
        ewg.addEdge(e47);
        ewg.addEdge(e48);
        ewg.addEdge(e49);
        ewg.addEdge(e50);
        ewg.addEdge(e51);
        ewg.addEdge(e52);
        ewg.addEdge(e53);
        ewg.addEdge(e54);
        ewg.addEdge(e55);
        ewg.addEdge(e56);
        ewg.addEdge(e57);
        ewg.addEdge(e58);
        ewg.addEdge(e59);
        ewg.addEdge(e60);
        ewg.addEdge(e61);
        ewg.addEdge(e62);
        ewg.addEdge(e63);
        ewg.addEdge(e64);
        ewg.addEdge(e65);
        ewg.addEdge(e66);
        ewg.addEdge(e67);
        ewg.addEdge(e68);
        ewg.addEdge(e69);
        ewg.addEdge(e70);
        ewg.addEdge(e71);
        ewg.addEdge(e72);
        ewg.addEdge(e73);
        ewg.addEdge(e74);
        ewg.addEdge(e75);
        ewg.addEdge(e76);
        ewg.addEdge(e77);
        ewg.addEdge(e78);
        ewg.addEdge(e79);
        ewg.addEdge(e80);
        ewg.addEdge(e81);
        ewg.addEdge(e82);
        ewg.addEdge(e83);
        ewg.addEdge(e84);
        ewg.addEdge(e85);
        ewg.addEdge(e86);
        ewg.addEdge(e87);
        ewg.addEdge(e88);
        ewg.addEdge(e89);
        ewg.addEdge(e90);
        ewg.addEdge(e91);
        ewg.addEdge(e92);
        ewg.addEdge(e93);
        ewg.addEdge(e94);
        ewg.addEdge(e95);
        ewg.addEdge(e96);
        ewg.addEdge(e97);
        ewg.addEdge(e98);
        ewg.addEdge(e99);
        ewg.addEdge(e100);
        ewg.addEdge(e101);
        ewg.addEdge(e102);
        ewg.addEdge(e103);
        ewg.addEdge(e104);
        ewg.addEdge(e105);
        ewg.addEdge(e106);
        ewg.addEdge(e107);
        ewg.addEdge(e108);
        ewg.addEdge(e109);
        ewg.addEdge(e110);
        ewg.addEdge(e111);
        ewg.addEdge(e112);
        ewg.addEdge(e113);
        ewg.addEdge(e114);
        ewg.addEdge(e115);
        ewg.addEdge(e116);
        ewg.addEdge(e117);
        ewg.addEdge(e118);
        ewg.addEdge(e119);
        ewg.addEdge(e120);
        ewg.addEdge(e121);
        ewg.addEdge(e122);
        ewg.addEdge(e123);
        ewg.addEdge(e124);
        ewg.addEdge(e125);
        ewg.addEdge(e126);
        ewg.addEdge(e127);
        ewg.addEdge(e128);
        ewg.addEdge(e129);

        LazyPrimMST lp = new LazyPrimMST(ewg);
        System.out.print("The total amount of cable needed is ");
        System.out.println(lp.weight() + " units.");
        System.out.println("The list of cable runs between statins "
                + "and customers is:");
        lp.displayMST();

    }

}

/*
OUTPUT

run:
The total amount of cable needed is 1032.0 units.
The list of cable runs between statins and customers is:
Size 49: 0-9 25.00, 9-8 16.00, 3-8 15.00, 3-14 15.00, 2-3 15.00, 21-14 16.00,
18-21 20.00, 32-18 15.00, 17-32 15.00, 7-17 20.00, 5-7 15.00, 1-5 13.00,
1-6 18.00, 4-5 20.00, 12-14 22.00, 10-12 22.00, 14-19 23.00, 17-23 25.00,
23-28 18.00, 22-28 17.00, 16-7 25.00, 28-35 25.00, 19-25 25.00, 25-31 21.00,
26-31 20.00, 24-25 25.00, 24-29 15.00, 10-13 28.00, 13-15 28.00, 15-20 25.00,
35-41 30.00, 43-41 14.00, 47-43 15.00, 41-45 23.00, 40-45 20.00, 11-45 21.00,
34-41 25.00, 42-34 20.00, 42-44 24.00, 27-34 25.00, 40-46 28.00, 46-48 15.00,
39-46 20.00, 39-33 25.00, 33-49 20.00, 33-38 25.00, 36-39 25.00, 37-38 25.00,
30-37 30.00

BUILD SUCCESSFUL (total time: 0 seconds)


*/
