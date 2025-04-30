package Array;

public class twoSumSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {2, 5, 6, 8, 11};
        int target = 14;
        int[] twoSumArray = twoSum(nums1, target);
        for (int number : twoSumArray) {
             System.out.println("the number are"+number);  
        }
    }

    public static int[] twoSum(int[] nums, int target){

        int left = 0;
        int right = nums.length - 1;
        int[] twoSumArray = new int[2];

        while(left <  right){
            int sum = nums[left] + nums[right];

            
            if(sum == target){
                twoSumArray[0] = nums[left];
                twoSumArray[1] = nums[right];
                break;
                // return the sum array
                
            }else if(sum < target){
                left++;  
            }else{
                right--;
            }
            
        }


        return twoSumArray;
    }


}
