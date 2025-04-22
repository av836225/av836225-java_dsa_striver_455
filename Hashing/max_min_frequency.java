package Hashing;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class max_min_frequency {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 2, 1, 1, 4, 2, 2, 2, 3};
        findHighLowFreqElements(arr);
    }

    public static void findHighLowFreqElements(int[] arr){
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int i : arr) {
            freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
        }

        int highest = arr[0], lowest = arr[0];
        int maxFreq = 0, minFreq = Integer.MAX_VALUE;
        
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();

            if(freq > maxFreq){
                maxFreq = freq;
                highest = num;
            }
            if(freq <  minFreq){
                minFreq = freq;
                lowest = num;
            }



        }

        System.out.println("Element with highest frequency: " + highest);
        System.out.println("Element with lowest frequency: " + lowest);

    }
}
