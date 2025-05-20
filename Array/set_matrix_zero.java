package Array;

public class set_matrix_zero {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        setZeroes(matrix);
        System.out.println("Matrix after setting zeroes:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }


    public static void setZeroes(int[][] matrix){

        int row = matrix.length;
        int columns = matrix[0].length;


        boolean firstColumns  = false;
        boolean firstRow = false;
        
        // first row and first column check if zero exist
        for(int i = 0; i < row; i++){
            if(matrix[i][0] == 0){
                firstColumns = true;
                break;
            }
        }

        for(int j = 0; j < columns; j++){
             if(matrix[0][j] == 0){
                firstRow  = true;
                break;
             }
        }


        for(int i = 1; i < row; i++){
            for(int j = 1; j < columns; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }


          for(int i = 1; i < row; i++){
            for(int j = 1; j < columns; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

         if(firstRow){
            for(int j = 0; j < columns; j++){
                matrix[0][j] = 0;
            }
         }

         
         if(firstColumns){
            for(int i = 0; i < row; i++){
                matrix[i][0] = 0;
            }
         }

    }

}
