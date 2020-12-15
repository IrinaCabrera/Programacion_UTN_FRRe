import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args){
        int n, suma = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        n = sc.nextInt();
        for(n = n; n > 0; n = n - 1){
            if (n % 2 != 0){
                System.out.println(n);
                suma = suma + n;

            }
        }
        System.out.println("La suma de los numeros es de: "+suma);
    }
}
