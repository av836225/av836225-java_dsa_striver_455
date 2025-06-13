package BinarySearch;

public class searchInRotatedArray {
 
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int result = search(nums, target);
        System.out.println("Index of target " + target + ": " + result);
    }

    public static int search(int[] nums, int target){
        int n = nums.length;
        int low = 0, high = n-1;

        while(low <= high){
            int mid = ( low + high) /2;

            if(nums[mid] == target) return mid;

            // If the array conatins repeated elements
            if(nums[low] == nums[mid] && nums[mid] == nums[high]){
                low++;
                high--;
                continue;
            }

            if(nums[low] <= nums[mid]){
                if(nums[low] <= target && target< nums[mid]){

                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }

            else{
                if(nums[mid] < target && target <= nums[high]){
                    low = mid  + 1;
                }else{
                    high =  mid - 1;

                }

            }

        }

        
        return -1;
    }
}
