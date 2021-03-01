/*
Question : Given an array of numbers sorted in an ascending order, find the ceiling of a given number ‘key’. The ceiling of the ‘key’ will be the smallest element in the given array greater than or equal to the ‘key’. Write a function to return the index of the ceiling of the ‘key’. If there isn’t any ceiling return -1.
*/

package Binary_Search_Pattern_Practice_Questions;

class SearchCeilingOfNumber {
    public static void main(String args[]) {
        //region TestCases

        //int[] arr = new int[] {4,6,10};
        //int target = 6;

        //int[] arr = new int[] {1, 3, 8, 10, 15};
        //int target = 12;

        //int[] arr = new int[] {4, 6, 10};
        //int target = 17;

        int[] arr = new int[]{4, 6, 10};
        int target = -1;

        //endregion

        int result = SearchCeilingOfNumber.search(arr, target);

        System.out.println(result);

    }


    public static int search(int[] arr, int target) {
        if (arr[arr.length - 1] < target) {
            return -1;
        }

        int startIndex = 0;
        int endIndex = arr.length - 1;

        while (startIndex <= endIndex) {
            int mid = startIndex + (endIndex - startIndex) / 2;
            if (mid == target) {
                return mid;
            } else if (arr[mid] > target) // move left
            {
                endIndex = mid - 1;
            } else {
                startIndex = mid + 1;
            }
        }
        return startIndex;
    }
}
