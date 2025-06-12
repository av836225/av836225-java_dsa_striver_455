package BinarySearch;

public class firstAndLastOccurence {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 4, 4, 4, 5, 6, 8 };
        int target = 1;

        int first = firstOccurrence(nums, target);
        int last = lastOccurrence(nums, target) - 1;

        if(first == nums.length || nums[first] != target) first = -1;

        System.out.println("First occurrence index: " + first);
        System.out.println("Last occurrence index: " + last);
    }

    public static int firstOccurrence(int[] nums, int target) {
      int n = nums.length;
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high){
            int mid = (low + high)/2;

            if(nums[mid] >= target){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        return ans;
    }

    public static int lastOccurrence(int[] nums, int target) {
 int n = nums.length;
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high)/2;

            if(nums[mid] > target){
                ans = mid;
                high  = mid - 1;

            }else{
                low = mid + 1;

            }

        }

        return ans;
    }
}
