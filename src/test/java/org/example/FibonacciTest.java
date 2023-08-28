package org.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void testCalcularFibonacci() {
        var fib = new Fibonacci();
        assertEquals(2, fib.calcularFibonacci(3));
        assertEquals(5, fib.calcularFibonacci(5));
        assertEquals(21, fib.calcularFibonacci(8));
    }

    @Test
    public void testCalcularFibonacci_Se_N_Eh_Um_Ou_Dois() {
        var fib = new Fibonacci();
        assertEquals(1, fib.calcularFibonacci(1));
        assertEquals(1, fib.calcularFibonacci(2));
    }

    @Test
    public void testCalcularFibonacci_Erro_Se_N_Eh_Zero_Ou_Menor() {
        var fib = new Fibonacci();
        assertThrows(IllegalArgumentException.class, () -> fib.calcularFibonacci(0));
        assertThrows(IllegalArgumentException.class, () -> fib.calcularFibonacci(-5));
    }
}
