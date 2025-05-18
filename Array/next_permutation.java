package Array;

import java.util.Arrays;

public class next_permutation {
       public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        nextPermutation(nums);
         System.out.println(Arrays.toString(nums)); 
    }

    public static void nextPermutation(int[] nums){
        int n = nums.length;
        int index= -1;

        // for finding the break point
        for(int i = n - 2; i >= 0; i--){
            if(nums[i] < nums[i + 1]){
                index = i;
                break;
            }
        }

        //if not found break point
        if(index == -1){
            reverse(nums,0, n-1);
            return;
        }

        //find the next greater elemnt and swap
        for(int i = n - 1; i > index; i--){
            if(nums[i] > nums[index]){
                swap(nums, i, index);
                break;
            }
        }

        reverse(nums, index + 1, n -1);

    }

    public static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

    }

    public static void reverse(int[] arr, int start, int end){
        while (start < end) {
            swap(arr,start++,end--);
        }
    }
}
