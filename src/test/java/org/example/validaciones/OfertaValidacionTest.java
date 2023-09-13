package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class OfertaValidacionTest {


    OfertaValidacion ofertaValidacion = new OfertaValidacion();


    @Test
    public void validarLongitudTituloMalo() {
        String tituloprueba = "23435trgnbcxgfjnfghfghgfrhgfhghfgdfghhvdsghgrfn";
        Exception prueba = Assertions.assertThrows(Exception.class, () -> this.ofertaValidacion.validarTitulo(tituloprueba));
        Assertions.assertEquals(Mensaje.LONGITUD_OFERTA.getMensaje(), prueba.getMessage());
    }

    @Test
    public void validarlongitusTinuloBueno() {
        String tituloprueba = "54645756yn";
        Boolean respuesta = Assertions.assertDoesNotThrow(() -> this.ofertaValidacion.validarTitulo(tituloprueba));
        Assertions.assertTrue(respuesta);
    }



        @Test
        public void testvalidartodasFechasMalas() {
            LocalDate fechaInicio = LocalDate.of(2023, 8, 20);
            LocalDate fechaFin = LocalDate.of(2023, 8, 15);
            Exception prueba = assertThrows(Exception.class, () ->this.ofertaValidacion.validarTodasFechas(fechaInicio, fechaFin));
            Assertions.assertEquals(Mensaje.DIFERENCIA_FECHAS.getMensaje(),prueba.getMessage());

    }


    @Test
    public  void testValidadTodasFechasMalo(){
        LocalDate fechaInicioPrueba = LocalDate.of(2023,2,1);
        LocalDate fechaFinPrueba= LocalDate.of(2023,8,1);
        Boolean respuesta= Assertions.assertDoesNotThrow(()->this.ofertaValidacion.validarTodasFechas(fechaInicioPrueba,fechaFinPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void testValidarFormatoFechaMala(){
        String fechaprueba= "dfgdfgdfhgfdgf";
        Exception respuesta=Assertions.assertThrows(Exception.class,()->this.ofertaValidacion.validarFormatoFechas(fechaprueba));
        Assertions.assertEquals(Mensaje.FORMATO_FECHAS.getMensaje(),respuesta.getMessage());
    }


    @Test
    public void testValidadFormatoFechaBuena(){
        String fechaPrueba= "25/02/2005";
        Boolean respuesta= Assertions.assertDoesNotThrow(()-> this.ofertaValidacion.validarFormatoFechas(fechaPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public  void testValidarCostoPersonaMalo(){
        Double costomalo= -34565476587.69789809809;
        Exception respuesta= Assertions.assertThrows(Exception.class,()->this.ofertaValidacion.validarCostoPersona(costomalo));
        Assertions.assertEquals(Mensaje.COSTO_PERSONA.getMensaje(),respuesta.getMessage());
    }

    @Test
    public void testValidarCostoPersonaBuenos() {
        Double costoprueba = 34235435643.45546547;
        boolean respuesta = Assertions.assertDoesNotThrow(() -> this.ofertaValidacion.validarCostoPersona(costoprueba));
        Assertions.assertTrue(respuesta);
    }
}







