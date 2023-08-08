package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsuarioValidacion {
    private Util util = new Util();

    //Metodos ordinarios
    public Boolean validarNombre(String nombres) throws Exception {

        if (!util.buscarConcidencia(nombres, "^[a-zA-Z]+$")) {
            throw new Exception(Mensaje.FORMATO_NOMBRE.getMensaje());
        }
        if (nombres.length() < 10) {
            throw new Exception(Mensaje.LONGITUD_NOMBRE.getMensaje());

        }
        return true;
    }


    public Boolean validarUbicacion(Integer ubicacion) throws Exception {
        if (ubicacion == 1 || ubicacion == 2 || ubicacion == 3 || ubicacion == 4) {
            return true;
        } else {
            throw new Exception("error");
        }
    }

    public Boolean validarCorreo(String correo) throws Exception {
        if (!util.buscarConcidencia(correo, "^[\\w-+]+(\\.[\\w-]{1,62}){0,126}@[\\w-]{1,63}(\\.[\\w-]{1,62})+/[\\w-]+$")) {
            throw new Exception("revise el estado del corre");
        }
        return true;
    }
}


