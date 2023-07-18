package org.example.modelos;

import java.util.Date;

public class Oferta {
    private int id;
    private String titulo;
    private String descripcion;
    private Date FechaInicio;
    private Date FechaFin;
    private Double costopersona;
    private int idlocal;


    public Oferta() {
    }

    public Oferta(int id, String titulo, String descripcion, Date fechaInicio, Date fechaFin, Double costopersona, int idlocal) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        FechaInicio = fechaInicio;
        FechaFin = fechaFin;
        this.costopersona = costopersona;
        this.idlocal = idlocal;
    }

    @Override
    public String toString() {
        return "Oferta{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", FechaInicio=" + FechaInicio +
                ", FechaFin=" + FechaFin +
                ", costopersona=" + costopersona +
                ", idlocal=" + idlocal +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        FechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        FechaFin = fechaFin;
    }

    public Double getCostopersona() {
        return costopersona;
    }

    public void setCostopersona(Double costopersona) {
        this.costopersona = costopersona;
    }

    public int getIdlocal() {
        return idlocal;
    }

    public void setIdlocal(int idlocal) {
        this.idlocal = idlocal;
    }
}
