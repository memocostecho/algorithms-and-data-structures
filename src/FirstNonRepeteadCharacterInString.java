/**
 * Given a string s, find and return the first instance of a non-repeating character in it. If there is no such character, return '_'.
 * <p>
 * Example
 * <p>
 * For s = "abacabad", the output should be
 * firstNotRepeatingCharacter(s) = 'c'.
 */
public class FirstNonRepeteadCharacterInString {

    static char firstNotRepeatingCharacter(String s) {

        int[] count = new int[256];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)] = count[s.charAt(i)] + 1;
        }

        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i)] == 1) {
                return s.charAt(i);
            }
        }

        return '_';
    }

    public static void main(String[] args) {
        System.out.println(firstNotRepeatingCharacter("abacabad"));
    }

}
