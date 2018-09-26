/*
Mathew Buck
CIS 27 Lab 4
 */
package responsetimeex4d;

public class ResponseTimeEx4D {

    public static void main(String[] args) {

        //edges
        DirectedEdge e1 = new DirectedEdge(1, 0, 33);
        DirectedEdge e2 = new DirectedEdge(0, 2, 30);
        DirectedEdge e3 = new DirectedEdge(2, 10, 35);
        DirectedEdge e4 = new DirectedEdge(10, 13, 28);
        DirectedEdge e5 = new DirectedEdge(1, 4, 25);
        DirectedEdge e6 = new DirectedEdge(4, 16, 40);
        DirectedEdge e7 = new DirectedEdge(16, 27, 50);
        DirectedEdge e8 = new DirectedEdge(27, 42, 26);
        DirectedEdge e9 = new DirectedEdge(42, 44, 24);
        DirectedEdge e10 = new DirectedEdge(44, 47, 26);
        DirectedEdge e12 = new DirectedEdge(47, 11, 33);
        DirectedEdge e13 = new DirectedEdge(11, 48, 44);
        DirectedEdge e14 = new DirectedEdge(48, 49, 32);
        DirectedEdge e15 = new DirectedEdge(49, 38, 45);
        DirectedEdge e16 = new DirectedEdge(26, 38, 55);
        DirectedEdge e17 = new DirectedEdge(26, 20, 30);
        DirectedEdge e18 = new DirectedEdge(20, 13, 40);
        DirectedEdge e19 = new DirectedEdge(1, 6, 18);
        DirectedEdge e20 = new DirectedEdge(1, 5, 13);
        DirectedEdge e21 = new DirectedEdge(4, 5, 20);
        DirectedEdge e22 = new DirectedEdge(5, 6, 20);
        DirectedEdge e23 = new DirectedEdge(0, 9, 25);
        DirectedEdge e24 = new DirectedEdge(2, 9, 20);
        DirectedEdge e25 = new DirectedEdge(2, 12, 27);
        DirectedEdge e26 = new DirectedEdge(2, 3, 15);
        DirectedEdge e27 = new DirectedEdge(6, 9, 21);
        DirectedEdge e28 = new DirectedEdge(10, 12, 22);
        DirectedEdge e29 = new DirectedEdge(13, 15, 28);
        DirectedEdge e30 = new DirectedEdge(12, 15, 30);
        DirectedEdge e31 = new DirectedEdge(9, 3, 31);
        DirectedEdge e32 = new DirectedEdge(3, 12, 23);
        DirectedEdge e33 = new DirectedEdge(4, 7, 31);
        DirectedEdge e34 = new DirectedEdge(5, 8, 30);
        DirectedEdge e35 = new DirectedEdge(6, 8, 25);
        DirectedEdge e36 = new DirectedEdge(9, 8, 16);
        DirectedEdge e37 = new DirectedEdge(5, 7, 15);
        DirectedEdge e38 = new DirectedEdge(16, 7, 25);
        DirectedEdge e39 = new DirectedEdge(7, 8, 35);
        DirectedEdge e40 = new DirectedEdge(3, 8, 15);
        DirectedEdge e41 = new DirectedEdge(12, 14, 22);
        DirectedEdge e42 = new DirectedEdge(14, 15, 36);
        DirectedEdge e43 = new DirectedEdge(3, 14, 15);
        DirectedEdge e44 = new DirectedEdge(15, 20, 25);
        DirectedEdge e45 = new DirectedEdge(16, 17, 30);
        DirectedEdge e46 = new DirectedEdge(7, 17, 20);
        DirectedEdge e47 = new DirectedEdge(7, 32, 30);
        DirectedEdge e48 = new DirectedEdge(8, 21, 35);
        DirectedEdge e49 = new DirectedEdge(3, 21, 20);
        DirectedEdge e50 = new DirectedEdge(8, 32, 32);
        DirectedEdge e51 = new DirectedEdge(14, 20, 35);
        DirectedEdge e52 = new DirectedEdge(17, 32, 15);
        DirectedEdge e53 = new DirectedEdge(32, 21, 26);
        DirectedEdge e54 = new DirectedEdge(21, 14, 16);
        DirectedEdge e55 = new DirectedEdge(14, 19, 23);
        DirectedEdge e56 = new DirectedEdge(16, 22, 35);
        DirectedEdge e57 = new DirectedEdge(22, 28, 17);
        DirectedEdge e58 = new DirectedEdge(21, 19, 30);
        DirectedEdge e59 = new DirectedEdge(19, 20, 30);
        DirectedEdge e60 = new DirectedEdge(32, 18, 15);
        DirectedEdge e61 = new DirectedEdge(18, 21, 20);
        DirectedEdge e62 = new DirectedEdge(21, 24, 45);
        DirectedEdge e63 = new DirectedEdge(18, 24, 30);
        DirectedEdge e64 = new DirectedEdge(17, 23, 25);
        DirectedEdge e65 = new DirectedEdge(23, 32, 30);
        DirectedEdge e66 = new DirectedEdge(23, 18, 30);
        DirectedEdge e67 = new DirectedEdge(17, 28, 38);
        DirectedEdge e68 = new DirectedEdge(19, 26, 40);
        DirectedEdge e69 = new DirectedEdge(24, 19, 35);
        DirectedEdge e70 = new DirectedEdge(19, 25, 25);
        DirectedEdge e71 = new DirectedEdge(22, 28, 30);
        DirectedEdge e72 = new DirectedEdge(23, 28, 18);
        DirectedEdge e73 = new DirectedEdge(24, 25, 25);
        DirectedEdge e74 = new DirectedEdge(25, 26, 30);
        DirectedEdge e75 = new DirectedEdge(27, 22, 35);
        DirectedEdge e76 = new DirectedEdge(18, 29, 40);
        DirectedEdge e77 = new DirectedEdge(23, 29, 32);
        DirectedEdge e78 = new DirectedEdge(24, 29, 15);
        DirectedEdge e79 = new DirectedEdge(27, 28, 43);
        DirectedEdge e80 = new DirectedEdge(28, 29, 42);
        DirectedEdge e81 = new DirectedEdge(29, 30, 35);
        DirectedEdge e82 = new DirectedEdge(25, 30, 30);
        DirectedEdge e83 = new DirectedEdge(26, 31, 20);
        DirectedEdge e84 = new DirectedEdge(25, 31, 21);
        DirectedEdge e85 = new DirectedEdge(25, 37, 50);
        DirectedEdge e86 = new DirectedEdge(31, 37, 35);
        DirectedEdge e87 = new DirectedEdge(27, 34, 25);
        DirectedEdge e88 = new DirectedEdge(34, 28, 30);
        DirectedEdge e89 = new DirectedEdge(28, 35, 25);
        DirectedEdge e90 = new DirectedEdge(29, 35, 30);
        DirectedEdge e91 = new DirectedEdge(29, 36, 37);
        DirectedEdge e92 = new DirectedEdge(29, 36, 37);
        DirectedEdge e93 = new DirectedEdge(30, 37, 30);
        DirectedEdge e94 = new DirectedEdge(31, 38, 40);
        DirectedEdge e95 = new DirectedEdge(30, 36, 33);
        DirectedEdge e96 = new DirectedEdge(35, 36, 43);
        DirectedEdge e97 = new DirectedEdge(36, 37, 28);
        DirectedEdge e98 = new DirectedEdge(34, 35, 33);
        DirectedEdge e99 = new DirectedEdge(42, 47, 36);
        DirectedEdge e100 = new DirectedEdge(42, 43, 34);
        DirectedEdge e101 = new DirectedEdge(42, 34, 20);
        DirectedEdge e102 = new DirectedEdge(47, 43, 15);
        DirectedEdge e103 = new DirectedEdge(35, 40, 35);
        DirectedEdge e104 = new DirectedEdge(35, 41, 30);
        DirectedEdge e105 = new DirectedEdge(34, 43, 37);
        DirectedEdge e106 = new DirectedEdge(34, 41, 25);
        DirectedEdge e107 = new DirectedEdge(37, 38, 25);
        DirectedEdge e108 = new DirectedEdge(36, 40, 30);
        DirectedEdge e109 = new DirectedEdge(36, 39, 25);
        DirectedEdge e110 = new DirectedEdge(39, 37, 30);
        DirectedEdge e111 = new DirectedEdge(37, 33, 35);
        DirectedEdge e112 = new DirectedEdge(33, 38, 25);
        DirectedEdge e113 = new DirectedEdge(41, 40, 27);
        DirectedEdge e114 = new DirectedEdge(40, 39, 40);
        DirectedEdge e115 = new DirectedEdge(39, 33, 25);
        DirectedEdge e116 = new DirectedEdge(33, 49, 20);
        DirectedEdge e117 = new DirectedEdge(39, 46, 20);
        DirectedEdge e118 = new DirectedEdge(40, 46, 28);
        DirectedEdge e119 = new DirectedEdge(43, 41, 14);
        DirectedEdge e120 = new DirectedEdge(41, 45, 23);
        DirectedEdge e121 = new DirectedEdge(40, 45, 20);
        DirectedEdge e122 = new DirectedEdge(46, 33, 30);
        DirectedEdge e123 = new DirectedEdge(46, 49, 35);
        DirectedEdge e124 = new DirectedEdge(46, 48, 15);
        DirectedEdge e125 = new DirectedEdge(45, 48, 33);
        DirectedEdge e126 = new DirectedEdge(45, 46, 30);
        DirectedEdge e127 = new DirectedEdge(43, 45, 30);
        DirectedEdge e128 = new DirectedEdge(43, 11, 35);
        DirectedEdge e129 = new DirectedEdge(11, 45, 21);

        //edges in reverse order
        DirectedEdge e130 = new DirectedEdge(41, 35, 30);
        DirectedEdge e131 = new DirectedEdge(0, 1, 33);
        DirectedEdge e132 = new DirectedEdge(2, 0, 30);
        DirectedEdge e133 = new DirectedEdge(10, 2, 35);
        DirectedEdge e134 = new DirectedEdge(13, 10, 28);
        DirectedEdge e135 = new DirectedEdge(4, 1, 25);
        DirectedEdge e136 = new DirectedEdge(16, 4, 40);
        DirectedEdge e137 = new DirectedEdge(27, 16, 50);
        DirectedEdge e138 = new DirectedEdge(42, 27, 26);
        DirectedEdge e139 = new DirectedEdge(44, 42, 24);
        DirectedEdge e140 = new DirectedEdge(47, 44, 26);
        DirectedEdge e141 = new DirectedEdge(11, 47, 33);
        DirectedEdge e142 = new DirectedEdge(48, 11, 44);
        DirectedEdge e143 = new DirectedEdge(49, 48, 32);
        DirectedEdge e144 = new DirectedEdge(38, 49, 45);
        DirectedEdge e145 = new DirectedEdge(38, 26, 55);
        DirectedEdge e146 = new DirectedEdge(20, 26, 30);
        DirectedEdge e147 = new DirectedEdge(13, 20, 40);
        DirectedEdge e148 = new DirectedEdge(6, 1, 18);
        DirectedEdge e149 = new DirectedEdge(5, 1, 13);
        DirectedEdge e150 = new DirectedEdge(5, 4, 20);
        DirectedEdge e151 = new DirectedEdge(6, 5, 20);
        DirectedEdge e152 = new DirectedEdge(9, 0, 25);
        DirectedEdge e153 = new DirectedEdge(9, 2, 20);
        DirectedEdge e154 = new DirectedEdge(12, 2, 27);
        DirectedEdge e155 = new DirectedEdge(3, 2, 15);
        DirectedEdge e156 = new DirectedEdge(9, 6, 21);
        DirectedEdge e157 = new DirectedEdge(12, 10, 22);
        DirectedEdge e158 = new DirectedEdge(15, 13, 28);
        DirectedEdge e159 = new DirectedEdge(15, 12, 30);
        DirectedEdge e160 = new DirectedEdge(3, 9, 31);
        DirectedEdge e161 = new DirectedEdge(12, 3, 23);
        DirectedEdge e162 = new DirectedEdge(7, 4, 31);
        DirectedEdge e163 = new DirectedEdge(8, 5, 30);
        DirectedEdge e164 = new DirectedEdge(8, 6, 25);
        DirectedEdge e165 = new DirectedEdge(8, 9, 16);
        DirectedEdge e166 = new DirectedEdge(7, 5, 15);
        DirectedEdge e167 = new DirectedEdge(7, 16, 25);
        DirectedEdge e168 = new DirectedEdge(8, 7, 35);
        DirectedEdge e169 = new DirectedEdge(8, 3, 15);
        DirectedEdge e170 = new DirectedEdge(14, 12, 22);
        DirectedEdge e171 = new DirectedEdge(15, 14, 36);
        DirectedEdge e172 = new DirectedEdge(14, 3, 15);
        DirectedEdge e173 = new DirectedEdge(20, 15, 25);
        DirectedEdge e174 = new DirectedEdge(17, 16, 30);
        DirectedEdge e175 = new DirectedEdge(17, 7, 20);
        DirectedEdge e176 = new DirectedEdge(32, 7, 30);
        DirectedEdge e177 = new DirectedEdge(21, 8, 35);
        DirectedEdge e178 = new DirectedEdge(21, 3, 20);
        DirectedEdge e179 = new DirectedEdge(32, 8, 32);
        DirectedEdge e180 = new DirectedEdge(20, 14, 35);
        DirectedEdge e181 = new DirectedEdge(32, 17, 15);
        DirectedEdge e182 = new DirectedEdge(21, 32, 26);
        DirectedEdge e183 = new DirectedEdge(14, 21, 16);
        DirectedEdge e184 = new DirectedEdge(19, 14, 23);
        DirectedEdge e185 = new DirectedEdge(22, 16, 35);
        DirectedEdge e186 = new DirectedEdge(28, 22, 17);
        DirectedEdge e187 = new DirectedEdge(19, 21, 30);
        DirectedEdge e188 = new DirectedEdge(20, 19, 30);
        DirectedEdge e189 = new DirectedEdge(18, 32, 15);
        DirectedEdge e190 = new DirectedEdge(21, 18, 20);
        DirectedEdge e191 = new DirectedEdge(24, 21, 45);
        DirectedEdge e192 = new DirectedEdge(24, 18, 30);
        DirectedEdge e193 = new DirectedEdge(23, 17, 25);
        DirectedEdge e194 = new DirectedEdge(32, 23, 30);
        DirectedEdge e195 = new DirectedEdge(18, 23, 30);
        DirectedEdge e196 = new DirectedEdge(28, 17, 38);
        DirectedEdge e197 = new DirectedEdge(26, 19, 40);
        DirectedEdge e198 = new DirectedEdge(19, 24, 35);
        DirectedEdge e199 = new DirectedEdge(25, 19, 25);
        DirectedEdge e200 = new DirectedEdge(28, 22, 30);
        DirectedEdge e201 = new DirectedEdge(28, 23, 18);
        DirectedEdge e202 = new DirectedEdge(25, 24, 25);
        DirectedEdge e203 = new DirectedEdge(26, 25, 30);
        DirectedEdge e204 = new DirectedEdge(22, 27, 35);
        DirectedEdge e205 = new DirectedEdge(29, 18, 40);
        DirectedEdge e206 = new DirectedEdge(29, 23, 32);
        DirectedEdge e207 = new DirectedEdge(29, 24, 15);
        DirectedEdge e208 = new DirectedEdge(28, 27, 43);
        DirectedEdge e209 = new DirectedEdge(29, 28, 42);
        DirectedEdge e210 = new DirectedEdge(30, 29, 35);
        DirectedEdge e211 = new DirectedEdge(30, 25, 30);
        DirectedEdge e212 = new DirectedEdge(31, 26, 20);
        DirectedEdge e213 = new DirectedEdge(31, 25, 21);
        DirectedEdge e214 = new DirectedEdge(37, 25, 50);
        DirectedEdge e215 = new DirectedEdge(37, 31, 35);
        DirectedEdge e216 = new DirectedEdge(34, 27, 25);
        DirectedEdge e217 = new DirectedEdge(28, 34, 30);
        DirectedEdge e218 = new DirectedEdge(35, 28, 25);
        DirectedEdge e219 = new DirectedEdge(35, 29, 30);
        DirectedEdge e220 = new DirectedEdge(29, 36, 37);
        DirectedEdge e221 = new DirectedEdge(36, 29, 37);
        DirectedEdge e222 = new DirectedEdge(37, 30, 30);
        DirectedEdge e223 = new DirectedEdge(38, 41, 40);
        DirectedEdge e224 = new DirectedEdge(36, 30, 33);
        DirectedEdge e225 = new DirectedEdge(36, 35, 43);
        DirectedEdge e226 = new DirectedEdge(37, 36, 28);
        DirectedEdge e227 = new DirectedEdge(35, 34, 33);
        DirectedEdge e228 = new DirectedEdge(47, 42, 36);
        DirectedEdge e229 = new DirectedEdge(43, 42, 34);
        DirectedEdge e230 = new DirectedEdge(34, 42, 20);
        DirectedEdge e231 = new DirectedEdge(43, 47, 15);
        DirectedEdge e232 = new DirectedEdge(40, 35, 35);
        DirectedEdge e233 = new DirectedEdge(43, 34, 37);
        DirectedEdge e234 = new DirectedEdge(41, 34, 25);
        DirectedEdge e235 = new DirectedEdge(38, 37, 25);
        DirectedEdge e236 = new DirectedEdge(40, 36, 30);
        DirectedEdge e237 = new DirectedEdge(39, 36, 25);
        DirectedEdge e238 = new DirectedEdge(37, 39, 30);
        DirectedEdge e239 = new DirectedEdge(33, 37, 35);
        DirectedEdge e240 = new DirectedEdge(38, 33, 25);
        DirectedEdge e241 = new DirectedEdge(40, 41, 27);
        DirectedEdge e242 = new DirectedEdge(39, 40, 40);
        DirectedEdge e243 = new DirectedEdge(33, 39, 25);
        DirectedEdge e244 = new DirectedEdge(49, 33, 20);
        DirectedEdge e245 = new DirectedEdge(46, 39, 20);
        DirectedEdge e246 = new DirectedEdge(46, 40, 28);
        DirectedEdge e247 = new DirectedEdge(41, 43, 14);
        DirectedEdge e248 = new DirectedEdge(45, 41, 23);
        DirectedEdge e249 = new DirectedEdge(45, 40, 20);
        DirectedEdge e250 = new DirectedEdge(33, 46, 30);
        DirectedEdge e251 = new DirectedEdge(49, 46, 35);
        DirectedEdge e252 = new DirectedEdge(48, 46, 15);
        DirectedEdge e253 = new DirectedEdge(48, 45, 33);
        DirectedEdge e254 = new DirectedEdge(46, 45, 30);
        DirectedEdge e255 = new DirectedEdge(45, 43, 30);
        DirectedEdge e256 = new DirectedEdge(11, 43, 35);
        DirectedEdge e257 = new DirectedEdge(45, 11, 21);
        DirectedEdge e258 = new DirectedEdge(6, 0, 17);

        DirectedEdge[] edges = new DirectedEdge[]{e1, e2, e3, e4, e5, e6, e7,
            e8, e9, e10, e12, e13, e14, e15, e16, e17, e18, e19, e20, e21,
            e22, e23, e24, e25, e26, e27, e28, e29, e30, e31, e32, e33, e34,
            e35, e36, e37, e38, e39, e40, e41, e42, e43, e44, e45, e46, e47,
            e48, e49, e50, e51, e52, e53, e54, e55, e56, e57, e58, e59, e60,
            e61, e62, e63, e64, e65, e66, e67, e68, e69, e70, e71, e72, e73,
            e74, e75, e76, e77, e78, e79, e80, e81, e82, e83, e84, e85, e86,
            e87, e88, e89, e90, e91, e92, e93, e94, e95, e96, e97, e98, e99,
            e100, e101, e102, e103, e104, e105, e106, e107, e108, e109, e110,
            e111, e112, e113, e114, e115, e116, e117, e118, e119, e120, e121,
            e122, e123, e124, e125, e126, e127, e128, e129, e130, e131, e132,
            e133, e134, e135, e136, e137, e138, e139, e140, e141, e142, e143,
            e144, e145, e146, e147, e148, e149, e150, e151, e152, e153, e154,
            e155, e156, e157, e158, e159, e160, e161, e162, e163, e164, e165,
            e166, e167, e168, e169, e170, e171, e172, e173, e174, e175, e176,
            e177, e178, e179, e180, e181, e182, e183, e184, e185, e186, e187,
            e188, e189, e190, e191, e192, e193, e194, e195, e196, e197, e198,
            e199, e200, e201, e202, e203, e204, e205, e206, e207, e208, e209,
            e210, e211, e212, e213, e214, e215, e216, e217, e218, e219, e220,
            e221, e222, e223, e224, e225, e226, e227, e228, e229, e230, e231,
            e232, e233, e234, e235, e236, e237, e238, e239, e240, e241, e242,
            e243, e244, e245, e246, e247, e248, e249, e250, e251, e252, e253,
            e254, e255, e256, e257, e258};

        //load edges into graph
        EdgeWeightedDigraph ewd = new EdgeWeightedDigraph(50);
        for (int i = 0; i < edges.length; i++) {
            ewd.addEdge(edges[i]);
        }

        //generate shortest paths from each base station
        BellmanFordSP stn7 = new BellmanFordSP(ewd, 7);
        System.out.println("Total weight from station 7: " + stn7.weight());
        BellmanFordSP stn14 = new BellmanFordSP(ewd, 14);
        System.out.println("Total weight from station 14: " + stn14.weight());
        BellmanFordSP stn28 = new BellmanFordSP(ewd, 28);
        System.out.println("Total weight from station 28: " + stn28.weight());
        BellmanFordSP stn25 = new BellmanFordSP(ewd, 25);
        System.out.println("Total weight from station 25: " + stn25.weight());
        BellmanFordSP stn40 = new BellmanFordSP(ewd, 40);
        System.out.println("Total weight from station 40: " + stn40.weight());
        System.out.println();
        System.out.println("If I could only build one field station that "
                + "minimizes the cost of cable than it would be the station"
                + " with the smallest total weight which is station #14.");
        System.out.println();
        System.out.println();

        //load bf trees into an array
        BellmanFordSP[] bfArr = new BellmanFordSP[]{stn7, stn14, stn28, stn25,
            stn40};

        //establish best source station for each node
        ShortestTravelTime stt = new ShortestTravelTime(bfArr);

        //display list of shortest paths to each customer node from the 
        //nearest field station node
        System.out.print("Shortest Travel Times ");
        System.out.println("(See attached Tree diagaram): ");
        System.out.println();
        double weight = 0;
        Stack tmp = new Stack<DirectedEdge>();
        for (int i = 0; i < ewd.V(); i++) {
            System.out.print("Path to node " + i + ": ");
            tmp = stt.nearestSource(i).pathTo(i);
            tmp.displayStack();
            while (tmp.size() != 0) {
                DirectedEdge de = (DirectedEdge) tmp.pop();
                weight = weight + de.weight();
            }
            System.out.println(" Total travel time to customer: " + weight);
            System.out.println();
            weight = 0;
        }

    }

}

