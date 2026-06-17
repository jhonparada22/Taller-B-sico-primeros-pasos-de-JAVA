package Variables;

import java.util.Scanner;

public class Ejercicio5 {
    public void ejecutar(Scanner datos) {
        System.out.print("Ingrese una letra del alfabeto: ");
        char letra = datos.nextLine().charAt(0);

        System.out.println("La letra asignada es: " + letra);
    }
}
