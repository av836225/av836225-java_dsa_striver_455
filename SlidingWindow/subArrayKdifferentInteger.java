package SlidingWindow;

import java.util.HashMap;

public class subArrayKdifferentInteger {
    public static void main(String[] args) {
          int[] nums1 = {1, 2, 1, 2, 3};
        int k1 = 2;
        System.out.println("Output: " + subarraysWithKDistinct(nums1, k1)); // Output: 7

        int[] nums2 = {1, 2, 1, 3, 4};
        int k2 = 3;
        System.out.println("Output: " + subarraysWithKDistinct(nums2, k2)); // Output: 6
    }

   public static int subarraysWithKDistinct(int[] nums, int k) {
        return atMostK(nums, k) - atMostK(nums, k - 1);
    }

    public static int atMostK(int[] nums, int k){
        int left = 0;
        int right = 0;
        int count = 0;
        HashMap<Integer, Integer> newMap = new HashMap<>();

        for(right = 0;right < nums.length; right++){
            int rightNum = nums[right];

            newMap.put(rightNum, newMap.getOrDefault(rightNum, 0) + 1);

            if(newMap.get(rightNum) == 1){
                k--;
            }

            while (k < 0) {
                int leftNum = nums[left];
                newMap.put(leftNum, newMap.get(leftNum) - 1);
                
                if(newMap.get(leftNum) == 0){
                    k++;
                }

                left++;

            }

            count += right  - left + 1;

        }

        return count;
    }

}
