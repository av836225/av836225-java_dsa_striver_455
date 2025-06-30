package SlidingWindow;

import java.util.HashMap;

public class longestUniqueSubstring {
    public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println("Longest substring length: " + lengthOfLongestSubstring(input));
    }

    public static int lengthOfLongestSubstring(String input){
        HashMap<Character,Integer> map = new HashMap<>();
        int left = 0;
        int maxLength = 0;

        for(int right  = 0; right < input.length(); right++){

            char currentChar = input.charAt(right);

            if(map.containsKey(currentChar)){
                left = Math.max(map.get(currentChar) + 1 ,left);
            }

            map.put(currentChar, right);

            maxLength = Math.max(maxLength, right - left + 1);
        
        }

        return maxLength;
    }


}


// Time: O(n)

// Space: O(1) (at most 128 characters in ASCII map)