/*
Mathew Buck
CIS 27 Lab4
 */
package responsetimeex4d;

public class ShortestTravelTime {

    BellmanFordSP[] bfArr;

    ShortestTravelTime(BellmanFordSP[] bfArr) {
        this.bfArr = bfArr;
    }

    //return the BellmenFort Tree with the root nearest to the target node v
    public BellmanFordSP nearestSource(int v) {
        BellmanFordSP bestSource = bfArr[0];
        double[] distArr = bfArr[0].distTo();
        double minDist = distArr[v];

        for (int i = 1; i < bfArr.length; i++) {
            distArr = bfArr[i].distTo();
            if (distArr[v] < minDist) {
                minDist = distArr[v];
                bestSource = bfArr[i];
            }
        }
        return bestSource;
    }

}
