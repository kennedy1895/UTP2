package ejercicio2;

import java.util.Scanner;

public class InteresCompuesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variables :
        double capitalInicial, tasaInteres, tiempo, valorFuturo, interesCompuesto;
        
        // Ingreso de los datos:
        System.out.print("Ingrese el capital inicial (va): ");
        capitalInicial = scanner.nextDouble();
        
        System.out.print("Ingrese la tasa de interés (i) en porcentaje: ");
        tasaInteres = scanner.nextDouble();
        
        System.out.print("Ingrese el tiempo en meses (n): ");
        tiempo = scanner.nextDouble();
        
        // Convertir la tasa del interés a decimal (dividido entre 100)
        tasaInteres = tasaInteres / 100;
        
        // Cálculo del valor futuro (vf) usando la fórmula del interés compuesto
        valorFuturo = capitalInicial * Math.pow((1 + tasaInteres), tiempo);
        
        // Cálculo del interés compuesto (I)
        interesCompuesto = valorFuturo - capitalInicial;
        
        // Mostrar resultados
        System.out.printf("Valor futuro (vf): %.2f\n", valorFuturo);
        System.out.printf("Interés compuesto (I): %.2f\n", interesCompuesto);
    }
}