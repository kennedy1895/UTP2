package semana9;

import java.util.Scanner;

public class PesoPromedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de personas: ");
        int n = scanner.nextInt();
        double[] pesos = new double[n];
        double suma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el peso de la persona " + (i + 1) + ": ");
            pesos[i] = scanner.nextDouble();
            suma += pesos[i];
        }

        double promedio = suma / n;
        System.out.println("El peso promedio es: " + promedio);
    }
}
