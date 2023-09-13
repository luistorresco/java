package org.example.utilidades;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class UtilTest {

    Util util= new  Util();


    @Test
    public void pruebaConvertitStringEnLocalDate() {
        String fechaEntrada = "12-09.2023";
        int añoEsperado = 2023;
        int mesEsperado = 9;
        int diaEsperado = 12;
        LocalDate resultado = util.convertitStringEnLocaDate(fechaEntrada);
        assertEquals(añoEsperado, resultado.getYear());
        assertEquals(mesEsperado, resultado.getMonthValue());
        assertEquals(diaEsperado, resultado.getDayOfMonth());
    }
}






