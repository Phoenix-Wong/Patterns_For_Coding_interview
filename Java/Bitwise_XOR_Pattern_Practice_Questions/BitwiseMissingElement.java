/*
Question : Given an array of n-1n−1 integers in the range from 11 to nn, find the one number that is missing from the array.
*/

package Bitwise_XOR_Pattern_Practice_Questions;

class BitwiseMissingElement {
    public static void main(String args[]) {
        //region TestCases

        int[] arr = new int[]{1, 5, 2, 6, 4};

        //endregion

        int result = BitwiseMissingElement.search(arr);

        System.out.println(result);

    }

    public static int search(int[] arr) {
        int n = arr.length + 1;

        int x1 = 1;
        for (int i = 2; i <= n; i++) {
            x1 = x1 ^ i;
        }

        int x2 = arr[0];
        for (int i = 1; i < n - 1; i++) {
            x2 = x2 ^ arr[i];
        }

        return x1 ^ x2;
    }

}
