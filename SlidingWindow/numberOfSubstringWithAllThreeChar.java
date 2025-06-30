package SlidingWindow;

public class numberOfSubstringWithAllThreeChar {
    public static void main(String[] args) {
        String s = "abcabc";
        System.out.println(numberOfSubstrings(s)); 
    }

    public static int numberOfSubstrings(String s){
        int[] count  = new int[3];
        int left = 0;
        int result = 0;

        for(int right = 0; right < s.length(); right++){

            count[s.charAt(right)  - 'a']++;

            while(count[0] > 0 && count[1] > 0 && count[2] > 0){
                count[s.charAt(left)  - 'a']--;
                left++;

            }

            result += left;

        }


        return result;

    }

}
