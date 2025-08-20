public class LongestConsecutiveLength {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 7, 9, 2, 3, 4, 5, 6};
        int result = findMaxConsecutiveLength(nums);
        System.out.println("Max length of consecutive numbers: " + result);
    }

    public static int findMaxConsecutiveLength(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                currentLength++;
            } else {
                currentLength = 1; // reset if not consecutive
            }
            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }
}
