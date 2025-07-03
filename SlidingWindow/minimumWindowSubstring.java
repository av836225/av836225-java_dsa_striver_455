package SlidingWindow;

import java.util.HashMap;

public class minimumWindowSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println("Minimum window: " + minWindow(s, t));  // Output: "BANC"

        System.out.println("Minimum window: " + minWindow("a", "aa"));  // Output: ""
    }


    public static String minWindow(String s, String t){
        if(s == null || t == null || s.length() < t.length()) return "";

        int right  = 0;
        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        int Matched = 0;
        
        HashMap<Character, Integer> required = new HashMap<>();
        
        for (char c : t.toCharArray()) {
            required.put(c, required.getOrDefault(c, 0) + 1);
        }

        HashMap<Character, Integer> windowCounts = new HashMap<>();

        while(right < s.length()){

            char rightChar = s.charAt(right);
            windowCounts.put(rightChar, windowCounts.getOrDefault(rightChar, 0) + 1);

            if(required.containsKey(rightChar) && windowCounts.get(rightChar).intValue() == required.get(rightChar).intValue() ){
                Matched++;
            }

            while (Matched == required.size()) {
                
                if(right  - left  + 1 < minLen){
                    minLen = right  - left  + 1;
                    start = left;

                }

                char leftChar = s.charAt(left);
                windowCounts.put(leftChar, windowCounts.get(leftChar) - 1);

                if(required.containsKey(leftChar) && windowCounts.get(leftChar).intValue() < required.get(leftChar).intValue()){
                    Matched--;
                }

                left++;

            }

            right++;

        }



        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);

    }

}
