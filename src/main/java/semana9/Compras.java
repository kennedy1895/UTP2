package semana9;

import java.util.Scanner;

public class Compras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de personas: ");
        int n = scanner.nextInt();
        double[] compras = new double[n];
        double suma = 0, mayor = 0, menor = Double.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la compra de la persona " + (i + 1) + ": ");
            compras[i] = scanner.nextDouble();
            suma += compras[i];
            if (compras[i] > mayor) {
                mayor = compras[i];
            }
            if (compras[i] < menor) {
                menor = compras[i];
            }
        }

        double promedio = suma / n;
        System.out.println("El total de las compras es: " + suma);
        System.out.println("El promedio de las compras es: " + promedio);
        System.out.println("La mayor compra es: " + mayor);
        System.out.println("La menor compra es: " + menor);
    }
}