/*
Question : Given a set of intervals, find out if any two intervals overlap.
*/

package Merge_Intervals_Pattern_Practice_Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class OverlapIntervals
{
    public static void main (String args[])
    {
        //region TestCases
        
        //first test case
        List<Interval> listOfIntervals = new ArrayList<>();
        listOfIntervals.add(new Interval(1 ,4));
        listOfIntervals.add(new Interval(5, 5));
        listOfIntervals.add(new Interval(7, 9));

        //endregion

        boolean result = OverlapIntervals.overlapIntervals(listOfIntervals);

        System.out.println(result);
        
    }



    public static boolean overlapIntervals(List<Interval> list)
    {
        Collections.sort(list, (a,b) -> Integer.compare(a.start,b.start));
        int end = list.get(0).end;

        for(Interval i : list.subList(1, list.size()))
        {
            if (end > i.start) {
                //overlapping return true
                return true;
            } else {
                
                end = i.end;
            }
        }
        return false;
    }
}