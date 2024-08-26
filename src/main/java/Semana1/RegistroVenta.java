package Semana1;

import java.util.Scanner;

public class RegistroVenta {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();

        System.out.print("Ingrese el nombre del producto: ");
        String producto = scanner.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.print("Ingrese la cantidad del producto: ");
        int cantidad = scanner.nextInt();

        // Calcular el subtotal, IGV y total a pagar
        double subtotal = precio * cantidad;
        double igv = subtotal * 0.18;  // 18% de IGV
        double totalPagar = subtotal - igv;

        // Mostrar los resultados
        System.out.println("\n--- Detalles de la Venta ---");
        System.out.println("Nombre del Cliente: " + nombreCliente);
        System.out.println("Producto: " + producto);
        System.out.printf("Precio Unitario: %.2f%n", precio);
        System.out.printf("Cantidad: %d%n", cantidad);
        System.out.printf("Subtotal: %.2f%n", subtotal);
        System.out.printf("IGV (18%%): %.2f%n", igv);
        System.out.printf("Total a Pagar: %.2f%n", totalPagar);

        // Cerrar el scanner
        scanner.close();
    }
}