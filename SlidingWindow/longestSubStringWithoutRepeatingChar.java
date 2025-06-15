package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class longestSubStringWithoutRepeatingChar {
    public static void main(String[] args) {
        String s = "pwwkew";
        String result = longestUniqueSubstring(s);
        System.out.println("Longest substring without repeating characters: " + result);
    }

    public static String longestUniqueSubstring(String s){
        int n = s.length(); 
        int left = 0;
        int right  = 0;
        int startIdex = 0;
        int maxLeng = 0;
        Set<Character> set = new HashSet<>();

        while(right < n){
            char CurrentChar = s.charAt(right);

            while(set.contains(CurrentChar)){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(CurrentChar);

            if(right  - left  + 1 > maxLeng){
                maxLeng = right  - left  + 1;
                startIdex = left;

            }


            right++;


        }

        return s.substring(startIdex, startIdex + maxLeng);


    }

}
