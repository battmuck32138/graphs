/*
Mathew Buck
CIS 27 Lab 4
 */
package graphsdriver;

public class GraphsDriver {

    public static void main(String[] args) {

        Graph g = new Graph(12);
        g.addEdge(0, 6);
        g.addEdge(6, 3);
        g.addEdge(3, 10);
        g.addEdge(5, 10);
        g.addEdge(0, 5);
        g.addEdge(0, 2);
        g.addEdge(2, 3);
        g.addEdge(7, 8);
        g.addEdge(7, 11);
        g.addEdge(7, 8);
        g.addEdge(8, 4);
        g.addEdge(1, 4);
        g.addEdge(1, 11);
        g.addEdge(1, 8);
        g.addEdge(11, 8);

        System.out.println(g.toSting());

        ConComps cc = new ConComps(g);
        System.out.println(cc.connected(0, 9));

        DepthFirstSearch dfs = new DepthFirstSearch(g, 0);
        System.out.println("Depth First Search has visited these verticies: ");
        dfs.displayMarked();

        System.out.println("Shortest Path from 0 to 6:");
        BreadthFirstPaths bfp = new BreadthFirstPaths(g, 0);
        Stack s = (Stack) bfp.pathTo(6);
        s.displayStack();

        DiGraph dg = new DiGraph(13);
        dg.addEdge(6, 0);
        dg.addEdge(0, 5);
        dg.addEdge(5, 4);
        dg.addEdge(3, 5);
        dg.addEdge(4, 3);
        dg.addEdge(4, 2);
        dg.addEdge(2, 3);
        dg.addEdge(0, 1);
        dg.addEdge(3, 2);
        dg.addEdge(2, 0);
        dg.addEdge(6, 4);
        dg.addEdge(11, 4);
        dg.addEdge(6, 9);
        dg.addEdge(9, 11);
        dg.addEdge(7, 6);
        dg.addEdge(11, 12);
        dg.addEdge(12, 9);
        dg.addEdge(10, 12);
        dg.addEdge(8, 9);
        dg.addEdge(8, 7);
        dg.addEdge(7, 8);
        dg.addEdge(9, 10);
        System.out.println(dg.toSting());

        DiGraph dgb = new DiGraph(12);
        dgb.addEdge(0, 1);
        dgb.addEdge(1, 2);
        dgb.addEdge(1, 3);
        dgb.addEdge(1, 4);
        dgb.addEdge(4, 1);
        dgb.addEdge(2, 5);
        dgb.addEdge(5, 2);
        dgb.addEdge(4, 5);
        dgb.addEdge(4, 6);
        dgb.addEdge(5, 7);
        dgb.addEdge(6, 7);
        dgb.addEdge(8, 6);
        dgb.addEdge(9, 8);
        dgb.addEdge(6, 9);
        dgb.addEdge(7, 10);
        dgb.addEdge(10, 11);
        dgb.addEdge(11, 9);
        System.out.println(dgb.toSting());

        StrongComponents sc = new StrongComponents(dgb);
        System.out.println(sc.stronglyConnected(0, 1));
        System.out.println(sc.stronglyConnected(1, 2));
        System.out.println(sc.stronglyConnected(7, 6));
        System.out.println(sc.stronglyConnected(5, 2));

        MinPriorityQue min = new MinPriorityQue(20);
        min.insert(10);
        min.insert(13);
        min.insert(9);
        min.insert(6);
        min.insert(-8);
        System.out.println(min.delMin());

        EdgeWeightedGraph ewg = new EdgeWeightedGraph(8);
        System.out.println(ewg.E());
        Edge e1 = new Edge(1, 7, .19);
        ewg.addEdge(e1);
        Edge e2 = new Edge(0, 2, .26);
        ewg.addEdge(e2);
        Edge e3 = new Edge(5, 7, .28);
        ewg.addEdge(e3);
        Edge e4 = new Edge(2, 7, .34);
        ewg.addEdge(e4);
        Edge e5 = new Edge(4, 7, .37);
        ewg.addEdge(e5);
        Edge e6 = new Edge(0, 4, .38);
        ewg.addEdge(e6);
        Edge e7 = new Edge(6, 0, .58);
        ewg.addEdge(e7);
        Edge e8 = new Edge(0, 7, .16);
        ewg.addEdge(e8);
        Edge e9 = new Edge(1, 5, .32);
        ewg.addEdge(e9);
        Edge e10 = new Edge(1, 3, .29);
        ewg.addEdge(e10);
        Edge e11 = new Edge(1, 2, .36);
        ewg.addEdge(e11);
        Edge e12 = new Edge(5, 4, .35);
        ewg.addEdge(e12);
        Edge e13 = new Edge(3, 6, .52);
        ewg.addEdge(e13);
        Edge e14 = new Edge(4, 6, .93);
        ewg.addEdge(e14);
        Edge e15 = new Edge(2, 6, .4);
        ewg.addEdge(e15);
        Edge e16 = new Edge(3, 2, .17);
        ewg.addEdge(e16);
        System.out.println(ewg.E());
        System.out.println(ewg.V());
        System.out.println(e15);
        ewg.displayEWG();

        LazyPrimMST lp = new LazyPrimMST(ewg);
        System.out.println("");
        lp.displayMST();
        System.out.println(lp.weight());

        
        EdgeWeightedDigraph ewd = new EdgeWeightedDigraph(8);
        DirectedEdge d1 = new DirectedEdge(4,5,.35);
        DirectedEdge d2 = new DirectedEdge(5,4,.35);
        DirectedEdge d3 = new DirectedEdge(4,7,.37);
        DirectedEdge d4 = new DirectedEdge(5,7,.28);
        DirectedEdge d5 = new DirectedEdge(7,5,.28);
        DirectedEdge d6 = new DirectedEdge(5,1,.32);
        DirectedEdge d7 = new DirectedEdge(0,4,.38);
        DirectedEdge d8 = new DirectedEdge(0,2,.26);
        DirectedEdge d9 = new DirectedEdge(7,3,.39);
        DirectedEdge d10 = new DirectedEdge(2,7,.34);
        DirectedEdge d11 = new DirectedEdge(6,2,-1.2);
        DirectedEdge d12 = new DirectedEdge(3,6,.52);
        DirectedEdge d13 = new DirectedEdge(6,0,-1.4);
        DirectedEdge d14 = new DirectedEdge(6,4, -1.25);
        
        ewd.addEdge(d1);
        ewd.addEdge(d2);
        ewd.addEdge(d3);
        ewd.addEdge(d4);
        ewd.addEdge(d5);
        ewd.addEdge(d6);
        ewd.addEdge(d7);
        ewd.addEdge(d8);
        ewd.addEdge(d9);
        ewd.addEdge(d10);
        ewd.addEdge(d11);
        ewd.addEdge(d12);
        ewd.addEdge(d13);
        ewd.addEdge(d14);
        System.out.println();
        ewd.displayEWDG();
        System.out.println();
        
        BellmanFordSP bf = new BellmanFordSP(ewd, 0);
        bf.displayPath();
        System.out.println(bf.pathSize());
        
        Edge ab = new Edge(0, 1, 1);
        Edge bc = new Edge(1, 2, 2);
        Edge cd = new Edge(2, 3, 3);
        Edge ae = new Edge(0, 4, 4);
        Edge ef = new Edge(4, 5, 5);
        Edge fg = new Edge(5, 6, 1);
        Edge gh = new Edge(6, 7, 1);
        Edge dh = new Edge(3, 7, 4);
        Edge af = new Edge(0, 5, 8);
        Edge bg = new Edge(1, 6, 6);
        Edge gd = new Edge(6, 3, 1);
        EdgeWeightedGraph ewg3a = new EdgeWeightedGraph(8);
        ewg3a.addEdge(ab);
        ewg3a.addEdge(bc);
        ewg3a.addEdge(cd);
        ewg3a.addEdge(ae);
        ewg3a.addEdge(ef);
        ewg3a.addEdge(fg);
        ewg3a.addEdge(gh);
        ewg3a.addEdge(dh);
        ewg3a.addEdge(af);
        ewg3a.addEdge(bg);
        ewg3a.addEdge(gd);
      
        LazyPrimMST lp3a = new LazyPrimMST(ewg3a);
        lp3a.displayMST();
        System.out.println();
        
        DirectedEdge de1 = new DirectedEdge(0, 2, -2);
        DirectedEdge de2 = new DirectedEdge(2, 3, 2);
        DirectedEdge de3 = new DirectedEdge(5, 3, 3);
        DirectedEdge de4 = new DirectedEdge(4, 5, -2);
        DirectedEdge de5 = new DirectedEdge(2, 5, 1);
        DirectedEdge de6 = new DirectedEdge(9, 2, 6);
        DirectedEdge de7 = new DirectedEdge(9, 0, 7);
        DirectedEdge de8 = new DirectedEdge(9, 5, 5);
        DirectedEdge de9 = new DirectedEdge(9, 4, 6);
        DirectedEdge de10 = new DirectedEdge(4, 7, 3);
        DirectedEdge de11 = new DirectedEdge(1, 7, -4);
        DirectedEdge de12 = new DirectedEdge(1, 6, -2);
        DirectedEdge de13 = new DirectedEdge(6, 8, -1);
        DirectedEdge de14 = new DirectedEdge(8, 7, 1);
        DirectedEdge de15 = new DirectedEdge(7, 6, 1);
        DirectedEdge de16 = new DirectedEdge(0, 1, 4);
        EdgeWeightedDigraph g4b = new EdgeWeightedDigraph(10);
        g4b.addEdge(de1);
        g4b.addEdge(de2);
        g4b.addEdge(de3);
        g4b.addEdge(de4);
        g4b.addEdge(de5);
        g4b.addEdge(de6);
        g4b.addEdge(de7);
        g4b.addEdge(de8);
        g4b.addEdge(de9);
        g4b.addEdge(de10);
        g4b.addEdge(de11);
        g4b.addEdge(de12);
        g4b.addEdge(de13);
        g4b.addEdge(de14);
        g4b.addEdge(de15);
        g4b.addEdge(de16);
      
        BellmanFordSP bf4b = new BellmanFordSP(g4b, 0);
        bf4b.displayPath();
        System.out.println();
        
        KruskalMST k = new KruskalMST(ewg3a);
        System.out.println("Kruskal's");
        k.displayMST();
        System.out.println();
        
        DirectedEdge da1 = new DirectedEdge(0, 1, 1);
        DirectedEdge da2 = new DirectedEdge(1, 2, 2);
        DirectedEdge da3 = new DirectedEdge(2, 3, 3);
        DirectedEdge da4 = new DirectedEdge(3, 7, 4);
        DirectedEdge da5 = new DirectedEdge(6, 7, 1);
        DirectedEdge da6 = new DirectedEdge(6, 5, 1);
        DirectedEdge da7 = new DirectedEdge(4, 5, 5);
        DirectedEdge da8 = new DirectedEdge(0, 4, 4);
        DirectedEdge da9 = new DirectedEdge(0, 5, 8);
        DirectedEdge da10 = new DirectedEdge(1, 6, 6);
        DirectedEdge da11 = new DirectedEdge(3, 6, 1);
        
        EdgeWeightedDigraph G = new EdgeWeightedDigraph(8);
        G.addEdge(da1);
        G.addEdge(da2);
        G.addEdge(da3);
        G.addEdge(da4);
        G.addEdge(da5);
        G.addEdge(da6);
        G.addEdge(da7);
        G.addEdge(da8);
        G.addEdge(da9);
        G.addEdge(da10);
        G.addEdge(da11);
        
        DijkstraSP dij = new DijkstraSP(G, 0);
        System.out.println();
        System.out.println("Dijkstra's");
        dij.displaySPT();
    }
}


