package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class totalFruits {
    public static void main(String[] args) {
        int[] fruits = {1, 2, 1, 2, 3};
        System.out.println("Maximum fruits: " + totalFruit(fruits));
    }


    public static int totalFruit(int[]  nums){
        int left = 0;
        int maxLen = 0;
        Map<Integer,Integer> map = new HashMap<>();

        for(int right  = 0; right < nums.length; right++){
            int fruit = nums[right];

            map.put(fruit, map.getOrDefault(map.get(fruit), 0) + 1);

            while (map.size()  > 2) {
                int leftFruit = nums[left];
                map.put(leftFruit, map.getOrDefault(map.get(leftFruit), 0) - 1);
                if(map.get(leftFruit) == 0){
                    map.remove(leftFruit);
                }

                left++;
                
            }

            maxLen = Math.max(maxLen, right - left + 1);

        }
        


        return maxLen;
    }

}
