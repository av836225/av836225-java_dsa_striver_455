package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class three_sum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums){
    
        List<List<Integer>> list =  new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;


        for(int i = 0;i< n -2; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            
            int j =  i + 1;
            int k = n - 1;
            int target = 0; 

            while( j < k){
                int sum  = nums[j] + nums[k] + nums[i];
                if(sum == target) {
                    list.add(Arrays.asList(nums[i],nums[j],nums[k]));

                    while(j < k && nums[j] == nums[j + 1]) j++;
                    while(j < k && nums[k] == nums[k - 1]) k--;

                    j++;
                    k--;
                }else if(sum < target){
                    j++;
                }else{
                    k--;
                }

            }

        }


        return list;

    }

}
