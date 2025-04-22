package Array;

public class missing_number_array {
    public static void main(String[] args) {
        int[] nums1 = {3,0,1};
        System.out.println(missingNumber(nums1));   
    }

    public static int missingNumber(int [] nums){
      int n = nums.length;
      int totalSumOfNatural = n *(n + 1)/2;
      int totalSum = 0;
      for (int i : nums) {
        totalSum += i;
      }

      return totalSumOfNatural - totalSum;

    } 
}
