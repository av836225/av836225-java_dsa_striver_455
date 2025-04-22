package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class hashing_find_frequience {
   public static void main(String[] args) {
    int[] arr = {2, 3, 2, 3, 5};

    System.out.println(frequencyCount(arr));
    
   }

    public static List<Integer> frequencyCount(int[] arr) {
        
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= max; i++) {
            list.add(0);
        }

        for (int num : arr) {
            list.set(num, list.get(num) + 1);
        }

        // Step 4: Create the result list **starting from index 1**
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= max; i++) { // Start from 1
            result.add(list.get(i));
        }

        return result; // ✅ Returns frequencies from index 1 onward


    }
   
   
}
