public class find_lcm_hcf {
    public static void main(String[] args) {
               // code here
               int a = 12, b = 10; 
               int gcd = 0; 
               int originalA = a, originalB = b;
               
               while(a > 0 && b > 0){
                   if(a > b){
                       a = a % b;
                   }else{
                       b = b % a; 
                   }
               }
               
               if(a == 0){
                   gcd = b;
               }else{
                   gcd = a;
               }
               
               int lcm = Math.abs(originalA * originalB) / gcd;

               System.out.println("LCm "+lcm+" hcf "+gcd);
               
            //    return new int[]{lcm,gcd};
    }
}
