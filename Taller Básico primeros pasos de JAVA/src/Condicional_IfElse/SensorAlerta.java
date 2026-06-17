package Condicional_IfElse;

import java.util.Scanner;

public class SensorAlerta {
    public void ejecutar(Scanner datos) {
        double umbralAlerta = 30.0;

        System.out.println("Umbral de alerta: " + umbralAlerta + "C");
        System.out.print("Ingrese la temperatura actual (C): ");
        double temperatura = Double.parseDouble(datos.nextLine());

        if (temperatura > umbralAlerta) {
            System.out.println("ALERTA: temperatura de " + temperatura + "C supera el umbral de " + umbralAlerta + "C");
        } else {
            System.out.println("Temperatura normal: " + temperatura + "C. Sin alertas.");
        }
    }
}
