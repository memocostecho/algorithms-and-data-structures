import java.math.BigInteger;

/**
 * Write code to find a 5 letter string of characters that contains only letters from
 * <p>
 * acdegilmnoprstuw
 * <p>
 * such that the hash(the_string) is
 * <p>
 * 491454843
 * <p>
 * if hash is defined by the following pseudo-code:
 * <p>
 * Int64 hash (String s) {
 * Int64 h = 7
 * String letters = "acdegilmnoprstuw"
 * for(Int32 i = 0; i < s.length; i++) {
 * h = (h * 37 + letters.indexOf(s[i]))
 * }
 * return h
 * }
 * For example, if we were trying to find the 7 letter string where hash(the_string) was 680131659347, the answer would be "leepadg".
 */
public class TrelloBruteForce {

    static int DESIRED_STRING_LENGTH = 5;
    static int DESIRED_HASH = 491454843;
    static String ALLOWED_LETTERS = "acdegilmnoprstuw";
    static int HASH_CONSTANT_H = 7;
    static int HASH_CONSTANT_PRODUCT = 37;

    public static void main(String[] args) {
        calculateCertainHash();
    }

    static void calculateCertainHash() {
        permutation(ALLOWED_LETTERS);
    }


    public static void permutation(String str) {
        permutation("", str, DESIRED_STRING_LENGTH);
    }

    private static void permutation(String prefix, String str, int k) {
        int n = str.length();
        if (k == 0) {
            if (hash(prefix).equals(BigInteger.valueOf(DESIRED_HASH))) {
                System.out.println(prefix);
            }
        } else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n), k - 1);
        }
    }

    static BigInteger hash(String s) {
        BigInteger h = BigInteger.valueOf(HASH_CONSTANT_H);
        for (int i = 0; i < s.length(); i++) {
            h = (h.multiply(BigInteger.valueOf(HASH_CONSTANT_PRODUCT))).add(BigInteger.valueOf(ALLOWED_LETTERS.indexOf(s.charAt(i))));
        }
        return h;
    }
}
