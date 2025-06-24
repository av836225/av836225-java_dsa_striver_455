package Array;

import java.util.HashSet;

public class longest_consecutive_sequence {
   public static void main(String[] args) {
  
    int[] nums = {100, 4, 200, 1, 3, 2};
    System.out.println("Longest Consecutive Sequence Length: " + longestConsecutive(nums));
   
    } 

    public static int longestConsecutive(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        int longestStreak = 0;

        //make array unique elements
        for(int num: nums){
            set.add(num);
        }

        for(int num: set){

            if(!set.contains(num - 1)){
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                    
                }

                longestStreak = Math.max(currentStreak, longestStreak);

            }

        }



        return longestStreak;

    } 


}

// time com