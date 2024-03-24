package org.example;

/**
 * Esta classe representa uma calculadora simples que realiza operações básicas como soma,
 * subtração, multiplicação e divisão.
 *
 * @author Jéser Cáceres Marcelino
 */
public class Calculadora {
    /**
     * Realiza a adição de dois números inteiros.
     *
     * @param num1 O primeiro número a ser somado.
     * @param num2 O segundo número a ser somado.
     * @return O resultado da adição.
     */
    public int somar(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Realiza a subtração de dois números inteiros.
     *
     * @param num1 O número do qual será subtraído.
     * @param num2 O número a ser subtraído.
     * @return O resultado da subtração.
     */
    public int subtrair(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * Realiza a multiplicação de dois números reais.
     *
     * @param num1 O primeiro número a ser multiplicado.
     * @param num2 O segundo número a ser multiplicado.
     * @return O resultado da multiplicação.
     */
    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    /**
     * Realiza a divisão de dois números reais.
     *
     * @param num1 O número que será dividido.
     * @param num2 O divisor.
     * @return O resultado da divisão.
     */
    public double dividir(double num1, double num2) {
        return num1 / num2;
    }
}
