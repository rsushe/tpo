package org.tpo.math;

public class Tangens {
    public static double calculate(double x) {
        x = roundRadian(x);

        if (Double.compare(x, -Math.PI / 2) == 0 || Double.compare(x, Math.PI / 2) == 0) {
            throw new ArithmeticException("Tangens of inputted angle does not exists");
        }

        return x + Math.pow(x, 3) / 3 + 2 * Math.pow(x, 5) / 15 + 17 * Math.pow(x, 7) / 315
               + 62 * Math.pow(x, 9) / 2835 + 1382 * Math.pow(x, 11) / 155_925 + 21844 * Math.pow(x, 13) / 6_081_075
               + 929_569 * Math.pow(x, 15) / 638_512_875 + 6_404_582 * Math.pow(x, 17) / 10_854_718_875L;
    }

    private static double roundRadian(double rad) {
        final double pi = Math.PI;
        final double pi2 = Math.PI / 2;

        if (rad > 0) {
            while (rad > pi2) {
                rad -= pi;
            }
        } else {
            while (rad < -pi2) {
                rad += pi;
            }
        }

        return rad;
    }
}
