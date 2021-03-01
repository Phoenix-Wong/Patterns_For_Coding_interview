/*
Question : Given an array, reverse the order of its elements. For example, [3,5,2,5,2,3,9] → [9,3,2,5,2,5,3].
*/

package Two_Pointer_Pattern_Practice_Questions;

import java.util.Arrays;

class ReverseArray {
    public static void main(String args[]) {
        //region TestCases

        //first test case

        int[] arr = new int[]{3, 5, 2, 5, 2, 3, 9};

        //endregion

        int[] result = ReverseArray.reverse(arr);

        System.out.println(Arrays.toString(result));

    }

    public static int[] reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            Swap(arr, start, end);
            start++;
            end--;
        }
        return arr;
    }

    public static void Swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
