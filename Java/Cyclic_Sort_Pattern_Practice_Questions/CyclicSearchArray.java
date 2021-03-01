/*
Question : We are given an array containing ‘n’ distinct numbers taken from the range 0 to ‘n’. Since the array has only ‘n’ numbers out of the total ‘n+1’ numbers, find the missing number.
*/

package Cyclic_Sort_Pattern_Practice_Questions;


class CyclicSearchArray {
    public static void main(String args[]) {
        //region TestCases

        //first test case

        int[] arr = new int[]{4, 0, 3, 1};

        //endregion

        int result = CyclicSearchArray.search(arr);


        System.out.println(result);

    }


    public static int search(int[] arr) {
        int index = 0;
        //traverse every element
        while (index < arr.length) {

            if (arr[index] < arr.length && arr[index] != arr[arr[index]]) //element at wrong place
            {
                swap(arr, index, arr[index]);
            } else {
                index++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                return i;
            }
        }

        return arr.length;

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
