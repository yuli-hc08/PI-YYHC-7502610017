package Taller4.Ejercicio1;

public class PruebaEstudiante {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA CON DATOS VALIDOS ===");
        Estudiante estudiante = new Estudiante("Yulieth", 17, 4.5);
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("Nota Promedio: " + estudiante.getNotaPromedio());

        System.out.println("\n=== PRUEBA DE VALIDACIONES CON DATOS INVALIDOS ===");
        // Intentamos asignar valores no permitidos para verificar los mensajes de error
        estudiante.setEdad(-3);
        estudiante.setNotaPromedio(6.0);
        estudiante.setNombre("");

        System.out.println("\n=== ESTADO FINAL DEL ESTUDIANTE ===");
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("Nota Promedio: " + estudiante.getNotaPromedio());
    }
}