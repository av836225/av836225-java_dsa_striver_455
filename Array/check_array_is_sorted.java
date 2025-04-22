package Array;

public class check_array_is_sorted {
    public static void main(String[] args) {
        int[] nums1 = {3, 4, 5, 1, 2};
        System.out.println(check(nums1));
    }


    public static boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) { // 3 > 
                count++;
            }
        }

        return count <= 1;
    }
}
