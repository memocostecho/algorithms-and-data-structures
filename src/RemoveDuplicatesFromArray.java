import java.util.ArrayList;
import java.util.Arrays;

/**
 * Remove duplicates from Sorted Array
 * Given a sorted array, remove the duplicates in place such that each element appears only once and return the new length.
 * <p>
 * Note that even though we want you to return the new length, make sure to change the original array as well in place
 * <p>
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * <p>
 * Example:
 * Given input array A = [1,1,2],
 * Your function should return length = 2, and A is now [1,2].
 */
public class RemoveDuplicatesFromArray {

    private static int removeDuplicates(ArrayList<Integer> a) {

        int curr = 1;
        int size = 1;

        int currentValue = a.get(0);

        while (curr < a.size()) {

            if (a.get(curr) != currentValue) {
                a.set(size, a.get(curr));
                size++;
                currentValue = a.get(curr);
            }

            curr++;

        }

        for(int i =0; i<size; i++) {
            System.out.println(a.get(i));
        }

        return size;

    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new ArrayList<>(Arrays.asList(new Integer[]{0, 1, 1, 2, 2, 3, 3, 3, 3}))));
    }
}