/*

run:
Total weight from station 7: 1328.0
Total weight from station 14: 1270.0
Total weight from station 28: 1276.0
Total weight from station 25: 1271.0
Total weight from station 40: 1266.0

If I could only build one field station that minimizes the cost of cable than
it would be the station with the smallest total weight which is station #14.


Shortest Travel Times (See attached Tree diagaram): 

Path to node 0: 7->5 15.000, 5->6 20.000, 6->0 17.000
 Total travel time to customer: 52.0

Path to node 1: 7->5 15.000, 5->1 13.000
 Total travel time to customer: 28.0

Path to node 2: 14->3 15.000, 3->2 15.000
 Total travel time to customer: 30.0

Path to node 3: 14->3 15.000
 Total travel time to customer: 15.0

Path to node 4: 7->4 31.000
 Total travel time to customer: 31.0

Path to node 5: 7->5 15.000
 Total travel time to customer: 15.0

Path to node 6: 7->5 15.000, 5->6 20.000
 Total travel time to customer: 35.0

Path to node 7: 
 Total travel time to customer: 0.0

Path to node 8: 14->3 15.000, 3->8 15.000
 Total travel time to customer: 30.0

Path to node 9: 14->3 15.000, 3->9 31.000
 Total travel time to customer: 46.0

Path to node 10: 14->12 22.000, 12->10 22.000
 Total travel time to customer: 44.0

Path to node 11: 40->45 20.000, 45->11 21.000
 Total travel time to customer: 41.0

Path to node 12: 14->12 22.000
 Total travel time to customer: 22.0

Path to node 13: 14->15 36.000, 15->13 28.000
 Total travel time to customer: 64.0

Path to node 14: 
 Total travel time to customer: 0.0

Path to node 15: 14->15 36.000
 Total travel time to customer: 36.0

Path to node 16: 7->16 25.000
 Total travel time to customer: 25.0

Path to node 17: 7->17 20.000
 Total travel time to customer: 20.0

Path to node 18: 14->21 16.000, 21->18 20.000
 Total travel time to customer: 36.0

Path to node 19: 14->19 23.000
 Total travel time to customer: 23.0

Path to node 20: 14->20 35.000
 Total travel time to customer: 35.0

Path to node 21: 14->21 16.000
 Total travel time to customer: 16.0

Path to node 22: 28->22 17.000
 Total travel time to customer: 17.0

Path to node 23: 28->23 18.000
 Total travel time to customer: 18.0

Path to node 24: 25->24 25.000
 Total travel time to customer: 25.0

Path to node 25: 
 Total travel time to customer: 0.0

Path to node 26: 25->26 30.000
 Total travel time to customer: 30.0

Path to node 27: 28->27 43.000
 Total travel time to customer: 43.0

Path to node 28: 
 Total travel time to customer: 0.0

Path to node 29: 25->24 25.000, 24->29 15.000
 Total travel time to customer: 40.0

Path to node 30: 25->30 30.000
 Total travel time to customer: 30.0

Path to node 31: 25->31 21.000
 Total travel time to customer: 21.0

Path to node 32: 7->32 30.000
 Total travel time to customer: 30.0

Path to node 33: 40->46 28.000, 46->33 30.000
 Total travel time to customer: 58.0

Path to node 34: 28->34 30.000
 Total travel time to customer: 30.0

Path to node 35: 28->35 25.000
 Total travel time to customer: 25.0

Path to node 36: 40->36 30.000
 Total travel time to customer: 30.0

Path to node 37: 25->37 50.000
 Total travel time to customer: 50.0

Path to node 38: 25->31 21.000, 31->38 40.000
 Total travel time to customer: 61.0

Path to node 39: 40->39 40.000
 Total travel time to customer: 40.0

Path to node 40: 
 Total travel time to customer: 0.0

Path to node 41: 40->41 27.000
 Total travel time to customer: 27.0

Path to node 42: 28->34 30.000, 34->42 20.000
 Total travel time to customer: 50.0

Path to node 43: 40->41 27.000, 41->43 14.000
 Total travel time to customer: 41.0

Path to node 44: 28->34 30.000, 34->42 20.000, 42->44 24.000
 Total travel time to customer: 74.0

Path to node 45: 40->45 20.000
 Total travel time to customer: 20.0

Path to node 46: 40->46 28.000
 Total travel time to customer: 28.0

Path to node 47: 40->41 27.000, 41->43 14.000, 43->47 15.000
 Total travel time to customer: 56.0

Path to node 48: 40->46 28.000, 46->48 15.000
 Total travel time to customer: 43.0

Path to node 49: 40->46 28.000, 46->49 35.000
 Total travel time to customer: 63.0

BUILD SUCCESSFUL (total time: 0 seconds)



*/