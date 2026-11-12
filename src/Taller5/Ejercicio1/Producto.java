package Taller5.Ejercicio1;

// Clase con acceso de paquete (sin modificador explicito)
class Producto {
    // Propiedades con acceso de paquete (default)
    String nombre;
    double precio;
    int stock;

    // Constructor con acceso de paquete
    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Metodo con acceso de paquete para mostrar los detalles
    void mostrarInfo() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio + " | Stock: " + stock + " unidades");
    }
}