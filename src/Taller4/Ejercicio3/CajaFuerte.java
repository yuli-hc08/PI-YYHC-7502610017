package Taller4.Ejercicio3;

public class CajaFuerte {
    // Atributo privado sin metodos get ni set
    private double saldoSecreto;

    public CajaFuerte(double saldoInicial) {
        this.saldoSecreto = saldoInicial;
    }

    public static void main(String[] args) {
        CajaFuerte caja = new CajaFuerte(500000.0);

        // Analisis: Aunque el saldo queda totalmente protegido contra cambios externos,
        // al no tener get ni set el dato queda aislado; no se puede consultar ni actualizar
        // desde otras clases, volviendo el objeto poco util en la practica.
        System.out.println("CajaFuerte creada, pero su saldo no se puede leer ni modificar.");
    }
}