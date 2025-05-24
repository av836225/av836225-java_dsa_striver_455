package Array;

public class frequency_most_frequent {
        public static void main(String[] args) {
            int[] nums = {1, 2, 4};
            int k = 5;
            System.out.println("Max frequency: " + maxFrequency(nums, k));   
        }

        public static int maxFrequency(int[] nums, int k){

            int left = 0;
            int total = 0;
            int result = 0;

            for(int right = 0; right < nums.length; right++){
                total += nums[right];

                long cost = (long) nums[right] * (right  - left + 1) - total;

                while(cost > k){
                    total -= nums[left];
                    left++;

                    cost = (long) nums[right] * (right  - left + 1) - total;
                }
                result = Math.max(result, right  - left + 1);
                
            }

            return result;
        }
}
