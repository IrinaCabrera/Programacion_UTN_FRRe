import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[20];
        int[] B = new int[20];
        int[] C = new int[20];

        //cargar A y B:
        for(int i=0; i <20; i++){
            System.out.print("Ingrese el "+(i+1)+"° valor de A: ");
            A[i]= sc.nextInt();
            System.out.print("Ingrese el "+(i+1)+"° valor de B: ");
            B[i]= sc.nextInt();
            System.out.println();
        }
        int j=0;
        //inviertiendo B y operando:
        for(int i=B.length-1; i>=0; i--){
            C[j]= A[j]*B[i];
            j++;
        }


        //mostrando arreglo C.
        System.out.println("Elementos del arreglo C: ");
        for(int i=0; i <20; i++){
            System.out.print(C[i]+"\t");
        }
    }
}