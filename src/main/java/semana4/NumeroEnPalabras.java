package semana4;

import java.util.Scanner;

public class NumeroEnPalabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número del 1 al 5: ");
        int numero = scanner.nextInt();
        
        String palabra = "";
        switch (numero) {
            case 1: palabra = "uno"; break;
            case 2: palabra = "dos"; break;
            case 3: palabra = "tres"; break;
            case 4: palabra = "cuatro"; break;
            case 5: palabra = "cinco"; break;
            default: System.out.println("Número fuera de rango");
        }
        
        if (!palabra.equals("")) {
            System.out.println("Número = " + numero + ", Palabra = " + palabra);
        }
    }
}