package Taller6.Ejercicio3;

public class PruebaBanco {
    public static void main(String[] args) {
        Banco cuenta = new Banco(500000);

        // Si se intenta cuenta.saldo = -50000; dara error de compilacion por ser private
        cuenta.depositar(200000);
        cuenta.retirar(150000);
        cuenta.retirar(900000); // Rechazado por superar el saldo disponible

        System.out.println("Saldo disponible: $" + cuenta.getSaldo());
    }
}