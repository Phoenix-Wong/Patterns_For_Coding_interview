/*
Question : Given an unsorted array of numbers, find the ‘K’ largest numbers in it.
*/

package Top_K_Element_Pattern_Practice_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

class KLargestNumbers {
    public static void main(String args[]) {
        //region TestCases

        int[] arr = new int[] { 3, 1, 5, 12, 2, 11 };
        int numberOfElements = 3;
        //endregion

        List<Integer> result = KLargestNumbers.search(arr, numberOfElements);

        System.out.println(Arrays.toString(result.toArray()));
    }

    public static List<Integer> search(int[] arr, int numberOfElements) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> a - b);

        for (int i = 0; i < numberOfElements; i++) {
            minHeap.offer(arr[i]);
        }

        for (int i = numberOfElements; i < arr.length; i++) {
            if (arr[i] > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(arr[i]);
            }
        }

        return new ArrayList<>(minHeap);
    }
}