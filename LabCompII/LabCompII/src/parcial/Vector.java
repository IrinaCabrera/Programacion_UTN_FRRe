package parcial;
import java.util.Scanner;

public class Vector {
    public static void main(String[] args) {
        int n,m,aux;
        Scanner sc = new Scanner(System.in);

        System.out.print("ingrese cuantos numeros desea contener en el vector: ");
        n=sc.nextInt();
        int[] arreglo= new int[n];

        //caga del vector
        for(int i=0; i<arreglo.length;i++){
            System.out.print("Ingrese el "+(i+1)+" valor : ");
            arreglo[i]= sc.nextInt();
        }
        //numero m
        System.out.print("ingrese un numero m: ");
        m=sc.nextInt();

        if(n%m==0){
            //si es multiplo entonces se ordena de menor a mayor o dicho de otra manera Ascendente:
            //ordena de menor a mayor, tambien se puede usar Array.sort().
            for(int i = 0; i < arreglo.length; i++){
                for (int j = 0; j < arreglo.length - i - 1; j++) {
                    if (arreglo[j + 1] < arreglo[j]) {
                        aux = arreglo[j + 1];
                        arreglo[j + 1] = arreglo[j];
                        arreglo[j] = aux;
                    }
                }
            }
            System.out.println("Vector ordenado de forma ASCENDENTE:");
            for(int k=0; k<arreglo.length;k++){
                System.out.print(arreglo[k]+"\t");
            }

        }else{
            //si no es multiplo,entonces se ordena de mayor a menor o dicho de otra manera, descendente.
            for(int i = 0; i < arreglo.length; i++){
                for (int j = 0; j < arreglo.length - i - 1; j++) {
                    if (arreglo[j + 1] > arreglo[j]) {
                        aux = arreglo[j + 1];
                        arreglo[j + 1] = arreglo[j];
                        arreglo[j] = aux;
                    }
                }
            }
            System.out.println("Vector ordenado de forma DESCENDENTE:");
            for(int k=0; k<arreglo.length;k++){
                System.out.print(arreglo[k]+"\t");
            }
        }
        //es multiplo?
        System.out.println("\nSi el resto ==0, entonces es multiplo. Caso contrario no es multiplo.");
        System.out.println("n: "+n+" ,m: "+m+" ,resto: "+n%m);


    }

}
