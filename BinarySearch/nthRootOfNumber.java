package BinarySearch;

public class nthRootOfNumber {
    public static void main(String[] args) {
        int A = 27;
        int N = 3;

        double root = nthRoot(A, N);
        System.out.printf("The %dth root of %d is %.6f\n", N, A, root);
    }


    public static double nthRoot(int A, int N){

        double low = 1;
        double high = A;

        while (low <= high) {
            double mid = (low + high) / 2;

            if (Math.pow(mid, N) == A) {
                return  mid;
            } else if (Math.pow(mid, N) < A) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }

        return -1;
    }
}
