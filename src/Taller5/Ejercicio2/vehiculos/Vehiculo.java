package Taller5.Ejercicio2.vehiculos;

// Clase con acceso de paquete (default)
class Vehiculo {
    String tipo; // Propiedad con acceso de paquete

    Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    void mostrarTipo() {
        System.out.println("Tipo de vehiculo: " + tipo);
    }
}