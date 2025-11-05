import models.Hotel;
import models.Itinerario;
import models.Vuelo;
import services.ItinerarioService;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ItinerarioServiceTest {

    @Test
    public void testGenerarItinerario() {
        ItinerarioService service = new ItinerarioService();
        Vuelo vuelo = new Vuelo("Mendoza", "Buenos Aires", null, null, "LATAM", 15000, 120);
        Hotel hotel = new Hotel("Hotel Sol", "Buenos Aires", 4, 8000, List.of("wifi", "desayuno"));

        Itinerario itinerario = service.generarItinerario("usuario1", List.of(vuelo), List.of(hotel));

        assertEquals("usuario1", itinerario.getUsuario());
        assertEquals(1, itinerario.getVuelos().size());
        assertEquals(1, itinerario.getHoteles().size());
    }
}