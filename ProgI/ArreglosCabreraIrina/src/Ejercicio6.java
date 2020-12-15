import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];

        //cargar A y B, sumar y cargar a C:
        for(int i=0; i <10; i++){
            System.out.print("Ingrese el "+(i+1)+"° valor de A: ");
            A[i]= sc.nextInt();
            System.out.print("Ingrese el "+(i+1)+"° valor de B: ");
            B[i]= sc.nextInt();
            System.out.println();
            C[i]= A[i]+B[i];
        }
        //mostrando arreglo C:
        System.out.println("Elementos del arreglo C: ");
        for(int i=0; i <10; i++){
            System.out.print(C[i]+"\t");
        }

    }
}