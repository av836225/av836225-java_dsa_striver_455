package BinarySearch;

public class numberOfTimesArrayRotated {
    public static void main(String[] args) {
        int[] nums = {15, 18, 2, 3, 6, 12};
        int rotationCount = findRotationCount(nums);
        System.out.println("Array has been rotated " + rotationCount + " times.");
    }

    public static int findRotationCount(int[] nums){
        int n = nums.length;
        int low = 0;
        int high = n -1;
        int ans = Integer.MAX_VALUE;

        while(low <= high){
            int mid = (low + high)/2;
            
            if(nums[low] <= nums[high]){
                ans = Math.min(ans,nums[low]);
                break;
            }
            else if(nums[low] <= nums[mid]){
                 ans = Math.min(ans, nums[low]);
                 low  = mid + 1;

            } else{
                ans = Math.min(ans, nums[mid]);
                high = mid - 1;

            }

        }


        return  ans;
    }
}
