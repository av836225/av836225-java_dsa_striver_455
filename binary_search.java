public class binary_search {
    public static void main(String[] args) {

        int[] nums = {1,3,5,6};
        int target = 5;
        int result = searchInsert(nums, target);

        System.out.println("result"+result);
        
    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int last = nums.length -1;
        
        while(start <= last){
            int mid = (int)  Math.floor((start + last) / 2);
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }else{
                last = mid -1;
            }

        }

        return -1;

    }
}
