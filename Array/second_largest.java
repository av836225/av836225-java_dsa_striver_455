package Array;

public class second_largest {
    
    public static void main(String[] args) {
        int arr[] = new int[] {8, 8, 7, 6, 5};

        int largest = arr[0];
        int secondLargest = -1;
        for (int i = 1; i < arr.length; i++) {
            // largest = 1, 
            if(arr[i] > largest){
                secondLargest = largest; 
                largest = arr[i]; 
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Second Largest"+ secondLargest);


    }
}
