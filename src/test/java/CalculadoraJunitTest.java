import org.example.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraJunitTest {
    @Test
    public void somaDoisNumeros() {
        Calculadora calc = new Calculadora();
        int soma = calc.somar(10, 20);
        System.out.println(soma);
        Assertions.assertEquals(30, soma);
    }

    @Test
    public void subtrairDoisNumeros() {
        Calculadora calc = new Calculadora();
       int subtrair = calc.subtrair(10,2);
        System.out.println(subtrair);
        Assertions.assertEquals(8, subtrair);
    }

}
