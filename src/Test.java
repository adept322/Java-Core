import java.math.BigInteger;

public class Test {
    /**
     * Calculates factorial of given <code>value</code>.
     *
     * @param value positive number
     * @return factorial of <code>value</code>
     */
    public static BigInteger factorial(int value) {
        if(value <= 1) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(value).multiply(factorial(value - 1)); // your implementation here
        }
    }
}
/*
//  BigInteger bigInteger = new BigInteger(String.valueOf(value));
    public static BigInteger factorial(int value) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i < value + 1; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result; // your implementation here
    }
 */