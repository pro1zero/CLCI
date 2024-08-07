package ArraysAndStrings;

import java.util.Arrays;

public class RotateMatrix {
    public static void rotateMatrix(int[][] nums){
        for(int layer = 0; layer < nums.length / 2; layer++){
            int[] temp = Arrays.copyOf(nums[layer], nums.length);

            for(int i = layer; i < temp.length - layer - 1; i++){
                nums[layer][i] = nums[nums.length - i - 1][layer];
                nums[nums.length - i - 1][layer] = nums[nums.length - layer - 1][nums.length - i - 1];
                nums[nums.length - layer - 1][nums.length - i - 1] = nums[i][nums.length - layer - 1];
                nums[i][nums.length - layer - 1] = temp[i];
            }
        }

        for(int[] num: nums){
            System.out.println(Arrays.toString(num));
        }
    }
}
