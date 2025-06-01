package Array;

import java.util.HashMap;

public class maximum_subarray_with_zero {
    
    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};

        int result = maxLen(arr);
        System.out.println("Length of largest subarray with 0 sum: " + result);
    }

    public static int maxLen(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxLength = 0;
        int sum = 0;

        for(int i = 0;i< arr.length; i++){
            sum += arr[i];
            

            if(sum == 0){
                maxLength = i + 1;

            }

            if(map.containsKey(sum)){

                maxLength = Math.max(maxLength, i - map.get(sum));
            
            }else{
                map.put(sum, i); 

            }

        }

        return maxLength;

    }

}
