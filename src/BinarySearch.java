/**
 * Binary search algorithm
 */
public class BinarySearch {

        private static boolean iterativeBinarySearch(Integer[] array, int desired) {

            int low = 0;
            int high = array.length - 1;

            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (array[mid] == desired) {
                    return true;
                } else if (desired < array[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            return false;
        }

    private static boolean recursiveBinarySearch(Integer[] array, int desired, int low, int high) {

        int mid = low + (high - low) / 2;
        if (array[mid] == desired) {
            return true;
        } else if (desired < array[mid]) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }

        return low <= high && recursiveBinarySearch(array, desired, low, high);

    }

    public static void main(String[] args) {
        System.out.println(iterativeBinarySearch(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10));
        System.out.println(recursiveBinarySearch(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10, 0, 9));
    }
}
