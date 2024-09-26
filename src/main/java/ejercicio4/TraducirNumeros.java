package ejercicio4;

import java.util.Scanner;

public class TraducirNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero, idioma;
        String traducido = "";
        
        // Ingreso del número (1-6)
        System.out.print("Ingrese un número entre 1 y 6: ");
        numero = scanner.nextInt();
        
        // Validar que el número esté en el rango permitido
        if (numero < 1 || numero > 6) {
            System.out.println("Número fuera de rango. Debe ingresar un número entre 1 y 6.");
            return;
        }

        // Ingreso del idioma (1 = español, 2 = inglés, 3 = portugués, 4 = francés)
        System.out.print("Ingrese el tipo de idioma (1=español, 2=inglés, 3=portugués, 4=francés): ");
        idioma = scanner.nextInt();
        
        // Usar estructuras selectivas (switch) para traducir el número
        switch (idioma) {
            case 1: // idioma Español
                switch (numero) {
                    case 1: traducido = "uno"; break;
                    case 2: traducido = "dos"; break;
                    case 3: traducido = "tres"; break;
                    case 4: traducido = "cuatro"; break;
                    case 5: traducido = "cinco"; break;
                    case 6: traducido = "seis"; break;
                }
                break;
            case 2: // idioma Inglés
                switch (numero) {
                    case 1: traducido = "one"; break;
                    case 2: traducido = "two"; break;
                    case 3: traducido = "three"; break;
                    case 4: traducido = "four"; break;
                    case 5: traducido = "five"; break;
                    case 6: traducido = "six"; break;
                }
                break;
            case 3: // idioma Portugués
                switch (numero) {
                    case 1: traducido = "um"; break;
                    case 2: traducido = "dois"; break;
                    case 3: traducido = "três"; break;
                    case 4: traducido = "quatro"; break;
                    case 5: traducido = "cinco"; break;
                    case 6: traducido = "seis"; break;
                }
                break;
            case 4: // idioma Francés
                switch (numero) {
                    case 1: traducido = "un"; break;
                    case 2: traducido = "deux"; break;
                    case 3: traducido = "trois"; break;
                    case 4: traducido = "quatre"; break;
                    case 5: traducido = "cinq"; break;
                    case 6: traducido = "six"; break;
                }
                break;
            default:
                System.out.println("Idioma no válido. Debe ingresar un valor entre 1 y 4.");
                return;
        }
        
        // Mostrar el resultado
        System.out.println("Resultado: " + traducido);
    }
}