package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourSum {
    public static void main(String[] args) {
       
        int[] nums = {1000000000,1000000000,1000000000,1000000000};
        int target = -294967296;

        List<List<Integer>> res = fourSum(nums, target);
        System.out.println(res);
    }

    public static  List<List<Integer>> fourSum(int[] nums, int target){
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        int n = nums.length;

        for(int i = 0; i< n - 3; i++){
            if(i > 0 && nums[i] == nums[i -1]) continue;

            for(int j = i + 1; j < n -2; j++){
                if(j > i + 1 && nums[j] == nums[j -1]) continue;

                int k = j + 1;
                int l = n - 1;

                while(k < l){
                    long sum  = (long) nums[i] + nums[j] + nums[k] + nums[l];

                    if(sum == target){
                        list.add(Arrays.asList(nums[i], nums[j],nums[k],nums[l]));

                        while(k < l && nums[k] == nums[k+1]) k++;
                        while(k < l && nums[l] == nums[l-1]) l--;

                        k++;
                        l--;


                    }else if( sum < target){
                        k++;
                    }else{
                        l--;
                    }

                }

            }
        }



        return list;

    }
}
