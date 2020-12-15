import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        float num1, num2;
        double suma, promedio;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primero: \n");
        num1 = sc.nextFloat();
        System.out.println("Ingrese el segundo: \n");
        num2 = sc.nextFloat();

        /*La suma del doble del primero más el cuadrado del segundo.*/
        suma = (num1 * 2f)+ Math.pow(num2,2f);
        System.out.print("La suma del doble del primero más el cuadrado del segundo es: "+suma+"\n");

        /*El promedio de sus cubos.*/
        promedio = ((Math.pow(num1,3f)+Math.pow(num2,3f))/2);
        System.out.println("El promedio de sus cubos: "+promedio);
    }
}
