public class armstrong_number {
    public static void main(String[] args) {
        int num = 152;
        int tempNum  = num;
        int sum  = 0;
        while (num !=0) {
            int lastDigit  = num % 10;
            sum += lastDigit * lastDigit * lastDigit;
            num /= 10; 
        }
        if(tempNum == sum){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not a Armstrong Number");
        }

    }
    
}
