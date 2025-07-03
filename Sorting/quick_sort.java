public class quick_sort {
    public static void main(String[] args) {
        int[] arr = {9, 3, 7, 5, 6, 4, 8, 2};
        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    public static void quickSort(int[] arr,int low,int high){

        if(low < high){
            int pIndex = hoarePartition(arr, low, high);
            quickSort(arr, low, pIndex);     
            quickSort(arr, pIndex + 1, high);
        }
    }

    public static int hoarePartition(int[] arr, int low, int high) {

        int i = low - 1;
        int j = high + 1;
        int pivot = arr[low];

        while(true){
            do{
                i++;
            }while(arr[i] < pivot);
            do{
                j--;
            }while(arr[j] > pivot);

            if(i >= j){
                return j;
            }

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }

    }


}
