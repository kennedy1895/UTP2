package semana4;

import java.util.Scanner;

public class NumeroEnIngles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número del 1 al 6: ");
        int numero = scanner.nextInt();
        
        String ingles = "";
        switch (numero) {
            case 1: ingles = "one"; break;
            case 2: ingles = "two"; break;
            case 3: ingles = "three"; break;
            case 4: ingles = "four"; break;
            case 5: ingles = "five"; break;
            case 6: ingles = "six"; break;
            default: System.out.println("Número fuera de rango");
        }
        
        if (!ingles.equals("")) {
            System.out.println("Número = " + numero + ", Inglés = " + ingles);
        }
    }
}