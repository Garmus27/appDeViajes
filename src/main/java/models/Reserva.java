package models;

import java.time.LocalDateTime;

public class Reserva {
    private String idReserva;
    private String tipo; // "vuelo" o "hotel"
    private String estado; // "confirmada", "cancelada", "modificada"
    private LocalDateTime fechaReserva;
    private double montoTotal;

    public Reserva(String idReserva, String tipo, String estado, LocalDateTime fechaReserva, double montoTotal) {
        this.idReserva = idReserva;
        this.tipo = tipo;
        this.estado = estado;
        this.fechaReserva = fechaReserva;
        this.montoTotal = montoTotal;
    }


    public Reserva() {}

    public String getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDateTime getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDateTime fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }
}
