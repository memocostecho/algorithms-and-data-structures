import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given an array with n objects colored red, white or blue,
 * sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.
 * <p>
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 * <p>
 * Note: Using library sort function is not allowed.
 * <p>
 * Example :
 * <p>
 * Input : [0 1 2 0 1 2]
 * Modify array so that it becomes : [0 0 1 1 2 2]
 * See Expected Output
 */
public class SortColors {

    private static void sortColors(ArrayList<Integer> list) {

        int leftIndex = 0;
        int zeroBarrier = -1;
        int twoBarrier = list.size();

        while (leftIndex < twoBarrier) {

            if (list.get(leftIndex) == 0) {
                if (list.get(zeroBarrier + 1) == 0) {
                    leftIndex++;
                    zeroBarrier++;
                } else {
                    zeroBarrier++;
                    swap(list, zeroBarrier, leftIndex);
                }
            } else if (list.get(leftIndex) == 2) {
                twoBarrier--;
                swap(list, twoBarrier, leftIndex);
            } else {
                leftIndex++;
            }

        }

        System.out.println(list);


    }


    private static void swap(ArrayList<Integer> list, int firstItemIndex, int secondItemIndex) {
        int aux = list.get(firstItemIndex);
        list.set(firstItemIndex, list.get(secondItemIndex));
        list.set(secondItemIndex, aux);
    }

    public static void main(String[] args) {
        sortColors(new ArrayList<>(Arrays.asList(new Integer[]{0, 2, 2, 0, 0, 2, 1, 2, 0, 1, 1, 2, 0, 2, 2, 0, 1, 0, 0, 1, 1, 2, 1, 0, 0, 0, 2, 1, 1, 2, 1, 0, 2, 2, 1, 2, 1, 1, 1, 1, 1, 0, 0, 0, 2, 0, 1, 0, 2, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 2, 1, 0, 2, 1, 0, 2, 0, 0, 2, 2, 1, 2, 2, 2, 1, 0, 0, 0, 2, 2, 1, 0, 1, 1, 0, 2, 0, 1, 2, 2, 2, 0, 2, 1, 0, 1, 2, 0, 2, 2, 0, 2, 1, 1, 2, 1, 2, 0, 2, 2, 2, 1, 2, 0, 1, 1, 1, 0, 1, 0, 1, 2, 2, 1, 1, 0, 2, 2, 1, 2, 2, 1, 0, 0, 0, 1, 1, 1, 2, 0, 2, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 2, 1, 1, 1, 2, 0, 2, 0, 2, 0, 0, 0, 1, 1, 0, 1, 2, 0, 2, 1, 0, 0, 1, 2, 1, 2, 1, 1, 2, 1, 2, 1, 0, 0, 1, 2, 2, 1, 0, 1, 2, 0, 1, 0, 2, 2, 0, 0, 1, 1, 1, 0, 0, 0, 2, 2, 2, 0, 2, 1, 0, 1, 2, 0, 0, 0, 2, 1, 2, 2, 1, 2, 2, 1, 2, 0, 1, 0, 1, 2, 1, 2, 0, 1, 1, 2, 2, 1, 1, 2, 1, 2, 2, 1, 2, 2, 1, 2, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 2, 1, 2, 0, 2, 1, 1, 0, 1, 0, 2, 1, 2, 2, 1, 2, 0, 0, 2, 0, 0, 2, 0, 0, 1, 2, 0, 0, 0, 1, 0, 2, 1, 0, 1, 0, 1, 2, 0, 2, 0, 1, 1, 2, 1, 0, 0, 2, 0, 2, 0, 0, 0, 0, 1, 2, 2, 2, 0, 0, 1, 1, 2, 0, 0, 0, 1, 2, 1, 2, 2, 0, 0, 1, 0, 2, 0, 2, 1, 2, 1, 2, 2, 0, 1, 2, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 2})));

    }
}
