/*
Question : Given an array of numbers, replace each even number with two of the same number. e.g, [1,2,5,6,8, , , ,] -> [1,2,2,5,6,6,8,8]. Assume that the array has the exact amount of space to accommodate the result.
*/

package Reverse_Traversal_Pattern_Practice_Questions;

import java.util.Arrays;

class DuplicateEvenNumbers {
    public static void main(String args[]) {
        //region TestCases

        int[] arr = new int[]{1, 2, 5, 6, 8, -1, -1, -1};

        //endregion

        int[] result = DuplicateEvenNumbers.duplicate(arr);

        System.out.println(Arrays.toString(result));
    }

    public static int[] duplicate(int[] arr) {
        if (arr == null || arr.length == 0) return arr;

        int end = arr.length - 1;
        int lastElement = findLastElementIndex(arr, end);

        while (lastElement >= 0) {
            if (arr[lastElement] % 2 == 0) {
                arr[end--] = arr[lastElement];
            }
            arr[end--] = arr[lastElement--];
        }

        return arr;
    }

    public static int findLastElementIndex(int[] arr, int endIndex) {
        while (endIndex >= 0) {
            if (arr[endIndex] != -1) {
                return endIndex;
            }
            endIndex--;
        }
        return endIndex;
    }
}
