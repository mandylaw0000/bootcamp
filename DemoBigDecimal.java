import java.math.BigDecimal;
import java.math.RoundingMode;


public class DemoBigDecimal {
    public static void main(String[] args) {
        System.out.println(0.2 + 0.1);// 0.30000000000000004
        System.out.println(0.3 - 0.1);// 0.19999999999999998
        System.out.println(0.1 * 0.2);// 0.020000000000000004
        System.out.println(0.3 / 0.1);// 2.9999999999999996

        System.out.println(0.1 + 0.3);// 0.4

        // Solution (BigDecimal)
        BigDecimal bd = BigDecimal.valueOf(0.2);
        BigDecimal bd2 = BigDecimal.valueOf(0.1);
        BigDecimal bd3 = bd.add(bd2);
        System.out.println(bd3.doubleValue()); // 0.3

        // subtract
        BigDecimal bd4 = BigDecimal.valueOf(0.3);
        BigDecimal bd5 = BigDecimal.valueOf(0.1);
        BigDecimal bd6 = bd4.subtract(bd5);
        System.out.println(bd6.doubleValue());// 0.2

        double x = 0.3;
        double y = 0.1;
        double result = BigDecimal.valueOf(x).subtract(BigDecimal.valueOf(y))
                .doubleValue();
        System.out.println(result);// 0.2

        // ! mutiple
        System.out.println(BigDecimal.valueOf(0.1)
                .multiply(BigDecimal.valueOf(0.2)).doubleValue());
        System.out.println(
                BigDecimal.valueOf(0.125).multiply(BigDecimal.valueOf(0.35))//
                        .setScale(2, RoundingMode.HALF_UP).doubleValue()); // 0.04



        // ! divide (non-terminated decimal place)
        double e = 10.0;
        double f = 3.0;
        result = BigDecimal.valueOf(e) //
                .divide(BigDecimal.valueOf(f), 2, RoundingMode.HALF_UP) // Half = 5
                .doubleValue();
        System.out.println(result);

        System.out.println(BigDecimal.valueOf(0.5) //
                .divide(BigDecimal.valueOf(4.0), //
                        2, RoundingMode.HALF_DOWN)); // 0.12

        System.out.println(BigDecimal.valueOf(0.5) //
                .divide(BigDecimal.valueOf(4.0), //
                        2, RoundingMode.HALF_UP)); // 0.13

        System.out.println(BigDecimal.valueOf(10) //
                .divide(BigDecimal.valueOf(3), //
                        2, RoundingMode.HALF_UP)); // 0.13

    }
}
