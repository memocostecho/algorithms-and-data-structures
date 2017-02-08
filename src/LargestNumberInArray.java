import java.util.*;

/**
 * Given a list of non negative integers, arrange them such that they form the largest number.
 */
public class LargestNumberInArray {


    // DO NOT MODIFY THE LIST
    public static String largestNumber(final List<Integer> a) {

        StringBuilder answer = new StringBuilder();
        List<Integer> answerArray = new ArrayList<>(a);
        answerArray.sort(new MaxValueOnArray());

        for (Integer integer : answerArray) {
            answer.append(integer);
        }

        return answer.toString();
    }

    static class MaxValueOnArray implements Comparator<Integer> {
        public int compare(Integer c1, Integer c2) {
            char[] digits1 = String.valueOf(c1).toCharArray();
            char[] digits2 = String.valueOf(c2).toCharArray();

            for (int i = 0; i < digits1.length; i++) {
                if (i == digits2.length) {
                    return 1;
                }
                if (digits1[i] > digits2[i]) {
                    return -1;
                } else if (digits1[i] < digits2[i]) {
                    return 1;
                }
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList(Arrays.asList(3, 30, 34, 5, 9));
        System.out.println(largestNumber(list));
    }
}
