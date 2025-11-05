package services;


public class PagoService {

    public boolean procesarPago(String metodo, double monto) {
        if (metodo.equalsIgnoreCase("tarjeta") || metodo.equalsIgnoreCase("transferencia")) {
            // Simulación de validación
            return monto > 0;
        }
        return false;
    }
}
