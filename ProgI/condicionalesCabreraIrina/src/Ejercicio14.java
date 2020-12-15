import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args){
        int numero,num1, num2, proceso;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero de dos cifras: ");
        numero = sc.nextInt();

        if(numero < 100 && numero >9){
            num1 = (numero/10);
            num2 = (numero % 10);
            System.out.println("decena: " +num1 + " ; unidad: "+num2);

            proceso = num1 + num2;

            if (proceso % 3 == 0){
                System.out.println("Es multiplo de 3.");
            }
            else{
                System.out.println("no es multiplo de 3.");
            }
        }
        else{
            System.out.println("El numero ingresado supera el limite de las cifras.");
        }


    }
}