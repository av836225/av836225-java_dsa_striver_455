public class palinDrome {
    
       public static void main(String[] args) {
        int n  = 121;
        int tempNumber = n; 
        int reverse = 0;
        while(n != 0){
            int lastDigit = n % 10; // 4 , 3, 2, 1
            n /= 10;
            reverse = (reverse * 10) + lastDigit; // 4, 43, 
        }

        if(tempNumber == reverse){
            System.out.println("it is palindrome");
        }else{
            System.out.println("it is not a palindrome");
        }
      

       }
}