package org.example;

public class Fibonacci {
    public int calcularFibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("O valor de n deve ser maior que zero.");
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
    }
}
