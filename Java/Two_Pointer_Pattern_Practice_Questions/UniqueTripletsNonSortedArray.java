/*
Question : Given an array of unsorted numbers, find all unique triplets in it that add up to zero.
*/

package Two_Pointer_Pattern_Practice_Questions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class UniqueTripletsNonSortedArray
{
    public static void main (String args[])
    {
        //region TestCases
        
        //first test case
        
        int[] arr = new int[] {-3, 0, 1, 2, -1, 1, -2};
        
        //endregion

        List<List<Integer>> result = UniqueTripletsNonSortedArray.uniqueTripletsNonSortedArray(arr);

        for (List<Integer> is : result) {
            System.out.println(Arrays.toString(is.toArray()));            
        }
    }



    public static List<List<Integer>> uniqueTripletsNonSortedArray(int[] arr)
    {
        List<List<Integer>> listOfList = new LinkedList<>();
        
        //sort the array
        Arrays.sort(arr);

        //loop through all the elements 
        for (int i = 0; i < arr.length - 2; i++)
        {
            //pick up first element and then find other two element using two sum
            if(i == 0 || (i > 0 && arr[i - 1] != arr[i]))
            {
                //element found to be worked upon
                int low = i + 1;
                int high = arr.length - 1;
                int sum = 0 - arr[i];
                
                //using two sum
                while(low < high)
                {
                    if(arr[low] + arr[high] == sum)
                    {

                        listOfList.add(Arrays.asList(arr[i], arr[low], arr[high]));
                        
                        //we don't need duplicate.. so running over the duplicates
                        while (low < high && arr[low] == arr[low + 1])
                            low++;
                        while (high > low && arr[high] == arr[high - 1])
                            high--;

                        //we need to move from existing element
                        high--;
                        low++;
                    }
                    else if(arr[low] + arr[high] > sum)
                    {
                        high--;
                    }
                    else {
                        low++;
                    }

                }
            }
        }
        return listOfList;
    }
}