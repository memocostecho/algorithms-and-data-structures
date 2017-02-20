import java.util.ArrayList;
import java.util.Arrays;

/**
 * Remove Element
 * <p>
 * Given an array and a value, remove all the instances of that value in the array.
 * Also return the number of elements left in the array after the operation.
 * It does not matter what is left beyond the expected length.
 * <p>
 * Example:
 * If array A is [4, 1, 1, 2, 1, 3]
 * and value elem is 1,
 * then new length is 3, and A is now [4, 2, 3]
 * Try to do it in less than linear additional space complexity.
 */
public class RemoveElementsArray {

    private static int removeElement(ArrayList<Integer> array, int value) {

        int curr = 0;
        int newSize = 0;

        while (curr < array.size()) {
            if (array.get(curr) != value) {
                array.set(newSize, array.get(curr));
                newSize++;
            }
            curr++;
        }

        for(int i =0; i<newSize; i++) {
            System.out.println(array.get(i));
        }

        return newSize;

    }

    public static void main(String[] args) {
        System.out.println(removeElement(new ArrayList<>(Arrays.asList(new Integer[]{4,1,1,2,1,3})), 1));;
    }

}
