package Taller5.Ejercicio2.vehiculos;

// Moto hereda de Vehiculo dentro del mismo paquete 'vehiculos'
class Moto extends Vehiculo {

    Moto(String tipo) {
        super(tipo);
    }

    void mostrarDetalleMoto() {
        // Como esta en el mismo paquete, si tiene acceso directo a 'tipo'
        System.out.println("Detalle desde Moto -> Tipo: " + tipo);
    }
}