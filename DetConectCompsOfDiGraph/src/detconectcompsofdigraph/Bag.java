/*
Mathew Buck
CIS 27 Lab 4
 */
package detconectcompsofdigraph;

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

    private class Node {
        Item item;
        Node next;
    }

}
