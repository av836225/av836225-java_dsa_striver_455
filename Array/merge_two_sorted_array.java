package Array;

import java.util.Arrays;

public class merge_two_sorted_array {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3, n = 3;

        merge(nums1, m, nums2, n);

        System.out.println("Merged Array: " + Arrays.toString(nums1));
    }


    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // Copy nums2 into nums1 starting from index m
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        int totalLength = m + n;
        int gap = nextGap(totalLength);

        while (gap > 0) {
            int i = 0;
            int j = gap;

            while (j < totalLength) {
                if (nums1[i] > nums1[j]) {
                    
                    int temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;
                }
                i++;
                j++;
            }

            gap = nextGap(gap);
        }
    }

     public static int nextGap(int gap) {
        if (gap <= 1) return 0;
        return (gap / 2) + (gap % 2);
    }

  
}
