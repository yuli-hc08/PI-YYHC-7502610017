package Taller5.Ejercicio3;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona p = new Persona("Camila", 21);

        // 'edad' (default) es accesible directamente dentro del mismo paquete
        System.out.println("Edad: " + p.edad);
        p.edad = 22;
        System.out.println("Nueva edad: " + p.edad);

        // 'nombre' (private) no es accesible directo: System.out.println(p.nombre); daría error
        // Se debe usar get y set
        System.out.println("Nombre: " + p.getNombre());
        p.setNombre("Camila Andrea");
        System.out.println("Nuevo nombre: " + p.getNombre());
    }
}