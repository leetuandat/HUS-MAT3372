package lab05.BigInteger;

import java.math.BigInteger;

public class TestBigInteger {
    public static void main(String[] args) {
        BigInteger i1 = new BigInteger("111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        BigInteger i2 = new BigInteger("222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222");

        System.out.println("Sum: " + i1.add(i2));
        System.out.println("Product: " + i1.multiply(i2));
    }
}
