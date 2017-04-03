import java.util.ArrayList;

/**
 * Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).
 * <p>
 * You may assume that the intervals were initially sorted according to their start times.
 * <p>
 * Example 1:
 * <p>
 * Given intervals [1,3],[6,9] insert and merge [2,5] would result in [1,5],[6,9].
 * <p>
 * Example 2:
 * <p>
 * Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] would result in [1,2],[3,10],[12,16].
 * <p>
 * This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].
 * <p>
 * Make sure the returned intervals are also sorted.
 * * Definition for an interval.
 * public class Interval {
 * int start;
 * int end;
 * Interval() { start = 0; end = 0; }
 * Interval(int s, int e) { start = s; end = e; }
 * }
 */

//ideas I think we should have two pointers to check first and last interval

public class MergeItervals {


    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {

        Interval interval;
        int rightIndex = intervals.size() - 1;

        for (int leftIndex = 0; leftIndex < intervals.size(); leftIndex++) {
            interval = intervals.get(leftIndex);

            if (newInterval.start < interval.start && newInterval.end < interval.start) {
                intervals.add(leftIndex, newInterval);
            }

            rightIndex--;

        }

        return  intervals;


    }

    private class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }
}
