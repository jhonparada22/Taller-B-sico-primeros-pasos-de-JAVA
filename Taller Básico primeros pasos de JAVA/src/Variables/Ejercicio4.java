package Variables;

import java.util.Scanner;

public class Ejercicio4 {
    public void ejecutar(Scanner datos) {
        System.out.print("Es usted estudiante? (true/false): ");
        boolean esEstudiante = Boolean.parseBoolean(datos.nextLine());

        System.out.println("Es usted estudiante? [Verdadero/Falso]: " + esEstudiante);
    }
}
