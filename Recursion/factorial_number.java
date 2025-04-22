package Recursion;

import java.util.ArrayList;

public class factorial_number {

    public static void main(String[] args) {
        
        long n = 3;
        ArrayList<Long> list = factorialNumbers(n);
        System.out.println(list); 
         
    }

    static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> result = new ArrayList<>();
        generateFactorials(n, 1, 1, result); // Start recursion with 1! = 1
        return result;
    }


    static void generateFactorials(long n,long i,long fact,ArrayList<Long> result) {
     if(fact > n) return;

      result.add(fact);
      generateFactorials(n, i+1, fact * (i +1), result);


        
    }
    
}
