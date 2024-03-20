package org.example;

public class CalculadoraTeste {
    public static void main(String[] args) {


        Calculadora calc = new Calculadora();

        //CENÁRIO DE TESTE 1: SOMA DE DOIS VALORES
        int soma = calc.somar(3, 7);
        System.out.println("Case 1: " + soma);

        //CENÁRIO DE TESTE 2: SOMA DE DOIS VALORES SENDO UM ZERO
        soma = calc.somar(3, 0);
        System.out.println("Case 2: " + soma);

        //CENÁRIO DE TESTE 3: SOMA DE DOIS VALORES SENDO AMBOS SÃO ZERO
        soma = calc.somar(0, 0);
        System.out.println("Case 3: " + soma);

        //CENÁRIO DE TESTE 4: SOMA DE DOIS VALORES SENDO UM NEGATIVO
        soma = calc.somar(3, -1);
        System.out.println("Case 4: " + soma);

        //CENÁRIO DE TESTE 1: SUBTRAÇÃO DE DOIS VALORES
        int subtrair = calc.subtrair(3, 7);
        System.out.println("Case 1: " + subtrair);

        //CENÁRIO DE TESTE 2: SUBTRAÇÃO DE DOIS VALORES SENDO UM ZERO
        subtrair = calc.subtrair(3, 0);
        System.out.println("Case 2: " + subtrair);

        //CENÁRIO DE TESTE 3: SUBTRAÇÃO DE DOIS VALORES SENDO AMBOS SÃO ZERO
        subtrair = calc.subtrair(0, 0);
        System.out.println("Case 3: " + subtrair);

        //CENÁRIO DE TESTE 4: SUBTRAÇÃO DE DOIS VALORES SENDO UM NEGATIVO
        subtrair = calc.subtrair(3, -1);
        System.out.println("Case 4: " + subtrair);

        //CENÁRIO DE TESTE 1 MULTIPLICAÇÃO DE DOIS VALORES
        double multplicacao = calc.multiplicar(3, 7);
        System.out.println("Case 1: " + multplicacao);

        //CENÁRIO DE TESTE 2 MULTIPLICAÇÃO DE DOIS VALORES SENDO UM ZERO
        multplicacao = calc.multiplicar(3, 0);
        System.out.println("Case 2: " + multplicacao);

        //CENÁRIO DE TESTE 3 MULTIPLICAÇÃO, AMBOS SÃO ZERO
        multplicacao = calc.multiplicar(0, 0);
        System.out.println("Case 3: " + multplicacao);

        //CENÁRIO DE TESTE 4 MULTIPLICAÇÃO DE DOIS VALORES SENDO UM NEGATIVO
        multplicacao = calc.multiplicar(3, -1);
        System.out.println("Case 4: " + multplicacao);

        //CENÁRIO DE TESTE 1 DIVISÃO DE DOIS VALORES
        double divisao = calc.dividir(3, 7);
        System.out.println("Case 1: " + divisao);

        //CENÁRIO DE TESTE 2 DIVISÃO DE DOIS VALORES SENDO UM ZERO
        divisao = calc.dividir(3, 0);
        System.out.println("Case 2: " + divisao);

        //CENÁRIO DE TESTE 3 DIVISÃO, AMBOS SÃO ZERO
        divisao = calc.dividir(0, 0);
        System.out.println("Case 3: " + divisao);

        //CENÁRIO DE TESTE 4 DIVISÃO DE DOIS VALORES SENDO UM NEGATIVO
        divisao = calc.dividir(3, -1);
        System.out.println("Case 4: " + divisao);
    }
}
