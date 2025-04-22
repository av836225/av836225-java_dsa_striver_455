class CountNumberClass {
    public static void main(String[] args) {
        int count = 0;
        int num = 20;
        int tempNum = num;
        while (num > 0){
            int lastDigit = num % 10; 
            if(lastDigit !=0 && tempNum % lastDigit == 0){
                count++;
            }
            num = num / 10;
            
        } 
        System.out.println("Count: " + count);
        

    }

}