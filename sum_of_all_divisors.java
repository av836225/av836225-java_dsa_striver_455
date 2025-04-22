public class sum_of_all_divisors {
    public static void main(String[] args) {

        int n = 4;
        int totalSum = 0;
        for(int i = 1; i <=n; i++ ){
             totalSum += caclculateDivisor(i);
        }

        System.out.println(""+totalSum);
        
    }

    public static int caclculateDivisor(int n){

        int sum = 0;
        for(int i = 1; i * i <= n; i++){
            if(n % i == 0){
              sum  = sum + i;
              if(n/i != i){
                  sum  = sum + i;
              } 

            }
        }

        return sum;
    }
}
