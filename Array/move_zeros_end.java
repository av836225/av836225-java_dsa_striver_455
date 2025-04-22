package Array;

public class move_zeros_end {
    public static void main(String[] args) {
        int[] nums1 = {0,1,0,3,12};
        moveZeroes(nums1);
        for(int i = 0; i< nums1.length; i++){
            System.out.print(nums1[i]);
        }
    }

    public static void moveZeroes(int[] nums) {
        int j = -1;
        int n = nums.length;
        for(int i = 0 ; i < n; i++){
            if(nums[i] == 0){
                j = i;
                break;
            }
        }

        for(int i = j + 1 ; i < n; i++){
            if(nums[i] != 0){
                swap(nums,i,j);
                j++;
            }
        }

    }

    public static void swap(int[] nums,int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    
}
