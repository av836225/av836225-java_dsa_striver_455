package Recursion;

public class reverse_array {

    public static void main(String[] args) {
    
        int[] array = new int[] {5,4,3,2,1};

        reverse_array(array,0);

        for (int i=0; i<array.length; i++) {
            System.out.print(array[i]);
        }

    }

    public static void reverse_array(int[] array,int i){
        int n = array.length;

        if(i >= n/2) return;

        int temp = array[i]; 
        array[i] = array[n- i -1];
        array[n- i -1] = temp;
        
        reverse_array(array, i + 1);

    }


    
}