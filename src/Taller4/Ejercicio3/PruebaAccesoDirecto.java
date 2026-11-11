package Taller4.Ejercicio3;

public class PruebaAccesoDirecto {
    public static void main(String[] args) {
        Usuario user = new Usuario("ClaveSegura2026");

        // Intento de acceso directo a una propiedad private desde otra clase.
        // al quitar las barras de la siguiente linea, IntelliJ mostrara error de compilacion:
        // "'contrasena' has private access in 'Taller4.Ejercicio3.Usuario'"

        // System.out.println(user.contrasena);

        System.out.println("Objeto Usuario creado. El acceso directo a 'contrasena' esta bloqueado por el compilador.");
    }
}