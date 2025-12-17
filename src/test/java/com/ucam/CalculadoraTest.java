package com.ucam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    void testSumar() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.sumar(2, 3));
    }

    @Test
    void testRestar() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.restar(3, 2));
    }
}
