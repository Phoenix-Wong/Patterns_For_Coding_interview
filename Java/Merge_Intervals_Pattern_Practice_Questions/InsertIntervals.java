/*
Question : Given a list of non-overlapping intervals sorted by their start time, insert a given interval at the correct position and merge all necessary intervals to produce a list that has only mutually exclusive intervals.
*/

package Merge_Intervals_Pattern_Practice_Questions;

import java.util.ArrayList;
import java.util.List;


class InsertIntervals {
    public static void main(String args[]) {
        //region TestCases

        //first test case
        Interval toInsert = new Interval(0, 6);
        List<Interval> listOfIntervals = new ArrayList<>();
        listOfIntervals.add(new Interval(1, 3));
        listOfIntervals.add(new Interval(5, 7));
        listOfIntervals.add(new Interval(8, 12));

        //endregion

        List<Interval> result = InsertIntervals.insertIntervals(listOfIntervals, toInsert);

        for (Interval i : result) {
            System.out.println(i.start + " , " + i.end);
        }
    }


    public static List<Interval> insertIntervals(List<Interval> list, Interval toInsert) {
        List<Interval> result = new ArrayList<>();
        int index = 0;
        //insert all the intervals before the new interval
        while (index < list.size() && list.get(index).end < toInsert.start) {
            result.add(list.get(index));
            index++;
        }

        //merge all overlapping interval to new interval
        while (index < list.size() && list.get(index).start < toInsert.end) {
            toInsert.start = Math.min(toInsert.start, list.get(index).start);
            toInsert.end = Math.max(toInsert.end, list.get(index).end);
            index++;
        }

        //insert new Interval
        result.add(toInsert);

        //insert rest of the intervals
        while (index < list.size()) {
            result.add(list.get(index));
            index++;
        }

        return result;
    }
}
