/*
Mathew Buck
CIS 27 Lab 4
 */
package minspanlab4exc;

import java.util.Iterator;

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
    
    public boolean isEmpty(){
        return first == null;
    }

    public int size(){
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
