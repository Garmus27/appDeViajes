import models.Reserva;
import services.ReservaService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReservaServiceTest {

    @Test
    public void testCancelarReserva() {
        Reserva reserva = new Reserva();
        reserva.setEstado("confirmada");

        ReservaService service = new ReservaService();
        Reserva resultado = service.cancelarReserva(reserva);

        assertEquals("cancelada", resultado.getEstado());
    }

    @Test
    public void testModificarReserva() {
        Reserva reserva = new Reserva();
        reserva.setEstado("confirmada");
        reserva.setMontoTotal(10000);

        ReservaService service = new ReservaService();
        Reserva resultado = service.modificarReserva(reserva, 12000);

        assertEquals("modificada", resultado.getEstado());
        assertEquals(12000, resultado.getMontoTotal());
    }
}