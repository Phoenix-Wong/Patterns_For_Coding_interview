/*
Question : Given a set of numbers that might contain duplicates, find all of its distinct subsets.
*/

package Subset_Pattern_Practice_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SubsetsWithDuplicates {
    public static void main(String args[]) {
        // region TestCases

        // first test case

        int[] arr = new int[]{1, 5, 3, 3};

        // endregion

        List<List<Integer>> result = SubsetsWithDuplicates.findSubsets(arr);

        for (List<Integer> i : result) {
            System.out.println(Arrays.toString(i.toArray()));
        }
    }

    public static List<List<Integer>> findSubsets(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();

        //add empty array
        result.add(new ArrayList<Integer>());

        int startIndex = 0;
        int endIndex = result.size();
        //traverse through array
        for (int i = 0; i < arr.length; i++) {
            //set start index to 0 every new element
            startIndex = 0;


            //check if the element is duplicate or not
            if (i > 0 && arr[i] == arr[i - 1]) {
                //set start index to use only last element
                startIndex = endIndex;
            }

            //fetch latest size of the subsets
            endIndex = result.size();

            //add new element to every subset
            for (int j = startIndex; j < endIndex; j++) {
                //fetch the subset at this index
                ArrayList<Integer> set = new ArrayList<>(result.get(j));
                set.add(arr[i]);
                //find duplicate
                result.add(set);

            }

        }
        return result;
    }


}
