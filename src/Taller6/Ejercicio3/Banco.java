package Taller6.Ejercicio3;

public class Banco {
    // Inseguro: protected double saldo; (cualquier subclase o clase del paquete podria alterarlo)
    private double saldo;

    public Banco(double saldoInicial) {
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
        }
    }
}