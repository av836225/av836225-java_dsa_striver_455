package BinarySearch;

public class lower_bound {
    public static void main(String[] args) {
        
        int[] nums = {1, 2, 4, 4, 4, 5, 6, 8};
        int target = 4;
        int result = lowerBound(nums, target);
        System.out.println("Lower bound index: " + result);
    }


    public static int lowerBound(int[] nums, int target){
    
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

}
