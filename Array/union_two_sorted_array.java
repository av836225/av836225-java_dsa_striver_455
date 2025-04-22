package Array;

import java.util.HashSet;
import java.util.Set;

public class union_two_sorted_array {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 7};

        int[] union = unionArray(nums1,nums2);

        for (int num : union) {
            System.out.print(num + " ");
        }
    }

    public static int[] unionArray(int[] nums1, int[] nums2) {
        Set<Integer> list = new HashSet<>();

        for(int set1:nums1){
            list.add(set1);
        }

        for(int set2:nums2){
            list.add(set2);
        }

        int[] result = new int[list.size()];
        int i = 0;
        for (int num : list) {
            result[i++] = num;
        }


        return result;
    }
    
}
