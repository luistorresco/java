package org.example.modelos;

public class Usuario {
    private int id;
    private String documento;
    private String nombre;
    private int ubicacion;
    private String correoElectronico;


    public Usuario() {
    }

    public Usuario(int id, String documento, String nombre, int ubicacion, String correoElectronico) {
        this.id = id;
        this.documento = documento;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", documento='" + documento + '\'' +
                ", nombre='" + nombre + '\'' +
                ", ubicacion=" + ubicacion +
                ", correoElectronico='" + correoElectronico + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(int ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
