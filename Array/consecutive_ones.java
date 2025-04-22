package Array;

public class consecutive_ones {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(maxConsecutiveOnes(nums));   
    }

    public static int maxConsecutiveOnes(int[] nums){
        int maxConsecutive = 0;
        int count = 0; 

        for(int i = 0; i < nums.length; i++){

            if(nums[i] == 1){
                count++;
                
                if(count > maxConsecutive){
                    maxConsecutive = count;
                } 

            } else{
                count = 0;
            }

        }

        return maxConsecutive;

    }
}
