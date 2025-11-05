package models;

import java.util.List;

public class Hotel {
    private String nombre;
    private String ciudad;
    private int estrellas;
    private double precioPorNoche;
    private List<String> servicios;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    public List<String> getServicios() {
        return servicios;
    }

    public void setServicios(List<String> servicios) {
        this.servicios = servicios;
    }

    public Hotel(String nombre, String ciudad, int estrellas, double precioPorNoche, List<String> servicios) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.estrellas = estrellas;
        this.precioPorNoche = precioPorNoche;
        this.servicios = servicios;

    }

    public Hotel(String nombre) {
        this.nombre = nombre;
    }
}