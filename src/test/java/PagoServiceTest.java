import services.PagoService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PagoServiceTest {

    @Test
    public void testProcesarPagoTarjeta() {
        PagoService service = new PagoService();
        boolean resultado = service.procesarPago("tarjeta", 10000);
        assertTrue(resultado);
    }

    @Test
    public void testProcesarPagoInvalido() {
        PagoService service = new PagoService();
        boolean resultado = service.procesarPago("efectivo", 10000);
        assertFalse(resultado);
    }
}