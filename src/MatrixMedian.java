
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given a N cross M matrix in which each row is sorted, find the overall median of the matrix. Assume N*M is odd.
 */
public class MatrixMedian {

    /**
     * creates a merge between rows
     *
     * @param matrix
     * @return
     */
    private static int findMedianBruteForce(ArrayList<ArrayList<Integer>> matrix) {
        int min;
        int temp;
        int comparison;
        for (int mergedRow = 1; mergedRow < matrix.size(); mergedRow++) {
            for (int row = 0; row < matrix.size(); row++) {
                for (int col = 0; col < matrix.get(0).size(); col++) {
                    min = matrix.get(row).get(col);
                    for (int k = 0; k < matrix.get(0).size(); k++) {
                        comparison = matrix.get(mergedRow).get(k);
                        if (min > comparison) {
                            temp = min;
                            min = comparison;
                            comparison = temp;
                            matrix.get(row).set(col, min);
                            matrix.get(mergedRow).set(k, comparison);
                            break;
                        }
                    }
                }
            }
        }
        int rowDivision = (int) Math.floor(matrix.size() / 2);
        int columnDivision = (int) Math.floor(matrix.get(0).size() / 2);
        return matrix.get(rowDivision).get(columnDivision);

    }

//    private int getCountSmallerBinary (ArrayList<Integer> array, int compareTo) {
//
//        int low = 0;
//        int high = array.size() - 1;
//        int mid = low + (high - low) / 2;
//
//        if(array.get(mid) >= compareTo) {
//            return mid;
//        }
//
//    }
//
//    /**
//     * @param matrix
//     * @return
//     */
//    private static int findMedianBinarySearch(ArrayList<ArrayList<Integer>> matrix) {
//        for (int row = 0; row < matrix.size(); row++) {
//            for (int col = 0; col < matrix.get(0).size(); col++) {
//
//            }
//        }
//    }


    public static void main(String[] args) {

        ArrayList matrix = new ArrayList();

        matrix.add(new ArrayList<>(Arrays.asList(new Integer[]{1, 3, 5})));
        matrix.add(new ArrayList<>(Arrays.asList(new Integer[]{2, 6, 9})));
        matrix.add(new ArrayList<>(Arrays.asList(new Integer[]{3, 6, 9})));

        System.out.println(findMedianBruteForce(matrix));

        matrix.clear();
        matrix.add(new ArrayList<>(Arrays.asList(new Integer[]{5})));
        matrix.add(new ArrayList<>(Arrays.asList(new Integer[]{4})));
        matrix.add(new ArrayList<>(Arrays.asList(new Integer[]{3})));
        matrix.add(new ArrayList<>(Arrays.asList(new Integer[]{1})));
        matrix.add(new ArrayList<>(Arrays.asList(new Integer[]{3})));
        matrix.add(new ArrayList<>(Arrays.asList(new Integer[]{1})));
        matrix.add(new ArrayList<>(Arrays.asList(new Integer[]{4})));
        matrix.add(new ArrayList<>(Arrays.asList(new Integer[]{2})));
        matrix.add(new ArrayList<>(Arrays.asList(new Integer[]{5})));
        matrix.add(new ArrayList<>(Arrays.asList(new Integer[]{3})));
        matrix.add(new ArrayList<>(Arrays.asList(new Integer[]{3})));
        System.out.println(findMedianBruteForce(matrix));
        ;

        matrix.clear();
        matrix.add(new ArrayList<>(Arrays.asList(new Integer[]{1, 16, 19})));
        matrix.add(new ArrayList<>(Arrays.asList(new Integer[]{5, 12, 17})));
        matrix.add(new ArrayList<>(Arrays.asList(new Integer[]{5, 27, 29})));

        System.out.println(findMedianBruteForce(matrix));
    }
}

