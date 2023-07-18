package org.example.modelos;

import java.util.Date;

public class Reserva {
    private int id;
    private int idusuario;
    private int idoferta;
    private double costototal;
    private Date fechareserva;

    private int numeropersonas;

    public Reserva() {
    }

    public Reserva(int id, int idusuario, int idoferta, double costototal, Date fechareserva, int numeropersonas) {
        this.id = id;
        this.idusuario = idusuario;
        this.idoferta = idoferta;
        this.costototal = costototal;
        this.fechareserva = fechareserva;
        this.numeropersonas = numeropersonas;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", idusuario=" + idusuario +
                ", idoferta=" + idoferta +
                ", costototal=" + costototal +
                ", fechareserva=" + fechareserva +
                ", numeropersonas=" + numeropersonas +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getIdoferta() {
        return idoferta;
    }

    public void setIdoferta(int idoferta) {
        this.idoferta = idoferta;
    }

    public double getCostototal() {
        return costototal;
    }

    public void setCostototal(double costototal) {
        this.costototal = costototal;
    }

    public Date getFechareserva() {
        return fechareserva;
    }

    public void setFechareserva(Date fechareserva) {
        this.fechareserva = fechareserva;
    }

    public int getNumeropersonas() {
        return numeropersonas;
    }

    public void setNumeropersonas(int numeropersonas) {
        this.numeropersonas = numeropersonas;
    }
}
