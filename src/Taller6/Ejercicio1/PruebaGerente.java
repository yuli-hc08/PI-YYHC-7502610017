package Taller6.Ejercicio1;

public class PruebaGerente {
    public static void main(String[] args) {
        Empleado emp = new Empleado("Carlos Ruiz", 2500000);
        Gerente ger = new Gerente("Laura Gomez", 4800000, "Sistemas");

        emp.mostrarInformacion();
        ger.mostrarInformacion();
    }
}