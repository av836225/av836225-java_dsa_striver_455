package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class countNiceSubArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 1, 1};
        int k = 3;
        System.out.println(numberOfSubarrays(nums, k)); 
    }

    public static int numberOfSubarrays(int[] nums, int k){

        Map<Integer,Integer> map = new HashMap<>();
        int oddCount = 0;
        int count = 0;
        map.put(0, 1);
       
        for(int num: nums){

            if(num % 2 != 0){
                oddCount++;
            }

            count += map.getOrDefault(oddCount - k, 0);

            map.put(oddCount, map.getOrDefault(oddCount, 0) + 1);

        }


        return count;

    }

}


// Time: O(n)

// Space: O(n) — for the HashMap storing prefix sums