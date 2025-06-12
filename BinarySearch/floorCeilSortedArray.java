package BinarySearch;

public class floorCeilSortedArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 8, 10, 10, 12, 19};
        int target = 7;
        int floor = findFloor(nums, target);
        int ceil = findCeil(nums, target);

        System.out.println("Floor index: " + floor);
        System.out.println("Ceil index: " + ceil);
    }
    public static int findFloor(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] <= target) {
                ans = mid; // Update floor index
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }

        return ans;
    }
    public static int findCeil(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] >= target) {
                ans = mid; // Update ceil index
                high = mid - 1; // Search in the left half
            } else {
                low = mid + 1; // Search in the right half
            }
        }

        return ans;
    }

}
