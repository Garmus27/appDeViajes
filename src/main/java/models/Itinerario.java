package models;

import java.util.List;

public class Itinerario {
    private List<Vuelo> vuelos;
    private List<Hotel> hoteles;
    private String usuario;

    public Itinerario(List<Vuelo> vuelos, List<Hotel> hoteles, String usuario) {
        this.vuelos = vuelos;
        this.hoteles = hoteles;
        this.usuario = usuario;
    }

    public Itinerario() {}

    public List<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(List<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }

    public List<Hotel> getHoteles() {
        return hoteles;
    }

    public void setHoteles(List<Hotel> hoteles) {
        this.hoteles = hoteles;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
