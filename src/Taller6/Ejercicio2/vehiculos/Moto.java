package Taller6.Ejercicio2.vehiculos;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String tipo, String marca, int cilindrada) {
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }

    public void mostrarDetalle() {
        // Acceso permitido porque Moto hereda de Vehiculo
        System.out.println("Moto -> Tipo: " + tipo + " | Marca: " + marca + " | Cilindrada: " + cilindrada + "cc");
    }
}
