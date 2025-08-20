public class RunLengthEncoding {
    public static void main(String[] args) {
        String input = "aaabbcddddee";
        String encoded = encode(input);
        String decoded = decode(encoded);

        System.out.println("Original: " + input);
        System.out.println("Encoded : " + encoded);
        System.out.println("Decoded : " + decoded);
    }


        // Encode function
    public static String encode(String input) {
        if (input == null || input.isEmpty()) return "";

        StringBuilder encoded = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= input.length(); i++) {
            // if current char same as previous, increase count
            if (i < input.length() && input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                // append char and its count
                encoded.append(input.charAt(i - 1)).append(count);
                count = 1; // reset
            }
        }


        return encoded.toString();
    }

     // Decode function
    public static String decode(String encoded) {
        if (encoded == null || encoded.isEmpty()) return "";

        StringBuilder decoded = new StringBuilder();

        for (int i = 0; i < encoded.length(); i++) {
            char ch = encoded.charAt(i);
            i++; // move to number
            StringBuilder num = new StringBuilder();

            // handle multi-digit counts
            while (i < encoded.length() && Character.isDigit(encoded.charAt(i))) {
                num.append(encoded.charAt(i));
                i++;
            }
            i--; // adjust because loop goes one step extra

            int count = Integer.parseInt(num.toString());

            for (int j = 0; j < count; j++) {
                decoded.append(ch);
            }
        }

        return decoded.toString();
    }

}
