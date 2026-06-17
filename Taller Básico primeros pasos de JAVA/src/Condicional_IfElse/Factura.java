package Condicional_IfElse;

import java.util.Scanner;

public class Factura {
    public void ejecutar(Scanner datos) {
        datos.nextLine(); // limpiar buffer

        System.out.print("Nombre del cliente: ");
        String nombreCliente = datos.nextLine();

        System.out.print("Nombre del producto: ");
        String producto = datos.nextLine();

        System.out.print("Cantidad de productos: ");
        int cantidad = Integer.parseInt(datos.nextLine());

        System.out.print("Precio unitario: ");
        double precioUnitario = Double.parseDouble(datos.nextLine());

        System.out.print("Es estudiante? (true/false): ");
        boolean esEstudiante = Boolean.parseBoolean(datos.nextLine());

        System.out.print("Tipo de cliente (A, B, C, etc.): ");
        char tipoCliente = datos.nextLine().charAt(0);

        double subtotal = cantidad * precioUnitario;
        double impuesto;

        if (esEstudiante) {
            impuesto = subtotal * 0.05;
        } else {
            impuesto = subtotal * 0.13;
        }

        double total = subtotal + impuesto;

        System.out.println("\n===== FACTURA =====");
        System.out.println("Cliente      : " + nombreCliente);
        System.out.println("Tipo cliente : " + tipoCliente);
        System.out.println("Producto     : " + producto);
        System.out.println("Cantidad     : " + cantidad);
        System.out.println("Precio unit. : $" + precioUnitario);
        System.out.println("Subtotal     : $" + subtotal);
        System.out.println("Impuesto     : $" + impuesto + (esEstudiante ? " (5% estudiante)" : " (13%)"));
        System.out.println("TOTAL        : $" + total);
        System.out.println("===================");
    }
}
