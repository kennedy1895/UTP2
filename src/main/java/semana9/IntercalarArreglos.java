package semana9;

public class IntercalarArreglos {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        int[] b = {60, 70, 80, 90, 100};
        int[] c = new int[a.length + b.length];

        // Intercalar los valores de a y b en c
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            c[index++] = a[i];
            c[index++] = b[i];
        }

        // Mostrar el arreglo c intercalado
        System.out.print("Arreglo intercalado: ");
        for (int i : c) {
            System.out.print(i + " ");
        }
    }
}