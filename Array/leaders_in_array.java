package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class leaders_in_array {
    public static void main(String[] args) {
         int[] arr = {16, 17, 4, 3, 5, 2};
        List<Integer> result = findLeaders(arr);
        System.out.println("Leaders in the array: " + result);
    }

    public static List<Integer> findLeaders(int[] arr){
        List<Integer> list = new ArrayList();
        int n  = arr.length;
        int maxFromRight = arr[n-1]; // most right alway will comes in leader

        list.add(maxFromRight);


        for(int i = n-2;i >=0;i--){
            if(arr[i] > maxFromRight){
                maxFromRight = arr[i];
                list.add(maxFromRight);
            }
        }

        Collections.reverse(list);
        return list;

    }
}