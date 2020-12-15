import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        float km,preciobs;

        Scanner sc = new Scanner(System.in);

        System.out.println("Averigua el precio de tu viaje en Bolivares\n");
        System.out.println("Ingrese la cantidad de kilometros que recorrera: ");
        km = sc.nextFloat();

        preciobs = km * 10.50f;
        System.out.println("El precio sera: $"+preciobs);
    }
}
