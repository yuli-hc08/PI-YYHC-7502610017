package Taller5.Ejercicio2.pruebas;

// import Taller5.Ejercicio2.vehiculos.Vehiculo;
// import Taller5.Ejercicio2.vehiculos.Moto;

public class PruebaVehiculo {
    public static void main(String[] args) {
        // Vehiculo v = new Vehiculo("Automovil");
        // Moto m = new Moto("Deportiva");
        // System.out.println(v.tipo);
        // m.mostrarDetalleMoto();

        // No se puede acceder desde otro paquete porque Vehiculo, Moto y 'tipo' son default.
        System.out.println("Acceso restringido desde otro paquete por modificador default.");
    }
}