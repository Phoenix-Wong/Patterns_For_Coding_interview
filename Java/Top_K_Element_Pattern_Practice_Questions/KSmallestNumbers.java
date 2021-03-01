/*
Question : Given an unsorted array of numbers, find Kth smallest number in it.
*/

package Top_K_Element_Pattern_Practice_Questions;

import java.util.PriorityQueue;

class KSmallestNumbers {
    public static void main(String args[]) {
        //region TestCases

        int[] arr = new int[]{1, 5, 12, 2, 11, 5};
        int numberOfElements = 5;
        //endregion

        int result = KSmallestNumbers.search(arr, numberOfElements);

        System.out.println(result);
    }

    public static int search(int[] arr, int numberOfElements) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for (int i = 0; i < numberOfElements; i++) {
            maxHeap.offer(arr[i]);
        }


        for (int i = numberOfElements; i < arr.length; i++) {
            if (arr[i] < maxHeap.peek()) {
                maxHeap.poll();
                maxHeap.offer(arr[i]);
            }
        }

        return maxHeap.poll();
    }
}
