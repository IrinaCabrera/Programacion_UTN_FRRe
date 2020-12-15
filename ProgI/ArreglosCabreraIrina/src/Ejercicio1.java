import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        int tamaño;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el tamaño del arreglo:");
        tamaño = sc.nextInt();
        int[] arreglo = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            System.out.println("ingrese el " + (i + 1) + "° elemento: ");
            arreglo[i] = sc.nextInt();
        }

        System.out.println("a)");
        for (int a = 0; a < arreglo.length; a++) {
            System.out.println(arreglo[a]);
        }

        System.out.println("b)");
        for (int b = arreglo.length - 1; b >= 0; b--) {
            System.out.println(arreglo[b]);
        }

        System.out.println("c)\nnumeros pares:");
        for (int c = 0; c < arreglo.length; c++) {
            if (arreglo[c] % 2 == 0) {
                System.out.println(arreglo[c]);
            }
        }
        System.out.println("d)\nposiciones impares:");
        for (int d = 0; d < arreglo.length; d = d + 2) {
            System.out.println(arreglo[d]);
        }
    }
}
