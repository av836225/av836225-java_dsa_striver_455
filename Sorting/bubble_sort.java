public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        bubbleSort(arr);
        System.out.println("Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void bubbleSort(int [] arr){
        int n = arr.length;

        for(int i = n-1; i >= 1; i-- ){
            for(int j=0; j< n-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }           
        }
    
    }


}
