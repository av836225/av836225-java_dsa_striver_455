package SlidingWindow;

import java.util.HashMap;

public class LongestSubstringKDistinct {
    public static void main(String[] args) {
        String s = "tvtgv";
        int k = 4;

        int result = lengthOfLongestSubstringKDistinct(s, k);
        System.out.println("Length of longest substring with " + k + " distinct characters: " + result);
    }

    public static int lengthOfLongestSubstringKDistinct(String s, int k){

        if(s == null || s.length() == 0 || k == 0) return -1;

        int right = 0 ;
        int left  = 0;
        int maxLength = 0;

        HashMap<Character, Integer> map = new HashMap<>();


        while (right < s.length()) {

            char rightChar = s.charAt(right);

            map.put(rightChar, map.getOrDefault(rightChar,0) + 1);
            right++;

            if(map.size() > k){
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) -1);

                if(map.get(leftChar) == 0){
                    map.remove(leftChar);
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left);
            
        }



        return maxLength;
    }
}
