package BinarySearch;

public class minimumDayToMakeBoquet {
    public static void main(String[] args) {
        int[] bloomDay = {1, 10, 3, 10, 2};
        int m = 3;
        int k = 1;
        System.out.println(minDays(bloomDay, m, k)); 
    }

    public static int  minDays(int[] bloomDay, int m , int k){
        int result = -1;
        int low = 1;
        int high = 0;
        long total = (long) m * k;
        int n = bloomDay.length; 

        if(total > n) return -1;

        for(int day : bloomDay){
            high = Math.max(day, high);
        }

        while(low <= high){
            int mid = (high + low) /2;
            
            if(canMake(bloomDay,m,k,mid)){
             result = mid;
             high = mid - 1;

            }else{
                low = mid + 1;
            }


        }


        return result;

    }

    public static boolean canMake(int[] bloomDay, int m, int k, int day){
        int flowers = 0;
        int boquet = 0;

        for(int bloom: bloomDay){

            if(bloom <= day){
                flowers++;

                if(flowers ==  k){
                    boquet++;
                    flowers = 0;
                }


            }else{
                flowers = 0;
            }
        }

        return boquet >= m;
    }

}
