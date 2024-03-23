import org.example.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraJunitTest {
    Calculadora calc = new Calculadora();

    @Test
    public void somarDoisNumeros() {
        int soma = calc.somar(10, 20);
        Assertions.assertEquals(30, soma);

        //CENÁRIO DE TESTE 2: SOMA DE DOIS VALORES SENDO UM ZERO
        soma = calc.somar(3, 0);
        Assertions.assertEquals(3, soma);

        //CENÁRIO DE TESTE 3: SOMA DE DOIS VALORES SENDO AMBOS SÃO ZERO
        soma = calc.somar(0, 0);
        Assertions.assertEquals(0, soma);


        //CENÁRIO DE TESTE 4: SOMA DE DOIS VALORES SENDO UM NEGATIVO
        soma = calc.somar(3, -1);
        Assertions.assertEquals(2, soma);
    }

    @Test
    public void subtrairDoisNumeros() {
        int subtrair = calc.subtrair(10, 2);
        Assertions.assertEquals(8, subtrair);

        //CENÁRIO DE TESTE 1: SUBTRAÇÃO DE DOIS VALORES
        subtrair = calc.subtrair(3, 7);
        Assertions.assertEquals(-4, subtrair);

        //CENÁRIO DE TESTE 2: SUBTRAÇÃO DE DOIS VALORES SENDO UM ZERO
        subtrair = calc.subtrair(3, 0);
        Assertions.assertEquals(3, subtrair);

        //CENÁRIO DE TESTE 3: SUBTRAÇÃO DE DOIS VALORES SENDO AMBOS SÃO ZERO
        subtrair = calc.subtrair(0, 0);
        Assertions.assertEquals(-0, subtrair);

        //CENÁRIO DE TESTE 4: SUBTRAÇÃO DE DOIS VALORES SENDO UM NEGATIVO
        subtrair = calc.subtrair(3, -1);
        Assertions.assertEquals(4, subtrair);
    }

    @Test
    public void multiplicarDoisNumeros() {
        //CENÁRIO DE TESTE 1 MULTIPLICAÇÃO DE DOIS VALORES
        double multiplicacao = calc.multiplicar(3, 7);
        Assertions.assertEquals(21, multiplicacao);

        //CENÁRIO DE TESTE 2 MULTIPLICAÇÃO DE DOIS VALORES SENDO UM ZERO
        multiplicacao = calc.multiplicar(3, 0);
        Assertions.assertEquals(0, multiplicacao);

        //CENÁRIO DE TESTE 3 MULTIPLICAÇÃO, AMBOS SÃO ZERO
        multiplicacao = calc.multiplicar(0, 0);
        Assertions.assertEquals(0, multiplicacao);

        //CENÁRIO DE TESTE 4 MULTIPLICAÇÃO DE DOIS VALORES SENDO UM NEGATIVO
        multiplicacao = calc.multiplicar(3, -1);
        Assertions.assertEquals(-3, multiplicacao);
    }

}
