package cl.PruebaPraxis;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;

@DisplayName("Test clase calculadora")
public class CalculadoraTest {

    private static Logger logger = Logger.getLogger("cl.PruebaPraxis.Calculadora");
    private static Calculadora calculadora;

    @BeforeAll
    public static void init() {
        logger.warning("Iniciando el test");
        calculadora = new Calculadora();
    }

    @Test
    public void testSumar() {
        logger.info("Informacion Test Sumar");
        int resultado = Calculadora.sumar(3, 1);
        assertEquals(4, resultado);
        logger.info("El test ha pasado con exito");
    }

    @Test
    public void testRestar() {
        logger.info("Informacion Test Restar");
        int resultado = Calculadora.restar(3, 1);
        assertEquals(2, resultado, "La resta ha sido correcta ");
        logger.info("El test ha pasado con exito");
    }

    @Test
    public void testMultiplicar() {
        logger.info("Informacion Test Multiplicar");
        int resultado = Calculadora.multiplicar(3, 1);
        assertEquals(3, resultado, "La multiplicacion ha sido correcta");
        logger.info("El test ha pasado con exito");
    }

    @Test
    public void testDividir() {
        logger.info("Informacion Test Dividir");
        int resultado = Calculadora.dividir(4, 2);
        assertEquals(2, resultado, "La division ha sido correcta");
        logger.info("El test ha pasado con exito");
    }

    @Test
    public void testDividirPorCero() {
        logger.info("Informacion Test Dividir por Cero");
        int num1 = 4;
        int num2 = 0;


        ArithmeticException thrown = assertThrows(
                ArithmeticException.class,
                () -> Calculadora.dividir(num1, num2),
                "Esperaba una ArithmeticException al dividir por cero"
        );

        logger.info("División por cero arrojó ArithmeticException como se esperaba");
    }

}
