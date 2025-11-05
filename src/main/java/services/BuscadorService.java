package services;

import models.Hotel;
import models.Vuelo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BuscadorService {

    private List<Vuelo> vuelos = new ArrayList<>();
    private List<Hotel> hoteles = new ArrayList<>();

    public BuscadorService() {
        //simulamos datos pa ver si funca
        vuelos.add(new Vuelo("Mendoza", "Buenos Aires", null, null, "LATAM", 15000, 120));
        vuelos.add(new Vuelo("Mendoza", "Córdoba", null, null, "FlyBondi", 10000, 90));

        hoteles.add(new Hotel("Hotel Sol", "Buenos Aires", 4, 8000, List.of("wifi", "desayuno")));
        hoteles.add(new Hotel("Hotel Luna", "Córdoba", 3, 6000, List.of("wifi")));
    }

    public List<Vuelo> buscarVuelosPorDestino(String destino) {
        return vuelos.stream()
                .filter(v -> v.getDestino().equalsIgnoreCase(destino))
                .collect(Collectors.toList());
    }

    public List<Hotel> buscarHotelesPorCiudad(String ciudad) {
        return hoteles.stream()
                .filter(h -> h.getCiudad().equalsIgnoreCase(ciudad))
                .collect(Collectors.toList());
    }
}
