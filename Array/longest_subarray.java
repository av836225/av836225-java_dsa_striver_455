package Array;

public class longest_subarray {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,1,1,1,1,3,3};
        int sum = 3;
        System.out.println(longestSubarray(nums1,sum));  
    }

    public static int longestSubarray(int[] nums, int k){

        int left = 0,right = 0;
        int maxLength = 0;
        int n = nums.length;
        long sumofArray = nums[0];

        while(right < n){

            while(left <= right && sumofArray > k){
                sumofArray -= nums[left];
                left++;
            }

            if(sumofArray == k){
                maxLength = Math.max(maxLength, right - left + 1);
            }


            right++;
            if(right < n) {
                sumofArray += nums[right];
            }

        }

        return maxLength; 
    }

}

