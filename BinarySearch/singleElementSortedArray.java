package BinarySearch;

public class singleElementSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 4, 5};
        int singleElement = findSingleElement(nums);
        System.out.println("The single element in the sorted array is: " + singleElement);
    }

    public static int findSingleElement(int[] nums){

        int n = nums.length;
        int low = 0;
        int high  = n - 2;


        while(low <= high){
            int mid  = (low + high)/2;

            if(nums[mid] == nums[mid ^ 1]){
                low = mid + 1; 
            }else{
                high = mid -1;
            }


        }

        return nums[low];
    }

}
