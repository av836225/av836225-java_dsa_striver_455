package Array;

import java.util.ArrayList;
import java.util.HashMap;

public class removeDuplicateinArray {
    public static void main(String[] args) {
        int[] nums1 = {5, 3, 8, 3, 1, 5, 2};
        System.out.println(removeDuplicate(nums1));    
    }

    public static ArrayList<Integer> removeDuplicate(int[] array){
        ArrayList<Integer>  list = new ArrayList<>(); 
        HashMap<Integer, Boolean> hashMap = new HashMap<>();

        for(int i = 0; i < array.length; i++){

            if(!list.contains(array[i])){
                hashMap.put(array[i], true);
                list.add(array[i]);
            }

        }

        return list;
    }

}
