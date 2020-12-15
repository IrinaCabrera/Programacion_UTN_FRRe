import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float b, h, llamAREA;

        System.out.println("ingresa la base del triangulo:");
        b= sc.nextFloat();
        System.out.println("Ingresa la altura del triangulo:");
        h= sc.nextFloat();

        llamAREA=area(b,h);
        System.out.println("El area es: "+llamAREA+" centimetros cuadrados");

    }
    public static float area(float b, float h){
        float proceso= (b*h)/2;
        return proceso;
    }
}
