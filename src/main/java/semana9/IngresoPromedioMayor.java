package semana9;

import java.util.Scanner;

public class IngresoPromedioMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de personas: ");
        int n = scanner.nextInt();
        double[] ingresos = new double[n];
        double suma = 0, mayor = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el ingreso de la persona " + (i + 1) + ": ");
            ingresos[i] = scanner.nextDouble();
            suma += ingresos[i];
            if (ingresos[i] > mayor) {
                mayor = ingresos[i];
            }
        }

        double promedio = suma / n;
        System.out.println("El ingreso promedio es: " + promedio);
        System.out.println("El mayor ingreso es: " + mayor);
    }
}