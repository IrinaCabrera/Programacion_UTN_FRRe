import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args){
        int n=1, digito,suma=0,num1,num2,num3,num4,num5;
        Scanner sc = new Scanner(System.in);

        while (n > 0){

            System.out.println("Un numero de cuantos digitos quiere ingresar?: ");
            digito = sc.nextInt();

            switch(digito){
                case 1:
                    System.out.println("Ingrese un numero: ");
                    n = sc.nextInt();
                    suma = n;
                    break;
                case 2:
                    System.out.println("Ingrese un numero: ");
                    n = sc.nextInt();
                    num1 = n %10;
                    num2 = n /10;
                    suma = num1 + num2;
                    break;
                case 3:
                    System.out.println("Ingrese un numero: ");
                    n = sc.nextInt();
                    num1 = n %10;
                    num2 = n /10;
                    num2 = num2 % 10;
                    num3 = n /100;
                    suma = num1 + num2 + num3;
                    break;
                case 4:
                    System.out.println("Ingrese un numero: ");
                    n = sc.nextInt();
                    num1 = n %10;
                    num2 = n /10;
                    num2 = num2 %10;
                    num3 = n /100;
                    num3 = num3 %10;
                    num4 = n/1000;
                    suma = num1 + num2 + num3 + num4;
                    break;
                case 5:
                    System.out.println("Ingrese un numero: ");
                    n = sc.nextInt();
                    num1 = n %10;
                    num2 = n /10;
                    num2 = num2 %10;
                    num3 = n /100;
                    num3 = num3 %10;
                    num4 = n/1000;
                    num4 = num4 %10;
                    num5 = n/10000;
                    suma = num1 + num2 + num3 + num4 + num5;
                    break;
                default:
                    System.out.println("Por el momento solo puede ingresar un numero de hasta 5 digitos a partir del numero 1...");
                    break;
            }
            System.out.println("La suma de sus digitos sera de: "+suma);
        }
    }
}
