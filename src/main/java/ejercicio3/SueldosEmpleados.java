package ejercicio3;

import java.util.Scanner;

public class SueldosEmpleados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variables para almacenar los sueldos de los empleados:
        double sueldo1, sueldo2, sueldo3, sueldo4, sueldo5;
        double totalSueldo, promedioSueldo, menorSueldo;

        // Ingreso de los sueldos de los empleados:
        System.out.print("Ingrese el sueldo 1: ");
        sueldo1 = scanner.nextDouble();
        
        System.out.print("Ingrese el sueldo 2: ");
        sueldo2 = scanner.nextDouble();
        
        System.out.print("Ingrese el sueldo 3: ");
        sueldo3 = scanner.nextDouble();
        
        System.out.print("Ingrese el sueldo 4: ");
        sueldo4 = scanner.nextDouble();
        
        System.out.print("Ingrese el sueldo 5: ");
        sueldo5 = scanner.nextDouble();
        
        // Calcular el total de sueldos de los empleados:
        totalSueldo = sueldo1 + sueldo2 + sueldo3 + sueldo4 + sueldo5;
        
        // Calcular el promedio de sueldos de los empleados:
        promedioSueldo = totalSueldo / 5;
        
        // Encontrar el sueldo menor usando estructuras condicionales:
        menorSueldo = sueldo1;  // Asumimos que el menor es el primero

        if (sueldo2 < menorSueldo) {
            menorSueldo = sueldo2;
        }
        if (sueldo3 < menorSueldo) {
            menorSueldo = sueldo3;
        }
        if (sueldo4 < menorSueldo) {
            menorSueldo = sueldo4;
        }
        if (sueldo5 < menorSueldo) {
            menorSueldo = sueldo5;
        }
        
        // Mostrar los resultados
        System.out.printf("Total de sueldos: %.2f\n", totalSueldo);
        System.out.printf("Promedio de sueldos: %.2f\n", promedioSueldo);
        System.out.printf("Sueldo menor: %.2f\n", menorSueldo);
    }
}