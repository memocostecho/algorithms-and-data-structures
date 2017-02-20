import java.util.ArrayList;

/**
 * Remove Duplicates from Sorted Array
 * <p>
 * Given a sorted array, remove the duplicates in place such that each element can appear atmost twice and return the new length.
 * <p>
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * <p>
 * Note that even though we want you to return the new length, make sure to change the original array as well in place
 * <p>
 * For example,
 * Given input array A = [1,1,1,2],
 * <p>
 * Your function should return length = 3, and A is now [1,1,2].
 */
public class RemoveDuplicatesFromArrayTwice {


    public int removeDuplicates(ArrayList<Integer> a) {


        if (a.size() <= 1) {
            return a.size();
        }

        int currIndex = 1;
        int currentValue = a.get(0);
        int newSize = 1;
        boolean hasAppearedTwice = false;

        while (currIndex < a.size()) {

            if (a.get(currIndex) != currentValue || (a.get(currIndex) == currentValue && !hasAppearedTwice)) {

                if (a.get(currIndex) == currentValue) {
                    hasAppearedTwice = true;
                } else {
                    hasAppearedTwice = false;
                }

                currentValue = a.get(currIndex);
                a.set(newSize, currentValue);
                newSize++;


            }

            currIndex++;

        }


        return newSize;


    }


}
