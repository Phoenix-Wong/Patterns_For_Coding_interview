/*
Question : Given an array of numbers and a number ‘k’, find the median of all the ‘k’ sized sub-arrays (or windows) of the array.
*/

package Two_Heap_Search_Pattern_Practice_Questions;

import java.util.Collections;
import java.util.PriorityQueue;

class SlidingWindowMedian {
    public static void main(String args[]) {
        // region TestCases

        // first test case

        int[] arr = new int[]{1, 2, -1, 3, 5};
        int k = 2;

        // endregion

        double[] result = SlidingWindowMedian.findSlidingWindowMedian(arr, k);

        for (double i : result) {
            System.out.println(i);
        }

    }

    public static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    public static PriorityQueue<Integer> minHeap = new PriorityQueue<>();


    public static double[] findSlidingWindowMedian(int[] arr, int k) {

        double[] result = new double[arr.length - k + 1];
        //traverse array
        for (int i = 0; i < arr.length; i++) {

            //insert element to heap acc.
            if (maxHeap.size() == 0 || maxHeap.peek() >= arr[i]) {
                maxHeap.add(arr[i]);
            } else {
                minHeap.add(arr[i]);
            }

            //balance heaps
            rebalanceHeaps();

            //if the window size is equal or greater than K
            if (i - k + 1 >= 0) {
                //take out the average of elements in the heap
                if (maxHeap.size() == minHeap.size()) {
                    result[i - k + 1] = maxHeap.peek() / 2.0 + minHeap.peek() / 2.0;
                } else {
                    result[i - k + 1] = maxHeap.peek();
                }

                //remove the element from the heap also
                int elementToBeRemoved = arr[i - k + 1];
                if (elementToBeRemoved <= maxHeap.peek()) {
                    maxHeap.remove(elementToBeRemoved);
                } else {
                    minHeap.remove(elementToBeRemoved);
                }

                //again balance the heaps
                rebalanceHeaps();
            }
        }

        return result;
    }

    public static void rebalanceHeaps() {
        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.add(maxHeap.poll());
        } else if (maxHeap.size() < minHeap.size()) {
            maxHeap.add(minHeap.poll());
        }
    }
}
