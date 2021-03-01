/*
Question : Given an array of points in the a 2D2D plane, find ‘K’ closest points to the origin.
*/

package Top_K_Element_Pattern_Practice_Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Point {

    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int distanceFromOrigin() {
        // in order to find the distance from the origin in 2d plane the formula is as
        // follows : √x² + y²
        // ignoring sqrt
        return (x * x) + (y * y);
    }

}

class FindClosestPoints {
    public static void main(String args[]) {
        // region TestCases

        // Point[] arr = new Point[] {new Point(1, 2),new Point(1, 3)};
        // int numberOfElements = 1;
        Point[] arr = new Point[]{new Point(1, 3), new Point(3, 4), new Point(2, -1)};
        int numberOfElements = 2;
        // endregion

        List<Point> resultsPoints = FindClosestPoints.search(arr, numberOfElements);
        for (Point result : resultsPoints)
            System.out.println(result.x + " " + result.y);
    }

    public static List<Point> search(Point[] arr, int numberOfElements) {
        PriorityQueue<Point> maxHeap = new PriorityQueue<>(
                (p1, p2) -> p2.distanceFromOrigin() - p1.distanceFromOrigin());

        for (int i = 0; i < numberOfElements; i++) {
            maxHeap.offer(arr[i]);
        }

        for (int i = numberOfElements; i < arr.length; i++) {
            if (arr[i].distanceFromOrigin() < maxHeap.peek().distanceFromOrigin()) {
                maxHeap.poll();
                maxHeap.offer(arr[i]);
            }
        }
        return new ArrayList<>(maxHeap);
    }
}
