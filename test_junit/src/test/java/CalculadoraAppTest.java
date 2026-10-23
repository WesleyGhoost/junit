import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CalculadoraAppTest {
    @Test 

    void testSomaInteiros() {
        //Configuração
        CalculadoraApp calc = new CalculadoraApp();

        //Execucação
        int resultado = calc.somaInteiros(2, 3);

        //Verificação
        assertEquals(5, resultado);
    }
    
}
