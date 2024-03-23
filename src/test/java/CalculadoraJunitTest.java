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
        Calculadora calc = new Calculadora();
        int subtrair = calc.subtrair(10, 2);
        System.out.println(subtrair);
        Assertions.assertEquals(8, subtrair);
    }

}
