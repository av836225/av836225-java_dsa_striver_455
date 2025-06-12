package Array;

public class repeating_missing_number {

    public static void main(String[] args) {
        int[] arr = { 4, 3, 6, 2, 1, 1 };
        int n = arr.length;

        int[] result = findMissingAndRepeating(arr, n);
        System.out.println("Repeating Number: " + result[0]);
        System.out.println("Missing Number: " + result[1]);
    }

    public static int[] findMissingAndRepeating(int[] arr, int n) {

        long sumN = (long) n * (n + 1) / 2;
        long sumOfSqaureN = (long) n * (n + 1) * (2 * n + 1) / 6;
        long sumOfArray = 0;
        long sumOfSqaureOfArray = 0;

        for (int num : arr) {
            sumOfArray += num;
            sumOfSqaureOfArray += (long) num * num;
        }

        long diffSum =   sumN - sumOfArray; //(x -y)
        long diffSqaureSum =  sumOfSqaureN - sumOfSqaureOfArray; //(x-y)(x+y)

        long sum = diffSqaureSum / diffSum; //x+y

        int missing = (int) (sum + diffSum) / 2;

        int repeatingNumber = (int) (missing - diffSum);

        return new int[] { repeatingNumber,missing };
    }

}
