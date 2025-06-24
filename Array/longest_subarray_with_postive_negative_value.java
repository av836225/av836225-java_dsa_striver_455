package Array;

import java.util.HashMap;
import java.util.Map;

public class longest_subarray_with_postive_negative_value {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,1,1,1,1,3,3};
        int sum = 3;
        System.out.println(longestSubarrayWithPositiveAndNegative(nums1,sum));  
    }

    public static int longestSubarrayWithPositiveAndNegative(int [] nums,int k){

        int maxLength = 0;
        int arraySum = 0;


        Map<Integer,Integer> map = new HashMap<>();



        for(int i = 0; i < nums.length; i++){

            arraySum += nums[i];

            if(arraySum == k){
                maxLength = i +1; 
            }
            
            if(map.containsKey(arraySum - k)){
                int previousIndex = map.get(arraySum - k);
                maxLength = Math.max(maxLength , i - previousIndex); 
            }

            if(!map.containsKey(arraySum)){
                map.put(arraySum, i);
            }
            
        }

      



        return maxLength;
    }
}
