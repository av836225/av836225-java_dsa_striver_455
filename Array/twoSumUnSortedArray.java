package Array;

import java.util.HashMap;

public class twoSumUnSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {2,7,11,15};
        int target = 9;
        int[] twoSumArray = twoSum(nums1, target);
        for (int number : twoSumArray) {
             System.out.println("the number are"+number);  
        }
    }

    public static int[] twoSum(int[] nums1, int target){

        HashMap<Integer,Integer> hash = new HashMap<>();
        int index = 0; 

        for (int number : nums1) {
            int complement = target - number;

            if(hash.containsKey(complement)){
                return new int[] {hash.get(complement), index};
            }
            
            hash.put(number, index);
            index++;
        }

        return new int[]{};
    }
}
