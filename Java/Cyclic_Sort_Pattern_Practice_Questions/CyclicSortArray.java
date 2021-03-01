/*
Question : Write a function to sort the objects in-place on their creation sequence number in O(n)O(n) and without any extra space. For simplicity, let’s assume we are passed an integer array containing only the sequence numbers, though each number is actually an object.
*/

package Cyclic_Sort_Pattern_Practice_Questions;

import java.util.Arrays;

class CyclicSortArray {
    public static void main(String args[]) {
        //region TestCases

        //first test case

        int[] arr = new int[]{3, 1, 5, 4, 2};

        //endregion

        int[] result = CyclicSortArray.sort(arr);


        System.out.println(Arrays.toString(result));

    }


    public static int[] sort(int[] arr) {
        int index = 0;
        //traverse every element
        while (index < arr.length) {
            int tempPosition = arr[index] - 1;

            if (arr[tempPosition] != arr[index]) //element at wrong place
            {
                swap(arr, index, tempPosition);
            } else {
                index++;
            }
        }

        return arr;

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
