package BinarySearch;

public class peakElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 10 , 5, 8};
        int peakIndex = findPeakElement(nums);
        System.out.println("Peak element is at index: " + peakIndex + ", Value: " + nums[peakIndex]);
    }


    public static int findPeakElement(int[] nums){
        int n = nums.length;
        int low  = 0;
        int high = n - 1;

        while(low < high){

            int mid = (low + high) /2;

            if(nums[mid] > nums[mid + 1]){

                high = mid;
            }else{
                low = mid  + 1;
               
            }
        }


        return low;
    }

}
