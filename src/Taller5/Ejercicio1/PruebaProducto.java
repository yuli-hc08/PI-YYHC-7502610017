package Taller5.Ejercicio1;

public class PruebaProducto {
    public static void main(String[] args) {
        // Instanciamos Producto usando su constructor default desde el mismo paquete
        Producto prod = new Producto("Teclado Mecanico", 180000.0, 15);

        // Llamamos al metodo default
        prod.mostrarInfo();

        // Verificamos que podemos leer y modificar sus propiedades directamente dentro del paquete
        prod.precio = 165000.0;
        prod.stock = 12;

        System.out.println("Actualizacion de " + prod.nombre + ":");
        prod.mostrarInfo();
    }
}