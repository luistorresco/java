package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaValidacionTest {

    ReservaValidacion reservaValidacion=new ReservaValidacion();



    @Test
    public void TestValidarFormatoFechasMalo(){
        String fechamala= "dfdfdsff";
        Exception respuesta= Assertions.assertThrows(Exception.class,()->this.reservaValidacion.validarFormatoFechas(fechamala));
        Assertions.assertEquals(Mensaje.FORMATO_FECHAS.getMensaje(),respuesta.getMessage());
    }

    @Test
    public void testValidarFormatoFechasBueno(){
        String fechaPrueba= "23/10/2005";
        boolean respuesta=Assertions.assertDoesNotThrow(()->this.reservaValidacion.validarFormatoFechas(fechaPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void TestValidarNumeroPersonasMalo(){
        int ValorPrueba= 9;
        Exception respuesta= Assertions.assertThrows(Exception.class,()->this.reservaValidacion.validarNumeroPersonas(ValorPrueba));
        Assertions.assertEquals(Mensaje.PERSONA_RESERVA.getMensaje(),respuesta.getMessage());
    }

    @Test
    public void TestValidadNumeroPresonasBueno(){
        int ValorPrueba= 3;
        Boolean respuesta= Assertions.assertDoesNotThrow(()->this.reservaValidacion.validarNumeroPersonas(ValorPrueba));
        Assertions.assertTrue(respuesta);

    }

}