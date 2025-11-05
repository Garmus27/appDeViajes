import models.Vuelo;
import services.BuscadorService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BuscadorServiceTest {

    @Test
    public void testBuscarVuelosPorDestino() {
        BuscadorService buscador = new BuscadorService();
        List<Vuelo> resultados = buscador.buscarVuelosPorDestino("Buenos Aires");
        assertFalse(resultados.isEmpty());
        assertEquals("Buenos Aires", resultados.get(0).getDestino());
    }
}