package Variables;

import java.util.Scanner;

public class Ejercicio2 {
    public void ejecutar(Scanner datos) {
        System.out.print("Ingrese su edad: ");
        int edad = Integer.parseInt(datos.nextLine());

        System.out.println("Tienes " + edad + " anos");
    }
}
