package Array;

public class linear_search {
    public static void main(String[] args) {
        int[] nums1 = {2, 3, 4, 5, 3};
        int target = 3;
        System.out.println(linearSearch(nums1,target));  
    }

    public static int linearSearch(int nums[], int target) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){                
                return i;
            }else{
                return - 1;
            }
        }

        return 0;
    }

}
