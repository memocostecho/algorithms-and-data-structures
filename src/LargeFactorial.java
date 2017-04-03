import java.math.BigInteger;
import java.util.Scanner;

public class LargeFactorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(factorial(new BigInteger(String.valueOf(scanner.nextInt()))).intValue());

    }

    public static BigInteger factorial(BigInteger base) {
        if (base.equals(BigInteger.ONE))
            return new BigInteger("1");
        else return (factorial(base.subtract(BigInteger.ONE))).multiply(base);


    }


}