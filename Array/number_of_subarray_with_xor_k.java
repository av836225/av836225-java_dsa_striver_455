package Array;

import java.util.HashMap;

public class number_of_subarray_with_xor_k {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4};
        int k = 6;
        System.out.println("Count of subarrays with XOR = " + k + " is: " + countSubarraysWithXorK(arr, k));
    }

    public static int countSubarraysWithXorK(int[] arr, int k){
        int count = 0;
        int xor = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num: arr){
            xor ^= num;

            if(xor == k){
                count++;
            }

            int required = xor ^ k;

            if(map.containsKey(required)){
                count += map.get(required);
            }

           map.put(xor, map.getOrDefault(xor, 0) + 1);


        }

        return count;
        

    }
}
