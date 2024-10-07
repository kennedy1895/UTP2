package semana8;

public class ContarPares {
    public static void main(String[] args) {
        int contadorPares = 0;
        
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                contadorPares++;
            }
        }
        
        System.out.println("Hay " + contadorPares + " números pares entre 1 y 20.");
    }
}