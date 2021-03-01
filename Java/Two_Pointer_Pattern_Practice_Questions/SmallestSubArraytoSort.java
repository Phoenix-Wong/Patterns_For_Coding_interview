/*
Question : Given an array of integers, find the shortest sub array, that if sorted, results in the entire array being sorted. For example: [1,2,4,5,3,5,6,7] --> [4,5,3] - If you sort from indices 2 to 4, the entire array is sorted. [1,3,5,2,6,4,7,8,9] --> [3,5,2,6,4] - If you sort from indices 1 to 5, the entire array is sorted.
*/

package Two_Pointer_Pattern_Practice_Questions;

import java.util.Arrays;

class SmallestSubArraytoSort {
    public static void main(String args[]) {
        //region TestCases

        //first test case

        int[] arr = new int[]{1, 3, 5, 2, 6, 4, 7, 8, 9};

        //endregion

        int[] result = SmallestSubArraytoSort.sortestSubArray(arr);

        System.out.println(Arrays.toString(result));

    }


    public static int[] sortestSubArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < arr.length - 1) {
            if (arr[start] > arr[start + 1]) {
                break;
            }

            start++;

        }

        while (end > 0) {
            if (arr[end] < arr[end - 1]) {
                break;
            }
            end--;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = start; i <= end; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        while (start > 0 && arr[start - 1] > min) {
            start--;
        }

        while (end < (arr.length - 1) && arr[end + 1] < max) {
            end++;
        }

        return new int[]{start, end};
    }
}
