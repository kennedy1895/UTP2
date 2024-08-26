package Semana1;

import java.util.Scanner;

public class SueldosEmpleados {

    public static void main(String[] args) {
        // Crear un array para almacenar los sueldos
        double[] sueldos = new double[5];
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario los sueldos
        for (int i = 0; i < sueldos.length; i++) {
            System.out.print("Ingrese el sueldo " + (i + 1) + ": ");
            sueldos[i] = scanner.nextDouble();
        }

        // Calcular el total de sueldos y el promedio
        double totalSueldos = 0;
        for (double sueldo : sueldos) {
            totalSueldos += sueldo;
        }
        double promedioSueldo = totalSueldos / sueldos.length;

        // Mostrar los resultados
        System.out.printf("%n--- Resumen de Sueldos ---%n");
        System.out.printf("Total de Sueldos: %.2f%n", totalSueldos);
        System.out.printf("Promedio de Sueldo: %.2f%n", promedioSueldo);

  }
    
}
