package Condicional_IfElse;

import java.util.Scanner;

public class AscensorTemperatura {
    public void ejecutar(Scanner datos) {
        double tempMinima = 18.0;
        double tempMaxima = 25.0;
        int pisoMinimo = 1;
        int pisoMaximo = 10;

        System.out.print("Ingrese la temperatura ambiente actual (C): ");
        double temperatura = Double.parseDouble(datos.nextLine());

        System.out.print("Ingrese el piso al que desea ir: ");
        int piso = Integer.parseInt(datos.nextLine());

        if (temperatura >= tempMinima && temperatura <= tempMaxima) {
            if (piso >= pisoMinimo && piso <= pisoMaximo) {
                System.out.println("Temperatura adecuada (" + temperatura + "C). Ascensor en movimiento... llegando al piso " + piso);
            } else {
                System.out.println("Error: piso " + piso + " invalido. Ingrese un piso entre " + pisoMinimo + " y " + pisoMaximo);
            }
        } else {
            System.out.println("Temperatura no adecuada: " + temperatura + "C. El ascensor no puede moverse.");
        }
    }
}
