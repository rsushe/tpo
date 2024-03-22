package org.tpo.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TangensTest {
    private static final double BIAS = 1e-3;

    @Test
    public void testTangensZero() {
        assertEquals(0, Tangens.calculate(0), BIAS);
    }

    @Test
    public void testTangensOne() {
        assertEquals(1.55740772465490, Tangens.calculate(1), BIAS);
    }

    @Test
    public void testTangensNegativeOne() {
        assertEquals(-1.55740772465490, Tangens.calculate(-1), BIAS);
    }

    @Test
    public void testTangensNegativePi() {
        assertEquals(0, Tangens.calculate(-Math.PI), BIAS);
    }

    @Test
    public void testTangensPositivePi() {
        assertEquals(0, Tangens.calculate(Math.PI), BIAS);
    }

    @Test
    public void testTangensPositivePiHalfTwo() {
        assertThrows(ArithmeticException.class, () -> Tangens.calculate(Math.PI / 2));
    }

    @Test
    public void testTangensNegativePiHalfTwo() {
        assertThrows(ArithmeticException.class, () -> Tangens.calculate(-Math.PI / 2));
    }
}
