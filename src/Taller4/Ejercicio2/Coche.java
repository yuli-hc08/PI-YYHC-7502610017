package Taller4.Ejercicio2;

public class Coche {
    // 1. Todas las propiedades son privadas
    private String marca;
    private String modelo;
    private double velocidadMaxima;

    // Constructor con parametros
    public Coche(String marca, String modelo, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        if (velocidadMaxima > 0) {
            this.velocidadMaxima = velocidadMaxima;
        } else {
            this.velocidadMaxima = 0;
        }
    }

    // Metodos Getters para consultar los datos de forma segura
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    // 2. Metodo acelerar: incrementa velocidadMaxima solo si el incremento es positivo
    public void acelerar(double incremento) {
        if (incremento > 0) {
            this.velocidadMaxima += incremento;
            System.out.println("Acelerando... Nueva velocidad maxima: " + this.velocidadMaxima + " km/h");
        } else {
            System.out.println("Error: El incremento de velocidad debe ser positivo.");
        }
    }
}