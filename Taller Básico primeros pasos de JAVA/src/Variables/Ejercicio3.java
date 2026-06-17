package Variables;

import java.util.Scanner;

public class Ejercicio3 {
    public void ejecutar(Scanner datos) {
        System.out.print("Ingrese el precio del articulo: ");
        double precio = Double.parseDouble(datos.nextLine());

        System.out.println("El precio del articulo es $" + precio);
    }
}
