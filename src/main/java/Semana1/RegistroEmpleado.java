package Semana1;

import java.util.Scanner;

public class RegistroEmpleado {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese el nombre del empleado: ");
        String nombreEmpleado = scanner.nextLine();

        System.out.print("Ingrese el cargo del empleado: ");
        String cargoEmpleado = scanner.nextLine();

        System.out.print("Ingrese el ingreso mensual del empleado: ");
        double ingresoMensual = scanner.nextDouble();

        System.out.print("Ingrese el gasto mensual del empleado: ");
        double gastoMensual = scanner.nextDouble();

        // Calcular el ahorro mensual, bimestral, semestral y anual
        double ahorroMensual = ingresoMensual - gastoMensual;
        double ahorroBimestral = ahorroMensual * 2;
        double ahorroSemestral = ahorroMensual * 6;
        double ahorroAnual = ahorroMensual * 12;

        // Mostrar los resultados
        System.out.println("\n--- Detalles del Empleado ---");
        System.out.println("Nombre del Empleado: " + nombreEmpleado);
        System.out.println("Cargo del Empleado: " + cargoEmpleado);
        System.out.println("Ingreso Mensual: " + ingresoMensual);
        System.out.println("Gasto Mensual: " + gastoMensual);
        System.out.printf("Ahorro Mensual: %.2f%n", ahorroMensual);
        System.out.printf("Ahorro Bimestral: %.2f%n", ahorroBimestral);
        System.out.printf("Ahorro Semestral: %.2f%n", ahorroSemestral);
        System.out.printf("Ahorro Anual: %.2f%n", ahorroAnual);

        // Cerrar el scanner
        scanner.close();
    }
}