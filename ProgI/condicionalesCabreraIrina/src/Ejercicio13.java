import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args){
        int numero, par;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero distinto de cero: ");
        numero= sc.nextInt();

        if(numero != 0){
            par = numero %2;
            if(par == 0){
                System.out.println("Es par.");
            }
            else{
                System.out.println("No es par.");
            }
        }
        else{System.out.println("El numero ingresado no es valido.");
        }
    }
}