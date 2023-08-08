package org.example.utilidades;

public enum Mensaje {
    FORMATO_NOMBRE("revise el formato del nombre ingresado"),
    LONGITUD_NOMBRE("Numero de caracteres debe ser mayor de 10");
    private String mensaje;

    Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
