package Recursion;

public class print_n_number {
    public static void main(String[] args) {
        printAllNumber(10);

    }

    public static void printAllNumber(int n) {

        if (n > 0) {
            printAllNumber(n - 1);   
            System.out.println(n+ " ");
        }

    }

}
