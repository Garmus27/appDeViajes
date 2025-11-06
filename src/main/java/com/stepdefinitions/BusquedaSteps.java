
package com.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.es.*;

public class BusquedaSteps {

    @Given("que estoy en la página de búsqueda")
    public void queEstoyEnLaPaginaDeBusqueda() {
        System.out.println("Abrir página de búsqueda");
    }

    @When("ingreso {string} como origen")
    public void ingresoComoOrigen(String origen) {
        System.out.println("Ingresar origen: " + origen);
    }

    @When("ingreso {string} como destino")
    public void ingresoComoDestino(String destino) {
        System.out.println("Ingresar destino: " + destino);
    }

    @When("selecciono fecha de salida {string}")
    public void seleccionoFechaSalida(String fecha) {
        System.out.println("Seleccionar fecha salida: " + fecha);
    }

    @When("selecciono fecha de regreso {string}")
    public void seleccionoFechaRegreso(String fecha) {
        System.out.println("Seleccionar fecha regreso: " + fecha);
    }

    @When("hago clic en {string}")
    public void hagoClicEn(String boton) {
        System.out.println("Click en: " + boton);
    }

    @Then("debo ver al menos {int} resultados")
    public void deboVerResultados(int cantidad) {
        System.out.println("Validar al menos " + cantidad + " resultados");
    }

    @Then("los resultados deben mostrarse en menos de {int} segundos")
    public void resultadosEnMenosDe(int segundos) {
        System.out.println("Validar tiempo < " + segundos + " segundos");
    }

    @Then("los resultados deben estar ordenados por precio de menor a mayor")
    public void resultadosOrdenadosPorPrecio() {
        System.out.println("Validar orden por precio ascendente");
    }

    @Given("que he realizado una búsqueda básica")
    public void busquedaBasicaRealizada() {
        System.out.println("Búsqueda básica realizada");
    }

    @Given("veo resultados en pantalla")
    public void veoResultadosEnPantalla() {
        System.out.println("Resultados visibles en pantalla");
    }

    @When("aplico filtro de precio entre {string} y {string}")
    public void aplicoFiltroPrecio(String min, String max) {
        System.out.println("Filtro precio entre " + min + " y " + max);
    }

    @When("selecciono aerolínea {string}")
    public void seleccionoAerolinea(String aerolinea) {
        System.out.println("Seleccionar aerolínea: " + aerolinea);
    }

    @Then("debo ver solo resultados que cumplan ambos criterios")
    public void resultadosFiltrados() {
        System.out.println("Validar resultados filtrados correctamente");
    }

    @Then("el tiempo de respuesta no debe superar {int} segundos")
    public void tiempoRespuestaMaximo(int segundos) {
        System.out.println("Validar tiempo de respuesta < " + segundos);
    }

    @Given("que veo resultados de búsqueda")
    public void veoResultadosBusqueda() {
        System.out.println("Resultados de búsqueda visibles");
    }

    @When("selecciono ordenar por {string}")
    public void seleccionoOrden(String criterio) {
        System.out.println("Ordenar por: " + criterio);
    }

    @Then("los resultados deben reordenarse de menor a mayor duración")
    public void resultadosOrdenadosPorDuracion() {
        System.out.println("Validar orden por duración ascendente");
    }

    @Then("el vuelo más corto debe aparecer primero")
    public void vueloMasCortoPrimero() {
        System.out.println("Validar que el vuelo más corto esté primero");
    }

    @Given("que estoy viendo resultados de hoteles")
    public void viendoResultadosHoteles() {
        System.out.println("Resultados de hoteles visibles");
    }

    @When("selecciono filtro de {string}")
    public void seleccionoFiltroEstrellas(String filtro) {
        System.out.println("Filtro de estrellas: " + filtro);
    }

    @When("selecciono servicio {string}")
    public void seleccionoServicio(String servicio) {
        System.out.println("Seleccionar servicio: " + servicio);
    }

    @Then("debo ver solo hoteles con {int} o más estrellas")
    public void hotelesConEstrellas(int estrellas) {
        System.out.println("Validar hoteles con al menos " + estrellas + " estrellas");
    }

    @Then("todos los hoteles mostrados deben tener WiFi y desayuno")
    public void hotelesConServicios() {
        System.out.println("Validar hoteles con WiFi y desayuno");
    }
}
