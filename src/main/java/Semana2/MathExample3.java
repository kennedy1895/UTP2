package Semana2;

public class MathExample3 {
    public static void main(String[] args) {
        // Base y exponente para el cálculo de potencia
        double base = 3.0;
        double exponent = 4.0;
        
        // Calcular la potencia utilizando Math.pow
        double result = Math.pow(base, exponent);
        
        // Imprimir el resultado
        System.out.println(base + " elevado a la potencia de " + exponent + " es: " + result);
    }
}