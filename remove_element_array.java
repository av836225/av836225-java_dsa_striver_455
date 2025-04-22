import java.util.Arrays;

public class remove_element_array {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        int length = removeElement(nums, val);
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    
    public static int removeElement(int[] nums, int val) {
       
        int index = 0;
        for(int number : nums){
            if(number != val){
                nums[index++] = number; 
            }
        }

        return index;
    }
}
