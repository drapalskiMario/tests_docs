package org.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void testAdicionar() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.adicionar(2, 3));
        assertEquals(-2, calc.adicionar(-5, 3));
    }

    @Test
    public void testSubtrair() {
        Calculadora calc = new Calculadora();
        assertEquals(7, calc.subtrair(10, 3));
        assertEquals(-8, calc.subtrair(-5, 3));
    }

    @Test
    public void testMultiplicar() {
        Calculadora calc = new Calculadora();
        assertEquals(15, calc.multiplicar(3, 5));
        assertEquals(-15, calc.multiplicar(3, -5));
    }

    @Test
    public void testDividir() {
        Calculadora calc = new Calculadora();
        assertEquals(2.0, calc.dividir(10, 5), 0.001);
        assertEquals(-2.5, calc.dividir(-5, 2), 0.001);
    }

    @Test
    public void testDividir_Erro_Ao_Dividir_Por_Zero() {
        Calculadora calc = new Calculadora();
        assertThrows(IllegalArgumentException.class, () -> calc.dividir(10, 0));
    }
}

