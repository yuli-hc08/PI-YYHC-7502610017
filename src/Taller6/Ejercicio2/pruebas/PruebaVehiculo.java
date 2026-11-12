package Taller6.Ejercicio2.pruebas;

import Taller6.Ejercicio2.vehiculos.Vehiculo;
import Taller6.Ejercicio2.vehiculos.Moto;

public class PruebaVehiculo {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo("Automovil", "Mazda");
        Moto m = new Moto("Deportiva", "Yamaha", 600);

        // Si se quita // se vera error de compilacion: no se accede a miembros protected desde clase no relacionada
        
        // System.out.println(v.tipo);
        // System.out.println(m.marca);
        // v.mostrarInfo();

        m.mostrarDetalle();
    }
}