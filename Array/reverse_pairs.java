package Array;

public class reverse_pairs {
    public static void main(String[] args) {
          int[] nums = {1, 3, 2, 3, 1};
        int result = reversePairs(nums);
        System.out.println("Reverse pairs: " + result);
    }

        public static int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    private static int mergeSort(int[] nums, int low, int high) {
        if (low >= high) return 0;

        int mid = (low + high) / 2;
        int count = mergeSort(nums, low, mid) + mergeSort(nums, mid + 1, high);
        count += countCrossPairs(nums, low, mid, high);
        merge(nums, low, mid, high);
        return count;
    }

    private static int countCrossPairs(int[] nums, int low, int mid, int high) {
        int count = 0;
        int j = mid + 1;

        for (int i = low; i <= mid; i++) {
            while (j <= high && (long)nums[i] > 2L * nums[j]) {
                j++;
            }
            count += (j - (mid + 1));
        }
        return count;
    }

     private static void merge(int[] nums, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low, j = mid + 1, k = 0;

        while (i <= mid && j <= high) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }
        while (i <= mid) temp[k++] = nums[i++];
        while (j <= high) temp[k++] = nums[j++];

        // Copy back
        for (int p = 0; p < temp.length; p++) {
            nums[low + p] = temp[p];
        }
    }

}
