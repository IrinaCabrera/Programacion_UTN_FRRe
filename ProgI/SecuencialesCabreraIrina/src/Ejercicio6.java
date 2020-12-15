import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        int num1, num2, num3, x;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese tres numeros, siendo el primero y els egundo distintos de cero: \n");
        System.out.println("Ingrese el primero: \n");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo: \n");
        num2 = sc.nextInt();
        System.out.println("Ingrese el tercero: \n");
        num3 = sc.nextInt();

        x =(num1*100)+(num2*10)+num3;
        System.out.println("El numero es: "+x);

    }
}
