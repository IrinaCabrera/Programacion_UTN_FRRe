import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args){
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese numeros enteros diferentes");

        System.out.println("Ingrese el primer numero: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = sc.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("El "+num1+" es el mayor numero entre los tres.");
        }
        else if(num2 > num1 && num2 > num3){
            System.out.println("El "+num2+" es el mayor numero entre los tres.");
        }
        else {
            System.out.println("El " + num3 + " es el mayor numero entre los tres.");
        }
    }
}