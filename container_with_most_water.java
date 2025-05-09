public class container_with_most_water {

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Maximum area: " + maxArea(height));    
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxiumArea = 0;

        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height[left],height[right]);
            int currentArea = width * minHeight;

            maxiumArea = Math.max(maxiumArea, currentArea);

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
            
        }

        return maxiumArea;
    }

}
