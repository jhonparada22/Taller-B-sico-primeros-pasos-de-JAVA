package Principal;

import Variables.Ejercicio1;
import Variables.Ejercicio2;
import Variables.Ejercicio3;
import Variables.Ejercicio4;
import Variables.Ejercicio5;
import Condicional_IfElse.Factura;
import Condicional_IfElse.Ascensor;
import Condicional_IfElse.AscensorPeso;
import Condicional_IfElse.SensorTemperatura;
import Condicional_IfElse.SensorAlerta;
import Condicional_IfElse.AscensorTemperatura;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int opcionPrincipal;

        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1. Variables");
            System.out.println("2. Condicional If Else");
            System.out.println("3. Proximamente...");
            System.out.println("4. Proximamente...");
            System.out.println("5. Proximamente...");
            System.out.println("6. Proximamente...");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opcion: ");
            opcionPrincipal = Integer.parseInt(datos.nextLine());

            switch (opcionPrincipal) {

                case 1:
                    int opcionVariables;
                    do {
                        System.out.println("\n===== MENU VARIABLES =====");
                        System.out.println("1. Nombre y Apellido");
                        System.out.println("2. Edad");
                        System.out.println("3. Precio de articulo");
                        System.out.println("4. Es Estudiante");
                        System.out.println("5. Letra del alfabeto");
                        System.out.println("6. Regresar al Menu Principal");
                        System.out.print("Seleccione una opcion: ");
                        opcionVariables = Integer.parseInt(datos.nextLine());

                        switch (opcionVariables) {
                            case 1:
                                new Ejercicio1().ejecutar(datos);
                                break;
                            case 2:
                                new Ejercicio2().ejecutar(datos);
                                break;
                            case 3:
                                new Ejercicio3().ejecutar(datos);
                                break;
                            case 4:
                                new Ejercicio4().ejecutar(datos);
                                break;
                            case 5:
                                new Ejercicio5().ejecutar(datos);
                                break;
                            case 6:
                                System.out.println("Regresando al Menu Principal...");
                                break;
                            default:
                                System.out.println("Opcion invalida, intente de nuevo.");
                        }

                    } while (opcionVariables != 6);
                    break;

                case 2:
                    int opcionIfElse;
                    do {
                        System.out.println("\n===== MENU CONDICIONAL IF ELSE =====");
                        System.out.println("1. Factura");
                        System.out.println("2. Ascensor (piso valido)");
                        System.out.println("3. Ascensor (limite de peso)");
                        System.out.println("4. Sensor de temperatura");
                        System.out.println("5. Sensor de temperatura con alerta");
                        System.out.println("6. Ascensor con temperatura");
                        System.out.println("7. Regresar al Menu Principal");
                        System.out.print("Seleccione una opcion: ");
                        opcionIfElse = Integer.parseInt(datos.nextLine());

                        switch (opcionIfElse) {
                            case 1:
                                new Factura().ejecutar(datos);
                                break;
                            case 2:
                                new Ascensor().ejecutar(datos);
                                break;
                            case 3:
                                new AscensorPeso().ejecutar(datos);
                                break;
                            case 4:
                                new SensorTemperatura().ejecutar(datos);
                                break;
                            case 5:
                                new SensorAlerta().ejecutar(datos);
                                break;
                            case 6:
                                new AscensorTemperatura().ejecutar(datos);
                                break;
                            case 7:
                                System.out.println("Regresando al Menu Principal...");
                                break;
                            default:
                                System.out.println("Opcion invalida, intente de nuevo.");
                        }

                    } while (opcionIfElse != 7);
                    break;

                case 3:
                case 4:
                case 5:
                case 6:
                    System.out.println("Proximamente...");
                    break;

                case 7:
                    System.out.println("Hasta luego!");
                    break;

                default:
                    System.out.println("Opcion invalida, intente de nuevo.");
            }

        } while (opcionPrincipal != 7);

        datos.close();
    }
}