/*

run:
12 vertices, 15 edges
0: 2 5 6 
1: 8 11 4 
2: 3 0 
3: 2 10 6 
4: 1 8 
5: 0 10 
6: 3 0 
7: 8 11 8 
8: 11 1 4 7 7 
9: 
10: 5 3 
11: 8 1 7 

false
Depth First Search has visited these verticies: 
true
false
true
true
false
true
true
false
false
false
true
false
Shortest Path from 0 to 6:
0, 6
13 vertices, 22 edges
0: 1 5 
1: 
2: 0 3 
3: 2 5 
4: 2 3 
5: 4 
6: 9 4 0 
7: 8 6 
8: 7 9 
9: 10 11 
10: 12 
11: 12 4 
12: 9 

12 vertices, 17 edges
0: 1 
1: 4 3 2 
2: 5 
3: 
4: 6 5 1 
5: 7 2 
6: 9 7 
7: 10 
8: 6 
9: 8 
10: 11 
11: 9 

false
false
true
true
-8
0
16
8
2-6 0.40
Size 4: 0-7 0.16, 6-0 0.58, 0-4 0.38, 0-2 0.26
Size 4: 1-2 0.36, 1-3 0.29, 1-5 0.32, 1-7 0.19
Size 5: 3-2 0.17, 2-6 0.40, 1-2 0.36, 2-7 0.34, 0-2 0.26
Size 3: 3-2 0.17, 3-6 0.52, 1-3 0.29
Size 4: 4-6 0.93, 5-4 0.35, 0-4 0.38, 4-7 0.37
Size 3: 5-4 0.35, 1-5 0.32, 5-7 0.28
Size 4: 2-6 0.40, 4-6 0.93, 3-6 0.52, 6-0 0.58
Size 5: 0-7 0.16, 4-7 0.37, 2-7 0.34, 5-7 0.28, 1-7 0.19

Size 7: 0-7 0.16, 1-7 0.19, 0-2 0.26, 3-2 0.17, 5-7 0.28, 5-4 0.35, 2-6 0.40
1.81

Size 2: 0->2 0.260, 0->4 0.380
Size 0: 
Size 1: 2->7 0.340
Size 1: 3->6 0.520
Size 2: 4->7 0.370, 4->5 0.350
Size 3: 5->1 0.320, 5->7 0.280, 5->4 0.350
Size 3: 6->4 -1.250, 6->0 -1.400, 6->2 -1.200
Size 2: 7->3 0.390, 7->5 0.280

Edge Weighted Directed Graph, Path from source 0: 
Edge: null, Distance from source 0 is 0.0
Edge: 5->1 0.320, Distance from source 0 is 0.9300000000000002
Edge: 0->2 0.260, Distance from source 0 is 0.26
Edge: 7->3 0.390, Distance from source 0 is 0.9900000000000001
Edge: 6->4 -1.250, Distance from source 0 is 0.26000000000000023
Edge: 4->5 0.350, Distance from source 0 is 0.6100000000000002
Edge: 3->6 0.520, Distance from source 0 is 1.5100000000000002
Edge: 2->7 0.340, Distance from source 0 is 0.6000000000000001
8
Size 7: 0-1 1.00, 1-2 2.00, 2-3 3.00, 6-3 1.00, 6-7 1.00, 5-6 1.00, 0-4 4.00

Edge Weighted Directed Graph, Path from source 0: 
Edge: null, Distance from source 0 is 0.0
Edge: 0->1 4.000, Distance from source 0 is 4.0
Edge: 0->2 -2.000, Distance from source 0 is -2.0
Edge: 2->3 2.000, Distance from source 0 is 0.0
Edge: null, Distance from source 0 is Infinity
Edge: 2->5 1.000, Distance from source 0 is -1.0
Edge: 7->6 1.000, Distance from source 0 is 1.0
Edge: 1->7 -4.000, Distance from source 0 is 0.0
Edge: 6->8 -1.000, Distance from source 0 is 0.0
Edge: null, Distance from source 0 is Infinity

Kruskal's
Size 7: 6-7 1.00, 5-6 1.00, 0-1 1.00, 6-3 1.00, 1-2 2.00, 2-3 3.00, 0-4 4.00


Dijkstra's
null
0->1 1.000
1->2 2.000
2->3 3.000
0->4 4.000
0->5 8.000
1->6 6.000
6->7 1.000
BUILD SUCCESSFUL (total time: 0 seconds)



*/