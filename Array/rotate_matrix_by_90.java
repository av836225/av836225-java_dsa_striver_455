package Array;

public class rotate_matrix_by_90 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        rotate(matrix);

        System.out.println("Matrix after 90° Clockwise Rotation:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void rotate(int[][] matrix){
        int n = matrix.length;

        //transponse matrix
        for(int i = 0; i < n;i++){
            for(int j = i; j < n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //reverse each row
        for(int i = 0; i< n; i++){
            int left  = 0;
            int right = n-1; 

            while(left < right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }

        }

    }
}
