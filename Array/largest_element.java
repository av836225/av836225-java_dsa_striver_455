package Array;

public class largest_element {

    public static void main(String[] args) {
        int arr[] = new int[] {1,3,4,6,9,10};
        int maxElement = arr[0];
        for(int i = 0; i < arr.length; i++){
            maxElement = Math.max(maxElement,arr[i]);
        }
        System.out.println("Largest element" + maxElement);
    }
    
}
