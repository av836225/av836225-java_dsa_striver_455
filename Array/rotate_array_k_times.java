package Array;

public class rotate_array_k_times {
 public static void main(String[] args) {
    int[] nums1 = {1,2,3,4,5,6,7};
    rotate(nums1 , 3);
    for(int i = 0; i< nums1.length; i++){
        System.out.print(nums1[i]);
    }

 }

 public static void rotate(int[] nums, int k) {
        int n = nums.length;
         k =  k % n;

         reverse(nums, 0, n - k - 1);
         reverse(nums, n - k, n - 1);
         reverse(nums, 0, n - 1);




 }

 public static void reverse(int[] arr,int start, int end){
    while(start < end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--; 
    }
 }

}
