/*
Question : Given an array of lowercase letters sorted in ascending order, find the smallest letter in the given array greater than a given ‘key’. Assume the given array is a circular list, which means that the last letter is assumed to be connected with the first letter. This also means that the smallest letter in the given array is greater than the last letter of the array and is also the first letter of the array. Write a function to return the next letter of the given ‘key’.
*/

package Binary_Search_Pattern_Practice_Questions;

class SearchNextNumber {
    public static void main(String args[]) {
        //region TestCases


        // char[] arr = new char[] {'a', 'c', 'f', 'h'};
        // char target = 'f';

        // char[] arr = new char[] {'a', 'c', 'f', 'h'};
        // char target = 'b';

        char[] arr = new char[]{'a', 'c', 'f', 'h'};
        char target = 'm';


        //endregion

        char result = SearchNextNumber.search(arr, target);

        System.out.println(result);

    }


    public static char search(char[] arr, char target) {
        int n = arr.length;
        if (target < arr[0] || target > arr[arr.length - 1]) {
            return arr[0];
        }

        int startIndex = 0;
        int endIndex = arr.length - 1;

        while (startIndex <= endIndex) {
            int mid = startIndex + (endIndex - startIndex) / 2;
            if (arr[mid] > target) {
                endIndex = mid - 1;
            } else {
                startIndex = mid + 1;
            }

        }

        //In the end, instead of returning the element pointed out by start, we have to return the letter pointed out by start % array_length. This is needed because of point 2 discussed above. Imagine that the last letter of the array is equal to the ‘key’. In that case, we have to return the first letter of the input array.
        return arr[startIndex % n];
    }
}
