public class reverse_number {
 
    public static void main(String[] args) {
        int num = 1534236469;
        int INT_MIN = Integer.MIN_VALUE; // -2^31
        int INT_MAX = Integer.MAX_VALUE;
        int reversed = 0;
        while(num !=0){
            int lastDigit = num % 10;
            num = num / 10;
            // if (reversed > INT_MAX / 10 || (reversed == INT_MAX / 10 && lastDigit > 7)) return 0;
            // if (reversed < INT_MIN / 10 || (reversed == INT_MIN / 10 && lastDigit < -8)) return 0;
            reversed = (reversed * 10) + lastDigit;
        }
        System.out.println("Reversed Number: " + reversed);
    }
}
