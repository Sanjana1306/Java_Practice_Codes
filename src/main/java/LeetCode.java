import java.util.Arrays;

public class LeetCode {

    public static int[] getConcatenation(int[] nums) {

        int length = nums.length;
        int[] result = new int[length + length];

        for (int i = 0; i < length; i++) {
            result[i] = nums[i];
        }

        // Copy elements from array2
        for (int i = 0; i < length; i++) {
            result[length + i] = nums[i];
        }
        return result;

    }

    public static int[] concatenateArrays(int[] array1, int[] array2) {
        int length1 = array1.length;
        int length2 = array2.length;

        // Create a new array to hold the concatenated result
        int[] result = new int[length1 + length2];

        // Copy the elements of array1 into the result
        System.arraycopy(array1, 0, result, 0, length1);

        // Copy the elements of array2 into the result
        System.arraycopy(array2, 0, result, length1, length2);

        return result;
    }

    public static int[] getConcatenationThroughArrayCopy(int[] nums) {

        int length1 = nums.length;
        int length2 = nums.length;
//        int[] result = new int[length1];
        int[] result = new int[length1 + length2];

        // Ensure that the destination array has enough space
        if (result.length < length1 + length2) {
            throw new ArrayIndexOutOfBoundsException("Destination array is not large enough.");
        }

        System.arraycopy(nums, 0, result, 0, length1);

        System.arraycopy(nums, 0, result, length1, length2);

        return result;

    }

    public static void main(String[] args) {

        int[] nums = {1};
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

//        int max = maxSubArray(nums);
//        System.out.println(max);

        int[][] arr={{0, 0, 0},
                {0, 1, 0},
                {1, 1, 1}
        };
        int[][] target={
                {1, 1, 1},
                {0, 1, 0},
                {0, 0, 0}
        };
        boolean isEqual = findRotation(arr,target);
        System.out.println(isEqual);

        int[][] array= rotateMatrix(arr);

        for (int i = 0; i < array.length; i++) {
            // Loop through each column in the row
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(STR."\{array[i][j]} "); // Print each element followed by a space
            }
            System.out.println(); // Move to the next line after each row
        }

        // Concatenate the arrays
//        int[] result = concatenateArrays(array1, array2);
//        System.out.println(Arrays.toString(result));
//
//        int[] resultThroughArrayCopy = getConcatenationThroughArrayCopy(nums);
//        System.out.println(Arrays.toString(resultThroughArrayCopy));
//
//        int[] result1 = getConcatenation(nums);
//        System.out.println(Arrays.toString(result1));
    }

    public static int maxSubArray(int[] nums) {

        int n = nums.length;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += nums[k];
                }
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    public static int[][] rotateMatrix(int[][] matrix){
    int n = matrix.length;
    int rotated[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            rotated[j][n - i - 1] = matrix[i][j];
        }
    }
        return rotated;
}

    public static boolean findRotation(int[][] matrix, int[][] target) {

        int n = matrix.length;
        int m= n-1;

        int[][] rotated = new int[n][n];
        while(m>=0){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    rotated[j][n - i - 1] = matrix[i][j];
                }
            }
            m--;
        }
        return Arrays.deepEquals(rotated, target);
    }
}
