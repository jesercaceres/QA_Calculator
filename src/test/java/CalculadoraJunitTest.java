import org.example.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Classe de teste para a classe Calculadora, utilizando JUnit 5.
 * Testa os métodos da classe Calculadora em diferentes cenários.
 * Esta classe utiliza anotações do JUnit 5 para os testes.
 *
 * @author Jéser Cáceres Marcelino
 */
public class CalculadoraJunitTest {
    Calculadora calc = new Calculadora();

    /**
     * Testa o método somar da classe Calculadora.
     * Verifica a soma de dois números inteiros em diferentes cenários.
     */
    @Test
    public void somarDoisNumeros() {
        int soma = calc.somar(10, 20);
        Assertions.assertEquals(30, soma);

        //CENÁRIO DE TESTE 2: SOMA DE DOIS VALORES SENDO UM ZERO
        soma = calc.somar(3, 0);
        Assertions.assertEquals(3, soma);

        //CENÁRIO DE TESTE 3: SOMA DE DOIS VALORES SENDO AMBOS ZERO
        soma = calc.somar(0, 0);
        Assertions.assertEquals(0, soma);

        //CENÁRIO DE TESTE 4: SOMA DE DOIS VALORES SENDO UM NEGATIVO
        soma = calc.somar(3, -1);
        Assertions.assertEquals(2, soma);
    }

    /**
     * Testa o método subtrair da classe Calculadora.
     * Verifica a subtração de dois números inteiros em diferentes cenários.
     */
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

        //CENÁRIO DE TESTE 3: SUBTRAÇÃO DE DOIS VALORES SENDO AMBOS ZERO
        subtrair = calc.subtrair(0, 0);
        Assertions.assertEquals(-0, subtrair);

        //CENÁRIO DE TESTE 4: SUBTRAÇÃO DE DOIS VALORES SENDO UM NEGATIVO
        subtrair = calc.subtrair(3, -1);
        Assertions.assertEquals(4, subtrair);
    }

    /**
     * Testa o método multiplicar da classe Calculadora.
     * Verifica a multiplicação de dois números inteiros em diferentes cenários.
     */
    @Test
    public void multiplicarDoisNumeros() {
        //CENÁRIO DE TESTE 1: MULTIPLICAÇÃO DE DOIS VALORES
        double multiplicacao = calc.multiplicar(3, 7);
        Assertions.assertEquals(21, multiplicacao);

        //CENÁRIO DE TESTE 2: MULTIPLICAÇÃO DE DOIS VALORES SENDO UM ZERO
        multiplicacao = calc.multiplicar(3, 0);
        Assertions.assertEquals(0, multiplicacao);

        //CENÁRIO DE TESTE 3: MULTIPLICAÇÃO, AMBOS VALORES SENDO ZERO
        multiplicacao = calc.multiplicar(0, 0);
        Assertions.assertEquals(0, multiplicacao);

        //CENÁRIO DE TESTE 4: MULTIPLICAÇÃO DE DOIS VALORES SENDO UM NEGATIVO
        multiplicacao = calc.multiplicar(3, -1);
        Assertions.assertEquals(-3, multiplicacao);
    }

    /**
     * Testa o método dividir da classe Calculadora.
     * Verifica a divisão de dois números em diferentes cenários.
     */
    @Test
    public void dividirDoisNumeros() {
        //CENÁRIO DE TESTE 1: DIVISÃO DE DOIS VALORES
        double divisao = calc.dividir(4, 2);
        Assertions.assertEquals(2, divisao);

        //CENÁRIO DE TESTE 2: DIVISÃO POR ZERO
        divisao = calc.dividir(3, 0);
        Assertions.assertEquals(Double.POSITIVE_INFINITY, divisao);

        //CENÁRIO DE TESTE 3: DIVISÃO, AMBOS VALORES SENDO ZERO
        divisao = calc.dividir(0, 0);
        Assertions.assertTrue(Double.isNaN(divisao));

        //CENÁRIO DE TESTE 4: DIVISÃO DE DOIS VALORES SENDO UM NEGATIVO
        divisao = calc.dividir(3, -1);
        Assertions.assertEquals(-3, divisao);
    }
}
