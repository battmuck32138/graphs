/*
Mathew Buck
CIS 27 Lab 4
 */
package responsetimeex4d;

public class DirectedEdge {

    private final int v;//source edge
    private final int w;//target edgde
    private final double weight;//edge weight

    public DirectedEdge(int v, int w, double weight) {
        this.v = v;
        this.w = w;
        this.weight = weight;
    }

    public double weight() {
        return weight;
    }

    public int from() {
        return v;
    }

    public int to() {
        return w;
    }

    public String toString() {
        return String.format("%d->%d %.3f", v, w, weight);
    }

}
