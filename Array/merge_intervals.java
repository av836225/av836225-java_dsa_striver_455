package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class merge_intervals {
    public static void main(String[] args) {
           int[][] intervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18}
        };

        int[][] result = mergeIntervals(intervals);

        System.out.println("Merged Intervals:");
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }

    public static int[][] mergeIntervals(int[][] intervals){

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        List<int[]> merged = new ArrayList<>();

         for (int[] interval : intervals) {
            if(merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]){
                merged.add(interval);

            }else{
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
         }


        return merged.toArray(new int [merged.size()][]);

    }
}
