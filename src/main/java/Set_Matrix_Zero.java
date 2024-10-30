public class Set_Matrix_Zero {
    static void markRow(int[][] matrix, int n, int m, int i) {

        // set all non-zero elements as -1 in the row i:
        for (int j = 0; j < m; j++) {
            if (matrix[i][j] != 0) {
                matrix[i][j]=-1;
            }
        }
    }

    static void markCol(int[][] matrix, int n, int m, int j) {
        // set all non-zero elements as -1 in the col j:
        for (int i = 0; i < n; i++) {
            if (matrix[i][j] != 0) {
                matrix[i][j]=-1;
            }
        }
    }

    static int[][] intMatrix(int[][] matrix, int n, int m) {

        int[] row = new int[n]; // row array
        int[] col = new int[m]; // col array

        // Traverse the matrix:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    // mark ith index of row wih 1:
                    row[i] = 1;

                    // mark jth index of col wih 1:
                    col[j] = 1;
                }
            }
        }

        // Finally, mark all (i, j) as 0
        // if row[i] or col[j] is marked with 1.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j]=0;
                }
            }
        }

        return matrix;

    }

    public static void main(String[] args) {

        //zero matrix
//        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
//        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
//        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
//        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

        //int Matrix
       int[][] matrix= {{-1},{2},{3}};

        int n = matrix.length;
        int m = matrix[0].length;

        int[][] ans = zeroMatrix(matrix, n, m);

        System.out.println("The Final matrix is: ");
        for (int[] row : matrix) {
            for (Integer ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

    static int[][] zeroMatrix(int[][] matrix, int n, int m) {
         //Set -1 for rows and cols that contains 0. Don't mark any 0 as -1:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    markRow(matrix, n, m, i);
                    markCol(matrix, n, m, j);
                }
            }
        }
        // Finally, mark all -1 as 0:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j]=0;
                }
            }
        }
        return matrix;
    }

}
