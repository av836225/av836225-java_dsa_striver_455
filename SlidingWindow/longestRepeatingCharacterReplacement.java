package SlidingWindow;

public class longestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        System.out.println(characterReplacement(s, k));
    }

    public static int characterReplacement(String s, int k){
        int[] count = new int[26];
        int left = 0;
        int maxLength = 0;
        int result = 0;

        for(int right  = 0; right < s.length(); right++){

            count[s.charAt(right)  - 'A']++;
            maxLength = Math.max(maxLength, count[s.charAt(right)  - 'A']);

            while((right - left + 1) - maxLength > k){
                count[s.charAt(left)  - 'A']--;
                left++;
            }

            result = Math.max(result, right - left + 1);
        }
        

        return result;

    }
}
