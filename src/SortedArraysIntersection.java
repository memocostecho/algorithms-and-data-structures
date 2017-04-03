import java.util.ArrayList;
import java.util.List;

/**
 * Find the intersection of two sorted arrays.
 * OR in other words,
 * Given 2 sorted arrays, find all the elements which occur in both the arrays.
 * <p>
 * Example :
 * <p>
 * Input :
 * A : [1 2 3 3 4 5 6]
 * B : [3 3 5]
 * <p>
 * Output : [3 3 5]
 * <p>
 * Input :
 * A : [1 2 3 3 4 5 6]
 * B : [3 5]
 * <p>
 * Output : [3 5]
 */

public class SortedArraysIntersection {


    public ArrayList<Integer> intersect(final List<Integer> a, final List<Integer> b) {

        ArrayList<Integer> result = new ArrayList<>();

        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex < a.size() && rightIndex < b.size()) {


            if (a.get(leftIndex) < b.get(rightIndex)) {
                leftIndex++;
            } else if (b.get(rightIndex) < a.get(leftIndex)) {
                rightIndex++;
            } else {
                result.add(a.get(leftIndex));
                leftIndex++;
                rightIndex++;
            }
        }

        return result;

    }


    public static void main(String[] args) {
        //test the algorithm
    }
}
