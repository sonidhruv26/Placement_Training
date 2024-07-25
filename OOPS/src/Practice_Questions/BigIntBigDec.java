package Practice_Questions;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntBigDec {
    public static void main(String[] args) {
//        double d1 = 3.23;
//        double d2 = 3.13;
//        System.out.println(d1-d2);
        BigDecimal bd1 = new BigDecimal("3.23");
        BigDecimal bd2 = new BigDecimal("3.13");
        bd1 = bd1.subtract(bd2);
        System.out.println(bd1);

        //Factorial
        BigInteger fact = BigInteger.ONE;    //ZERO & TEN are also valid
        for (int i = 2; i <= 50; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact);

        //Round-up/down
        //System.out.println((double)1/3);
        BigDecimal d1 = BigDecimal.ONE;
        BigDecimal d2 = new BigDecimal("3");
        d1 = d1.divide(d2,20,BigDecimal.ROUND_UP);
        System.out.println(d1);
    }
}
