package Array;

public class dutchFlag {
    public static void main(String args[]){
        int[] arr = {2, 0, 2, 1, 1, 0, 1, 0, 2};
        sortColors(arr);

        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void sortColors(int[] arr){
        int low = 0, mid = 0;
        int high = arr.length - 1;
        
        while(mid <= high){
            if(arr[mid] == 0){
                swapArray(arr,low,mid);
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                swapArray(arr, mid, high);
                high--;
            }
        }

    }

    public static void swapArray(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
