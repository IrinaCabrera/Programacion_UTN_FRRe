import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args){
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero del 1 al 10 para poder saber su equivalente en numero romano: ");
        numero = sc.nextInt();

        switch (numero){
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");
                break;
            default:
                System.out.println("El numero ingresado no es correcto, intente mas tarde...");
                break;
        }
    }
}