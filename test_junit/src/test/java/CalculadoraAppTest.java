import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


class CalculadoraAppTest {
    CalculadoraApp calc;

    //Configuração
    @BeforeEach 
    void config() {
        calc = new CalculadoraApp();
    }

    @Test 
    void testSomaInteiros() {
        //Execucação
        int resultado = calc.somaInteiros(2, 3);

        //Verificação
        assertEquals(5, resultado);
    }

    @Test
    void testDivideInteiros() {
        //Execucação
        int resultado = calc.divideInteiros(10, 5);

        //Verificação
        assertEquals(2, resultado);
    }

    @Test
    void testMultiplicaInteiros() {
        //Execucação
        int resultado = calc.multiplicaInteiros(4, 3);

        //Verificação
        assertEquals(12, resultado);
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 10})
    void testTestaPar(int numero) {
        assertTrue(calc.testaPar(numero));
    }

    @AfterEach 
    void limpa() {
        calc = null;
    }
}
