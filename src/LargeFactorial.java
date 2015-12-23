import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LargeFactorial {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println(factorial(new BigInteger(String.valueOf(scanner.nextInt()))).intValue());

    }

    public static BigInteger factorial(BigInteger base){
        if( base.equals(BigInteger.ONE))
            return new BigInteger("1");
        else return (factorial(base.subtract(BigInteger.ONE))).multiply(base);


    }


}