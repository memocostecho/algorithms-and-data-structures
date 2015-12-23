import java.math.BigInteger;

/**
 * Created by yasminegutierrez on 12/22/15.
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

    static void calculateCertainHash(){
        permutation(ALLOWED_LETTERS);
    }


    public static void permutation(String str) {
        permutation("", str,DESIRED_STRING_LENGTH);
    }

    private static void permutation(String prefix, String str,int k) {
        int n = str.length();
        if (k == 0){
            if(hash(prefix).equals(BigInteger.valueOf(DESIRED_HASH))){
                System.out.println(prefix);
            }
        }
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n),k-1);
        }
    }

    static BigInteger hash (String s) {
        BigInteger h = BigInteger.valueOf(HASH_CONSTANT_H);
        for(int i = 0; i < s.length(); i++) {
            h = (h.multiply(BigInteger.valueOf(HASH_CONSTANT_PRODUCT))).add(BigInteger.valueOf(ALLOWED_LETTERS.indexOf(s.charAt(i))));
        }
        return h;
    }
}
