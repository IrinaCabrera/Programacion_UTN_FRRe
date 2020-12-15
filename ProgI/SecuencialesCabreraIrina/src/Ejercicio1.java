import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        int km, precio;

        Scanner sc = new Scanner(System.in);
        System.out.println("Averigua el precio de tu viaje\n");
        System.out.println("Ingrese la cantidad de kilometros que recorrera: ");
        km = sc.nextInt();

        precio = km * 45;
        System.out.println("El precio sera: $"+precio);
    }
}
