package semana6;

import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int suma = 0;

        System.out.println("Introduce un número (ingresa un número negativo para terminar): ");
        numero = scanner.nextInt();

        while (numero >= 0) {
            suma += numero;
            System.out.println("Introduce otro número: ");
            numero = scanner.nextInt();
        }

        System.out.println("La suma de los números ingresados es: " + suma);
    }
}