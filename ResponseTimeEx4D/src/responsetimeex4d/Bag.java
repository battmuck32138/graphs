/*
Mathew Buck
CIS 27 Lab 4
 */
package responsetimeex4d;

import java.util.Iterator;

//Test code for varius algorithms associated with Lab 4
public class Bag<Item> implements Iterable<Item> {

    private Node first;
    private int size = 0;

    public void add(Item item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        size++;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return size;
    }

    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {

        private Node current = first;

        public boolean hasNext() {
            return current != null;
        }

        public void remove() {
        }

        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    //displays the size and contents of the nodes
    public void displayBag() {
        Node current = first;
        System.out.print("Size " + size + ": ");
        while (current != null) {
            current.displayNode();
            if (current.next != null) {
                System.out.print(", ");
            }
            current = current.next;
        }
        System.out.println();
    }

    //------------------------------------------------------------------------
    private class Node {

        Item item;
        Node next;

        public void displayNode() {
            System.out.print(item);
        }

        public String toString() {
            return item.toString();
        }

    }

}

/*
OUTPUT

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
BUILD SUCCESSFUL (total time: 0 seconds)



*/
