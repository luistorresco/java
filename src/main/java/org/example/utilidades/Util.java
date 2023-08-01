package org.example.utilidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {
    public boolean buscarConcidencia(String cadena, String expresionRegular){
        Pattern patron=Pattern.compile(expresionRegular);
        Matcher concidencia= patron.matcher(cadena);
        if(concidencia.matches()){
            return true;
        }else {
            return false;
        }
    }
}
