import java.math.BigDecimal;

/**
 * Implement pow(x, n) % d.
 * <p>
 * In other words, given x, n and d,
 * <p>
 * find (xn % d)
 * <p>
 * Note that remainders on division cannot be negative.
 * In other words, make sure the answer you return is non negative.
 * <p>
 * Input : x = 2, n = 3, d = 3
 * Output : 2
 * <p>
 * 2^3 % 3 = 8 % 3 = 2.
 */
public class Pow {


    private static double pow(int x, int n, int d) {
        return justPow(x, n).remainder(new BigDecimal(d)).doubleValue();
    }


    private static BigDecimal justPow(int x, int n) {
        BigDecimal prod;

        if (n == 0)
            return new BigDecimal(1);
        prod = justPow(x, n / 2);

        if (n % 2 == 0) {

            return prod.multiply(prod);
        } else {

            return prod.multiply(prod).multiply(new BigDecimal(x));
        }


    }

    public static void main(String[] args) {
        System.out.println(pow(71045970, 41535484, 64735492));
    }

}
