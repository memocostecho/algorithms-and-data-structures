import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.System.*;

/**
 * In-place rotate square matrix by 90 degrees | Set 1
 * Given an square matrix, turn it by 90 degrees in anti-clockwise direction without using any extra space.
 * <p>
 * Examples:
 * <p>
 * Input
 * 1  2  3
 * 4  5  6
 * 7  8  9
 * <p>
 * Output:
 * 3  6  9
 * 2  5  8
 * 1  4  7
 * <p>
 * Input:
 * 1  2  3  4
 * 5  6  7  8
 * 9 10 11 12
 * 13 14 15 16
 * <p>
 * Output:
 * 4  8 12 16
 * 3  7 11 15
 * 2  6 10 14
 * 1  5  9 13
 */


public class RotateMatrix {

    static int[][] rotateImage(int[][] a) {

        //base cases
        int aux;

        //transpose
        for (int i=0; i<a.length ; i++) {
            for (int j=i; j<a[i].length ; j++) {
                aux = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = aux;
            }
        }

        //reverse rows
        for (int i=0; i<a.length ; i++) {
            for (int j=0, k=a[i].length -1; j<a[i].length && k > j; j++ , k--) {
                aux = a[i][j];
                a[i][j] = a[i][k];
                a[i][k] = aux;
            }
        }

        return a;
    }

    private static void main(ArrayList<ArrayList<Integer>> matrix) {

    }


    public static void main(String[] args) {

        out.println(Arrays.deepToString(rotateImage(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})));

    }

}
