package services;

import models.Itinerario;
import models.Vuelo;
import models.Hotel;
import java.util.List;

public class ItinerarioService {

    public Itinerario generarItinerario(String usuario, List<Vuelo> vuelos, List<Hotel> hoteles) {
        Itinerario itinerario = new Itinerario();
        itinerario.setUsuario(usuario);
        itinerario.setVuelos(vuelos);
        itinerario.setHoteles(hoteles);
        return itinerario;
    }
}
