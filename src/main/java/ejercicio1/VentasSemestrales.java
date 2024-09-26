package ejercicio1;

import java.util.Scanner;

public class VentasSemestrales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variables para almacenar las ventas  de la empresa:
        double venta1, venta2, venta3, venta4, venta5, venta6;
        
        // Ingreso de las ventas de la empresa:
        System.out.print("Ingrese la venta 1: ");
        venta1 = scanner.nextDouble();
        
        System.out.print("Ingrese la venta 2: ");
        venta2 = scanner.nextDouble();
        
        System.out.print("Ingrese la venta 3: ");
        venta3 = scanner.nextDouble();
        
        System.out.print("Ingrese la venta 4: ");
        venta4 = scanner.nextDouble();
        
        System.out.print("Ingrese la venta 5: ");
        venta5 = scanner.nextDouble();
        
        System.out.print("Ingrese la venta 6: ");
        venta6 = scanner.nextDouble();
        
        // Cálculo del total de las ventas de la empresa:
        double totalVentas = venta1 + venta2 + venta3 + venta4 + venta5 + venta6;
        
        // Cálculo del promedio de las ventas de la empresa:
        double promedioVentas = totalVentas / 6;
        
        // Resultados de las ventas de la empresa:
        System.out.println("Total de ventas: " + totalVentas);
        System.out.println("Promedio de ventas: " + promedioVentas);
    }
}