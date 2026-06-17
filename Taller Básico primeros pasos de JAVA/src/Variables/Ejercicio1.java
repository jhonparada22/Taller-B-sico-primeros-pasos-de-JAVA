package Variables;

import java.util.Scanner;

public class Ejercicio1 {
    public void ejecutar(Scanner datos) {
        System.out.print("Ingrese su nombre: ");
        String nombre = datos.nextLine();

        System.out.print("Ingrese su apellido: ");
        String apellido = datos.nextLine();

        System.out.println("Bienvenido, " + nombre + " " + apellido + "!");
    }
}
