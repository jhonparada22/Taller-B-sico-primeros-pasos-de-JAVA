package Condicional_IfElse;

import java.util.Scanner;

public class SensorTemperatura {
    public void ejecutar(Scanner datos) {
        double tempMinima = 18.0;
        double tempMaxima = 25.0;

        System.out.print("Ingrese la temperatura actual (C): ");
        double temperatura = Double.parseDouble(datos.nextLine());

        if (temperatura >= tempMinima && temperatura <= tempMaxima) {
            System.out.println("Temperatura adecuada: " + temperatura + "C. Todo en orden.");
        } else {
            System.out.println("Temperatura fuera del rango: " + temperatura + "C. Rango aceptable: " + tempMinima + "C - " + tempMaxima + "C");
        }
    }
}
