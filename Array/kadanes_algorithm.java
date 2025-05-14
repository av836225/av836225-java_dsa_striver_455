package Array;

public class kadanes_algorithm {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = maxSubArray(nums);
        System.out.println("Maximum Subarray Sum is: " + maxSum);
    }

    public static int maxSubArray(int[] nums){
        int sum  = 0;
        int max = Integer.MIN_VALUE;
        int start = 0;
        int ansStart = -1;
        int ansEnd = -1;
        for(int i = 0; i< nums.length;i++){

        if(sum == 0){
            start = i;
        }   

        sum += nums[i];

        if(sum > max){
            max = sum;
            ansStart = start;
            ansEnd = i;
         }
   
        if(sum < 0){
            sum = 0;
         }


        }

        System.out.println("start"+ ansStart +"ans end"+ ansEnd);

        return max;

    }
}
