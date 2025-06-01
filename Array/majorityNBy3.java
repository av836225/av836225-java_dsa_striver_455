package Array;

import java.util.ArrayList;
import java.util.List;

public class majorityNBy3 {
    
    public static void main(String[] args) {
        int[] nums = {1,2};
        System.out.println(majorityElement(nums));
    }

    public static List<Integer> majorityElement(int[] nums){
      List<Integer> list = new ArrayList<>();
        int count1 = 0, count2 = 0;
        int elem1 = 0, elem2 = 0;

        for (int num : nums) {
            if (count1 == 0) {
                elem1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                elem2 = num;
                count2 = 1;
            } else if (elem1 == num) {
                count1++;
            } else if (elem2 == num) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == elem1) count1++;
            else if (num == elem2) count2++;
        }

        if (count1 > nums.length / 3) list.add(elem1);
        if (count2 > nums.length / 3) list.add(elem2);

        return list;

        
    }
}
