package BinarySearch;

public class kokoEatingBanana {
    public static void main(String[] args) {
        int[] piles = {805306368,805306368,805306368};
        int h = 1000000000; // hours

        int result = minEatingSpeed(piles, h);
        System.out.println("Minimum eating speed: " + result);
    }

    public static int minEatingSpeed(int[] piles, int h){

        int low = 0;
        int high = getMAxPiles(piles);
        int result = high;

        while (low <= high) {
            int mid  = (low + high)/2;

            if(canEatAll(piles, h, mid)){
                result = mid;
                high = mid  -1;

            }else{
                
                low = mid + 1;
                
            }
            
        }

        return result;
    }

    public static boolean canEatAll(int[] piles, int h, int k){
        int totalHours = 0;
        if (k == 0) return false;
        for(int pile : piles){
            totalHours += (pile + k -1)/k;
        }

        return totalHours <= h;

    }


    public static int getMAxPiles(int[] piles){
        int max = piles[0];
        for(int pile : piles){
             if (pile > max) max = pile;
        }

        return max;
    }
}
