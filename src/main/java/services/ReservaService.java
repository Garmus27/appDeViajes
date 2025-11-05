package services;

import models.Reserva;

public class ReservaService {

    public Reserva cancelarReserva(Reserva reserva) {
        reserva.setEstado("cancelada");
        return reserva;
    }

    public Reserva modificarReserva(Reserva reserva, double nuevoMonto) {
        reserva.setEstado("modificada");
        reserva.setMontoTotal(nuevoMonto);
        return reserva;
    }
}
