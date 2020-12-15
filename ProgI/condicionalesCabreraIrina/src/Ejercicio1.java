import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args){
        float cal1, cal2, cal3,promedio;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la calificacion n° 1: ");
        cal1 = sc.nextFloat();
        System.out.println("\nIngrese la calificacion n° 2: ");
        cal2 = sc.nextFloat();
        System.out.println("\nIngrese la calificacion n° 3: ");
        cal3 = sc.nextFloat();

        promedio = (cal1+cal2+cal3)/3;

        if(promedio >=60){
            System.out.println("\nAprobado con "+promedio);
        }
        else{
            System.out.println("\nDesaprobado con "+promedio);
        }
    }
}
