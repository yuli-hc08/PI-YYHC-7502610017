package Taller4.Ejercicio1;

public class Estudiante {
    // Atributos privados (cumpliendo con el encapsulamiento)
    private String nombre;
    private int edad;
    private double notaPromedio;

    // Constructor vacio
    public Estudiante() {
    }

    // Constructor con parametros que usa los setters para validar desde la instanciacion
    public Estudiante(String nombre, int edad, double notaPromedio) {
        setNombre(nombre);
        setEdad(edad);
        setNotaPromedio(notaPromedio);
    }

    // Getter y Setter para 'nombre' con validacion
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre no puede estar vacio.");
        }
    }

    // Getter y Setter para 'edad' con validacion
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0 && edad <= 120) {
            this.edad = edad;
        } else {
            System.out.println("Error: La edad debe ser mayor a 0.");
        }
    }

    // Getter y Setter para 'notaPromedio' con validacion (rango 0.0 a 5.0)
    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(double notaPromedio) {
        if (notaPromedio >= 0.0 && notaPromedio <= 5.0) {
            this.notaPromedio = notaPromedio;
        } else {
            System.out.println("Error: La nota promedio debe estar entre 0.0 y 5.0.");
        }
    }
}