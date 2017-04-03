/**
 * Created by guillermo.rosales on 09/09/15.
 */
public class SpiralMatrix {


    public static void printSpiralMatrix(int[][] matrix) {

        int m = matrix.length; //rows
        int n = matrix[0].length; //columns
        int j = 0; //row index
        int k = 0; //column index

        while (j < m && k < n) {

            for (int i = 0; i < n; i++)
                System.out.println(matrix[j][i]);
            j++;

            for (int i = j; i < m; i++)
                System.out.println(matrix[i][n - 1]);
            n--;

            for (int i = n - 1; i > k; i--)
                System.out.println(matrix[m - 1][i]);
            m--;

            for (int i = k; i > j; i--)
                System.out.println(matrix[i][k]);
            k++;

        }

    }

    public static void main(String[] args) {


        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        printSpiralMatrix(matrix);


    }


}
