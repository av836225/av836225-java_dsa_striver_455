package Array;
import java.util.HashMap;

public class sub_array_sum_equal_k {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, -2, 5};
        int k = 5;
        System.out.println("Count of subarrays with sum = " + k + " is: " + subarraySum(nums, k));
    }

    public static int subarraySum(int[] nums,int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int sum = 0;


        map.put(0, 1);

        for(int num : nums){
            sum += num;

            if(map.containsKey(sum - k)){
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum ,0) + 1);

        }
        


        return count;
    }
}
