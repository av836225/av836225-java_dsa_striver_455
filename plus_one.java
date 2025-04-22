public class plus_one {
    public static void main(String[] args) {
        int[] digits = {9,9,9};
        int[] result = plusOne(digits);
        for(int number: result){
            System.out.println("number"+number);
        }
    }

    public static int[] plusOne(int[] digits) {
        
        for(int i = digits.length - 1; i >= 0; i-- ){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }


        int[] result  = new int[digits.length + 1];
        result[0] = 1;
        return result;

       
      

    }
}
