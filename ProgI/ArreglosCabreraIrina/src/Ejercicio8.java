import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,cont=0, cont2=0;
        int [] arreglo= {1,7,4,20,20,9,0,23,30,31};

        System.out.print("Ingrese un numero: ");
        n=sc.nextInt();

        for(int i =0; i < arreglo.length; i++){
            if(n == arreglo[i]){
                cont++;
                System.out.println("El numero se encuentra en la posicion: "+i);
            }
        }
        if(cont ==0){
            System.out.println("NO");
        }

    }
}