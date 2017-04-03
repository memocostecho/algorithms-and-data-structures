import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given an m x n matrix of 0s and 1s, if an element is 0, set its entire row and column to 0.
 * <p>
 * Do it in place.
 * <p>
 * Example
 * <p>
 * Given array A as
 * <p>
 * 1 0 1
 * 1 1 1
 * 1 1 1
 * On returning, the array A should be :
 * <p>
 * 0 0 0
 * 1 0 1
 * 1 0 1
 * Note that this will be evaluated on the extra memory used. Try to minimize the space and time complexity.
 */
public class SetMatrixZeros {


    private static void setZeroes(ArrayList<ArrayList<Integer>> a) {

        //aux variables to store the values for the first row and column
        int firstRowValue = 1;
        int firstColumnValue = 1;

        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.get(0).size(); j++) {
                if (a.get(i).get(j) == 0) {
                    if (i == 0) {
                        firstRowValue = 0;
                    }
                    if (j == 0) {
                        firstColumnValue = 0;
                    }
                    else {
                        a.get(0).set(j, 0);
                        a.get(i).set(0, 0);
                    }
                }
            }
        }

        //here we need to actually multiply the matrix
        for (int i = 1; i < a.size(); i++) {
                if(a.get(i).get(0).equals(0)) {
                    for (int j = 0; j < a.get(i).size(); j++) {
                            a.get(i).set(j, 0);
                    }
                }
        }

        for (int j = 1; j < a.get(0).size(); j++) {
            if(a.get(0).get(j).equals(0)) {
                for (int i = 0; i < a.size(); i++) {
                    a.get(i).set(j, 0);
                }
            }
        }

        //at the end we set the first column and set row as needed
        if(firstRowValue == 0) {
            for (int j = 0; j < a.get(0).size(); j++) {
                a.get(0).set(j, 0);
            }
        }

        if(firstColumnValue == 0) {
            for (int i = 0; i < a.size(); i++) {
                a.get(i).set(0, 0);
            }
        }

        //After this iteration we will end up having
        System.out.println(a);


    }

    public static void main(String[] args) {
        ArrayList matrix = new ArrayList();
        matrix.add(new ArrayList<>(Arrays.asList(new Integer[]{0, 1})));
        matrix.add(new ArrayList<>(Arrays.asList(new Integer[]{0, 1})));

        setZeroes(matrix);

    }

}
