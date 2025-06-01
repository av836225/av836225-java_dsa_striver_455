package Array;

import java.util.ArrayList;
import java.util.List;

public class pascals_traingle {
    public static void main(String[] args) {
        int rowIndex = 5; // Change to get any row
        List<Integer> row = getPascalRow(rowIndex);
        System.out.println(row);
    }

    public static  List<Integer> getPascalRow(int rowIndex){

         List<Integer> row = new ArrayList<>();
         long number = 1;
         row.add(1);

         for(int k=1; k<= rowIndex;k++){
            number = number * (rowIndex - k +1) /k;
            row.add((int) number);
         }
         
         return row;
    }
}
