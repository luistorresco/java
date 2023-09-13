package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocalValidacionTest {



    LocalValidacion localValidacion=new LocalValidacion();


    @Test
    public void valalidarnitmalo(){
        String nitprueba= "12345678999";
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.localValidacion.validarNit(nitprueba));
        Assertions.assertEquals(Mensaje.LONGITUD_NIT.getMensaje(),respuesta.getMessage());
    }


    @Test
    public void validarnitBueno(){
        String nitprueba= "12er35g560";
        boolean respuesta= Assertions.assertDoesNotThrow(()->this.localValidacion.validarNit(nitprueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarnombremalo(){
        String nombreprueba= "123456575686uyjhngfvbcbcvbvcnbvcbvdnbvcnvbncvnvcnvcbcvbcvbfbfdbcfcvbfcbgfnbcv";
        Exception respuesta= Assertions.assertThrows(Exception.class,()->this.localValidacion.validarNombre(nombreprueba));
        Assertions.assertEquals(Mensaje.LONGITUD_EMPRESA.getMensaje(),respuesta.getMessage());
    }

    @Test
    public void validarnombrebueno(){
        String nombreprueba= "dgfdkhfxkl";
        boolean respuesta= Assertions.assertDoesNotThrow(()->this.localValidacion.validarNombre(nombreprueba));
        Assertions.assertTrue(respuesta);
    }
}