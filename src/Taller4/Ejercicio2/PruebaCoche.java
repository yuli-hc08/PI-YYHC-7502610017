package Taller4.Ejercicio2;

public class PruebaCoche {
    public static void main(String[] args) {
        Coche miCoche = new Coche("Mazda", "CX-30", 190.0);

        // Acceso correcto mediante metodos publicos
        System.out.println("Marca: " + miCoche.getMarca());
        System.out.println("Modelo: " + miCoche.getModelo());
        System.out.println("Velocidad Maxima inicial: " + miCoche.getVelocidadMaxima() + " km/h");

        // Prueba del metodo acelerar
        miCoche.acelerar(20.0);  // Incremento valido
        miCoche.acelerar(-15.0); // Incremento invalido

        // Intento de acceso directo a propiedades privadas (Genera error de compilacion)

        // System.out.println(miCoche.marca);
        // miCoche.modelo = "Mazda 3";
        // miCoche.velocidadMaxima = 300.0;
    }
}