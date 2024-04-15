package com.mycompany.junitm5;

import com.mycompany.practica3m5junit.MyUtils;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

public class MyUtilsTest {

    @Test
    public void testInverteixCadena() {
        // Cadena no nula
        String cadena1 = "Hola Mundo";
        String resultadoEsperado1 = "odnuM aloH";
        assertEquals(resultadoEsperado1, MyUtils.inverteix(cadena1));

        // Cadena nula
        String cadena2 = null;
        assertNull(MyUtils.inverteix(cadena2));
    }

    @Test
    public void testEdat() throws Exception {
        // Edad válida
        int day1 = 15;
        int month1 = 4;
        int year1 = 1990;
        int resultadoEsperado1 = 34;
        assertEquals(resultadoEsperado1, MyUtils.edat(day1, month1, year1));

        // Edad mayor a 150
        int day2 = 1;
        int month2 = 1;
        int year2 = 1770;
        int resultadoEsperado2 = -1;
        assertEquals(resultadoEsperado2, MyUtils.edat(day2, month2, year2));

        // Fecha de nacimiento futura (imposible)
        int day3 = 1;
        int month3 = 1;
        int year3 = 2025;
        int resultadoEsperado3 = -2;
        assertEquals(resultadoEsperado3, MyUtils.edat(day3, month3, year3));
    }

    @Test
    public void testFactorial() {
        // Número positivo
        double numero1 = 5;
        double resultadoEsperado1 = 120;
        assertEquals(resultadoEsperado1, MyUtils.factorial(numero1), 0);

        // Cero
        double numero2 = 0;
        double resultadoEsperado2 = 1;
        assertEquals(resultadoEsperado2, MyUtils.factorial(numero2), 0);

        // Número negativo
        double numero3 = -5;
        double resultadoEsperado3 = -1;
        assertEquals(resultadoEsperado3, MyUtils.factorial(numero3), 0);
    }
}
