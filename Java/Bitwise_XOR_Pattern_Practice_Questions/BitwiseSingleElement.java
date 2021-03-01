/*
Question : In a non-empty array of integers, every number appears twice except for one, find that single number.
*/

package Bitwise_XOR_Pattern_Practice_Questions;

class BitwiseSingleElement {
    public static void main(String args[]) {
        //region TestCases

        int[] arr = new int[]{1, 4, 2, 1, 3, 2, 3};

        //endregion

        int result = BitwiseSingleElement.findSingleNumber(arr);

        System.out.println(result);

    }

    public static int findSingleNumber(int[] arr) {
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = num ^ arr[i];
        }
        return num;
    }
}
