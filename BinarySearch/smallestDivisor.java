package BinarySearch;

public class smallestDivisor {

    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 9};
        int threshold = 6;

        int result = smallestDivisor(nums, threshold);
        System.out.println("Smallest Divisor: " + result);
    }

    public static int smallestDivisor(int[] nums,int threshold){

        int low = 1;
        int high  = getMaxNum(nums);
        int result = -1; 

        while(low <= high){
            int mid = (low + high) /2;

            if(computeSum(nums,mid) <= threshold){

                result = mid;
                high = mid -1;

            }else{
                low = mid + 1;
            }

        }


        return result;

    }

    public static int computeSum(int[] nums,int divisor){
        int sum = 0;

        for(int n : nums){
             sum += (n + divisor - 1) / divisor; 
        }

        return sum;

    }

    public static int getMaxNum(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
        }
        return max;
    }
    
}
