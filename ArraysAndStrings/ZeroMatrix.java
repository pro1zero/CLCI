package ArraysAndStrings;

import java.util.Arrays;

public class ZeroMatrix {
    public static void zeroMatrix(int[][] nums){
        // Time: O(N^2) as if there are too many zeroes we don't go and populate columns at every element.
        // Worst case could be checking that for every element, thus O(N^2)
        // Space: O(1) as we don't use any extra space.
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                if (nums[i][j] == 0){
                    populateRow(i, nums);
                    populateColumn(j, nums);
                }
            }
        }

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                if (nums[i][j] == Integer.MIN_VALUE)
                    nums[i][j] = 0;
            }
        }

        for(int[] num: nums){
            System.out.println(Arrays.toString((num)));
        }
    }

    public static void zeroMatrixEfficient(int[][] nums){
        // Time: O(N) where N is the total number of elements in the matrix
        // Space: O(1) as we don't use any extra space here.
        boolean firstRowHasZero = false;
        boolean firstColHasZero = false;

        for(int i = 0; i < nums[0].length; i++){
            if (nums[0][i] == 0) {
                firstRowHasZero = true;
                break;
            }
        }

        for(int i = 0; i < nums.length; i++){
            if (nums[i][0] == 0){
                firstColHasZero = true;
                break;
            }
        }

        for(int i = 1; i < nums.length; i++){
            for(int j = 1; j < nums[i].length; j++){
                if (nums[i][j] == 0){
                    nums[0][j] = 0;
                    nums[i][0] = 0;
                }
            }
        }

        for(int i = 0; i < nums[0].length; i++){
            if (nums[0][i] == 0){
                populateColumn(i, nums);
            }
        }

        for(int i = 0; i < nums.length; i++){
            if (nums[i][0] == 0)
                populateRow(i, nums);
        }

        if (firstRowHasZero){
            populateRow(0, nums);
        }

        if (firstColHasZero){
            populateColumn(0, nums);
        }

        for(int[] num: nums){
            System.out.println(Arrays.toString((num)));
        }
    }

    public static void populateRow(int i, int[][] nums){
        for(int j = 0; j < nums[0].length; j++){
            nums[i][j] = 0;
        }
    }

    public static void populateColumn(int i, int[][] nums){
        for(int j = 0; j < nums.length; j++){
            nums[j][i] = 0;
        }
    }
}
