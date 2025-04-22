// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class RemoveDuplicatesClass {
    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int length = removeDuplicates(nums);
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }

        
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; 

        int uniqueIndex = 0; 

        for (int i = 1; i < nums.length; i++) {   // i=1 //i=2 //i=3 //i=4 //i=5 //i=6
          
            if (nums[i] != nums[uniqueIndex]) { //1!=1 //2!=1 //2!=2 //3!=2 //4!=3 //4!=4 //5!=4
                uniqueIndex++;//1 //2  // 3 //4
                nums[uniqueIndex] = nums[i]; //numsuni[1,2,3,4,5] 
            }
        }
        return uniqueIndex + 1; 
    }
}