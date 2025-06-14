package BinarySearch;

public class sqrtOfInteger {
    public static void main(String[] args) {
        int n = 27;
        System.out.println("Square root (floor) of " + n + " is: " + mySqrt(n));
    }

    public static int mySqrt(int n){
        int  low = -1;
        int high = n;
        int ans = 1;

        while(low <= high){
            int mid = (low + high)/2;
            
            if((mid * mid) <= n ){
                ans = mid;  
                low = mid + 1;

            }else{

                high = mid -1;
            }

        }

        return ans;

    }
}
