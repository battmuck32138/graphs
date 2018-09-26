/*
Mathew Buck
CIS 27 Lab 4
 */
package detconectcompsofdigraph;

import java.util.Iterator;

public class Stack<Item> implements Iterable {

    private Node first;
    private int N;

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    public void push(Item item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        N++;
    }

    public Item pop() {
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }
    
    public void displayStack() {
        Node current = first;
        while (current != null) {
            System.out.print(current.item);
            if (current.next != null) {
                System.out.print(", ");
            }
            current = current.next;
        }
        System.out.println();
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
