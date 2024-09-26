package semana6;

import java.util.Scanner;

public class ContarDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int contador = 0;

        System.out.println("Introduce un número entero: ");
        numero = scanner.nextInt();

        while (numero != 0) {
            numero /= 10;  // Dividir el número por 10 para eliminar el último dígito
            contador++;
        }

        System.out.println("El número tiene " + contador + " dígitos.");
    }
}