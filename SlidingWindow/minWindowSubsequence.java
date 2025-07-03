package SlidingWindow;

public class minWindowSubsequence {
    public static void main(String[] args) {
        String S1 = "abcdebdde", T1 = "bde";
        System.out.println("Output: " + minWindow(S1, T1)); // Output: "bcde"

        String S2 = "fgrqsqsnodwmxzkzxwqegkndaa", T2 = "fnok";
        System.out.println("Output: " + minWindow(S2, T2)); //
    }

     public static String minWindow(String S, String T) {
        int sLen = S.length(), tLen = T.length();
        int minLen = Integer.MAX_VALUE;
        String result = "";

        for (int i = 0; i < sLen; i++) {
            if (S.charAt(i) == T.charAt(0)) {
                int sIndex = i;
                int tIndex = 0;

                // Move forward to match all of T
                while (sIndex < sLen && tIndex < tLen) {
                    if (S.charAt(sIndex) == T.charAt(tIndex)) {
                        tIndex++;
                    }
                    sIndex++;
                }

                // If matched entire T
                if (tIndex == tLen) {
                    int end = sIndex;
                    sIndex--; tIndex--;

                    // Move backward to minimize window
                    while (tIndex >= 0) {
                        if (S.charAt(sIndex) == T.charAt(tIndex)) {
                            tIndex--;
                        }
                        sIndex--;
                    }

                    sIndex++; // Move to start of window
                    if (end - sIndex < minLen) {
                        minLen = end - sIndex;
                        result = S.substring(sIndex, end);
                    }
                }
            }
        }

        return result;
    }
}
