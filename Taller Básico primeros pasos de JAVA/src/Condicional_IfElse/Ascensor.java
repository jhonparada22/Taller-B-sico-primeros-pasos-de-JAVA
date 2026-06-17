package Condicional_IfElse;

import java.util.Scanner;

public class Ascensor {
    public void ejecutar(Scanner datos) {
        int pisoMinimo = 1;
        int pisoMaximo = 10;

        System.out.println("Ascensor disponible: piso " + pisoMinimo + " al piso " + pisoMaximo);
        System.out.print("Ingrese el piso al que desea ir: ");
        int piso = Integer.parseInt(datos.nextLine());

        if (piso >= pisoMinimo && piso <= pisoMaximo) {
            System.out.println("Ascensor en movimiento... llegando al piso " + piso);
        } else {
            System.out.println("Error: el piso " + piso + " no es valido. Ingrese un piso entre " + pisoMinimo + " y " + pisoMaximo);
        }
    }
}
