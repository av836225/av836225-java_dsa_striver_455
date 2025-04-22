public class selection_sort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr);
        System.out.println("Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

     public static void  selectionSort(int[] arr){
        int arrayLength = arr.length;

        for(int i= 0; i < arrayLength; i++){
            int minIndex = i;

            for(int j= i+ 1; j < arrayLength; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            //swap
            if(minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }

        }
    }
}
