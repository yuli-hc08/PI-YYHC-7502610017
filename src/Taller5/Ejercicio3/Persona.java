package Taller5.Ejercicio3;

public class Persona {
    private String nombre; // Solo accesible dentro de Persona
    int edad;              // Acceso de paquete (default)

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}