import java.util.HashMap;
import java.util.Scanner;

/**
 * Roy wanted to increase his typing speed for programming contests. So, his friend advised him to type the sentence "The quick brown fox jumps over the lazy dog" repeatedly, because it is a pangram. (Pangrams are sentences constructed by using every letter of the alphabet at least once.)
 * <p>
 * After typing the sentence several times, Roy became bored with it. So he started to look for other pangrams.
 * <p>
 * Given a sentence , tell Roy if it is a pangram or not.
 * <p>
 * Input Format
 * <p>
 * Input consists of a string .
 * <p>
 * Constraints
 * Length of  can be at most   and it may contain spaces, lower case and upper case letters. Lower-case and upper-case instances of a letter are considered the same.
 * <p>
 * Output Format
 * <p>
 * Output a line containing pangram if  is a pangram, otherwise output not pangram.
 * <p>
 * Sample Input
 * <p>
 * Input #1
 * <p>
 * We promptly judged antique ivory buckles for the next prize
 * Input #2
 * <p>
 * We promptly judged antique ivory buckles for the prize
 */
public class Pangram {

    public static void main(String[] args) {


        HashMap<String, Integer> map = new HashMap<>();
        for (char c = 'a'; c <= 'z'; c++) {
            map.put(String.valueOf(c), 0);
        }

        String phrase = new Scanner(System.in).nextLine();

        for (char cha : phrase.toLowerCase().toCharArray()) {
            map.put(String.valueOf(cha), 1);
        }

        for (String key : map.keySet()) {


            if (map.get(key) == 0) {
                System.out.print("not pangram");
                return;
            }
        }
        System.out.print("pangram");
    }
}
