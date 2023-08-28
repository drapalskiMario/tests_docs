package org.example;

/**
 * Classe que implementa uma calculadora simples com as quatro operações matemáticas básicas:
 * adição, subtração, multiplicação e divisão.
 */
public class Calculadora {

    /**
     * Realiza a operação de adição entre dois números inteiros.
     *
     * @param a O primeiro número a ser somado.
     * @param b O segundo número a ser somado.
     * @return A soma dos dois números.
     */
    public int adicionar(int a, int b) {
        return a + b;
    }

    /**
     * Realiza a operação de subtração entre dois números inteiros.
     *
     * @param a O número do qual será subtraído.
     * @param b O número que será subtraído.
     * @return A diferença entre os dois números.
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Realiza a operação de multiplicação entre dois números inteiros.
     *
     * @param a O primeiro número a ser multiplicado.
     * @param b O segundo número a ser multiplicado.
     * @return O resultado da multiplicação dos dois números.
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Realiza a operação de divisão entre dois números inteiros.
     *
     * @param a O numerador da divisão.
     * @param b O denominador da divisão.
     * @return O resultado da divisão como um número de ponto flutuante.
     * @throws IllegalArgumentException Se o denominador for zero.
     */
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return (double) a / b;
    }
}

