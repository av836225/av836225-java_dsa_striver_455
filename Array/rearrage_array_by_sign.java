package Array;

public class rearrage_array_by_sign {
    public static void main(String[] args) {
        int[] nums = {3, 1, -2, -5, 2, -4};
        int[] result = rearrangeArray(nums);
        
        for (int num : result){
            System.out.print(num + " ");
        }
    }

    public static int[] rearrangeArray(int[] array){
        int posIndex = 0;
        int negaIndex =  1;
        int[] result = new int[array.length];

        for(int a: array){
            if(a >= 0){
             result[posIndex] = a;
             posIndex += 2;   
            }else{
                result[negaIndex] = a;
                negaIndex += 2;
            }
        }

        return result;

    }

}
