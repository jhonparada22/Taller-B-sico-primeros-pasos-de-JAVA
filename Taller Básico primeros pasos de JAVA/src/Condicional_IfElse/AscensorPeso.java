package Condicional_IfElse;

import java.util.Scanner;

public class AscensorPeso {
    public void ejecutar(Scanner datos) {
        double pesoMaximo = 150.0;
        int pisoMinimo = 1;
        int pisoMaximo = 10;

        System.out.print("Ingrese su peso en kg: ");
        double peso = Double.parseDouble(datos.nextLine());

        System.out.print("Ingrese el piso al que desea ir: ");
        int piso = Integer.parseInt(datos.nextLine());

        if (peso <= pesoMaximo && piso >= pisoMinimo && piso <= pisoMaximo) {
            System.out.println("Peso aceptado. Ascensor en movimiento... llegando al piso " + piso);
        } else if (peso > pesoMaximo) {
            System.out.println("Ascensor sobrecargado. Peso maximo permitido: " + pesoMaximo + " kg");
        } else {
            System.out.println("Error: piso invalido. Ingrese un piso entre " + pisoMinimo + " y " + pisoMaximo);
        }
    }
}
