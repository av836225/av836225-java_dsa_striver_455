package Array;

public class remove_dublicate_from_array {
    public static void main(String[] args) {
        int[] nums1 = {1,1,2,2,3,3,4,4}; 

        int newLength = removeDuplicate(nums1); // Call method

        System.out.println("Unique elements: "+
        newLength);
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums1[i] + " ");
        }
    }

    public static int removeDuplicate(int[] nums){

      int i = 0;

      for(int j = 1; j < nums.length; j++){
        if(nums[j] != nums[i]){
          nums[i+1] = nums[j];  
          i++;
        }
      }

      return i + 1;  
        
    }


}
