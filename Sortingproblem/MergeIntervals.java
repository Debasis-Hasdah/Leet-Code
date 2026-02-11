package Sortingproblem;

import java.util.*;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }

        // Step 1: Sort by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        int[] current = intervals[0];
        merged.add(current);

        for (int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i];

            if (next[0] <= current[1]) {
                // Overlap → merge
                current[1] = Math.max(current[1], next[1]);
            } else {
                // No overlap → new interval
                current = next;
                merged.add(current);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals1 = { {1,3}, {2,6}, {8,10}, {15,18} };
        printArray(merge(intervals1));

        int[][] intervals2 = { {1,4}, {4,5} };
        printArray(merge(intervals2));

        int[][] intervals3 = { {1,4}, {2,3} };
        printArray(merge(intervals3));
    }

    public static void printArray(int[][] arr) {
        System.out.print("[ ");
        for (int[] interval : arr) {
            System.out.print(Arrays.toString(interval) + " ");
        }
        System.out.println("]");
    }
}

