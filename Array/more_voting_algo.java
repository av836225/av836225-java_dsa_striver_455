package Array;

public class more_voting_algo {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority Element: " + majorityElement(nums)); 
    }

    public static int majorityElement(int[] nums){

        int candidate = 0;
        int count = 0;

        for(int num : nums){
            if(count == 0){
                candidate = num;
                count = 1;
            }
            else if(num == candidate)   {
                count++;
            }else{
                count--;
            }

        }

        return candidate;

    }
}
