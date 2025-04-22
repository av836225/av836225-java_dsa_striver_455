package Recursion;

public class fibonacci {

    public static void main(String[] args) {
        int f = fib(10);
        System.out.println("Answer"+f);
    }

    public static int fib(int n) {
        if (n <= 0) return 0;  
        if (n == 1) return 1;  
        return fib(n - 1) + fib(n - 2);  
    }

    
}
