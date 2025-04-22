package Array;

import java.util.ArrayList;
import java.util.List;

public class intersection_two_array {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        int[] intersec = intersect(nums1,nums2);

        for (int num : intersec) {
            System.out.print(num + " ");
        }
    }

    public static int[] intersect(int[] nums1, int[] nums2) {

        List<Integer> list = new ArrayList<>();

        int i = 0;
        int j = 0;

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                
                if (list.isEmpty() || list.get(list.size() - 1) != nums1[i]) {
                    list.add(nums1[i]);
                
                }
                i++;
                j++;

            }else if(nums1[i] < nums2[j]){
                i++;
            }else{
                j++;
            }

        }

        int[] intersection = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            intersection[k] = list.get(k);
        }

        return  intersection;


    }

}
