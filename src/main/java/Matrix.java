import java.util.Arrays;

public class Matrix {

    //Sort a Matrix

    static int[][] sortRowWise2D(int[][] m) {
        // One by one sort individual rows.
        for (int i = 0; i < m.length; i++)
            Arrays.sort(m[i]);

        // printing the sorted matrix
//        for (int i = 0; i < m.length; i++) {
//            for (int j = 0; j < m[i].length; j++)
//                System.out.print(m[i][j] + " ");
//            System.out.println();
//        }
        int n= m.length;
        int[][] matrix = new int[n][n];
        for(int i=0;i<m.length;i++) {
            System.arraycopy(m, 0, matrix, 0, m.length);

        }

        return matrix;
    }
    static int sortRowWise(int[][] m)
    {
        // loop for rows of matrix
        for (int i = 0; i < m.length; i++) {

            // loop for column of matrix
            for (int j = 0; j < m[i].length; j++) {

                // loop for comparison and swapping
                for (int k = 0; k < m[i].length - 1; k++) {
                    if (m[i][k] > m[i][k + 1]) {

                        // swapping of elements
                        int t = m[i][k];
                        m[i][k] = m[i][k + 1];
                        m[i][k + 1] = t;
                    }
                }
            }
        }

        // printing the sorted matrix
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }

        return 0;
    }

    public static void main(String[] args) {

        // Defining number of rows and columns in matrix
        int number_of_rows = 3, number_of_columns = 3;

        /** Array Declaration
        int[][] arr
                = new int[number_of_rows][number_of_columns]; **/

        // Initializing a 2-D array with values
       // int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int[][] m = { { 9, 8, 7, 1 },
                { 7, 3, 0, 2 },
                { 9, 5, 3, 2 },
                { 6, 3, 1, 2 } };
        System.out.println(Arrays.deepToString(sortRowWise2D(m)));
    }
}
