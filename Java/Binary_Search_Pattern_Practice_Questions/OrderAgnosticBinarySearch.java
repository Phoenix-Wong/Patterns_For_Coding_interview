/*
Question : Given a sorted array of numbers, find if a given number ‘key’ is present in the array. Though we know that the array is sorted, we don’t know if it’s sorted in ascending or descending order. You should assume that the array can have duplicates. Write a function to return the index of the ‘key’ if it is present in the array, otherwise return -1.
*/

package Binary_Search_Pattern_Practice_Questions;

class OrderAgnosticBinarySearch
{
    public static void main (String args[])
    {
        //region TestCases
        
        //int[] arr = new int[] {4,6,10};
        //int target = 10;

        // int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7};
        // int target = 5;

        //int[] arr = new int[] {10, 6, 4};
        //int target = 10;

        int[] arr = new int[] {10, 6, 4};
        int target = 4;

        //endregion

        int result = OrderAgnosticBinarySearch.search(arr, target);

        System.out.println(result);            
        
    }



    public static int search(int[] arr, int target)
    {
        boolean IsAscending = arr[0] < arr[arr.length - 1];
        int startIndex = 0;
        int endIndex = arr.length - 1;
        while(startIndex <= endIndex)
        {
            int mid = startIndex + (endIndex - startIndex) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            // if mid > target isAscending true = move left
            // if mid < target isAscending false = move left
            // if mid < target isAscending true = move right
            // if mid > target isAscending false = move right
            if ((arr[mid] > target && IsAscending) || (arr[mid] < target && !IsAscending)) // need to move to left
            {
                endIndex = mid - 1;
            } else {
                startIndex = mid + 1;
            }
        }
        
        return -1;

    }
}