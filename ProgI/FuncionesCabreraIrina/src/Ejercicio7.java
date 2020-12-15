import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x1,y1, x2,y2, x3,y3;

        System.out.println("Ingrese las coordenadas del Punto 1:\nx1:");
        x1=sc.nextInt();
        System.out.println("y1:");
        y1=sc.nextInt();

        System.out.println("Ingrese las coordenadas del Punto 2:\nx2:");
        x2=sc.nextInt();
        System.out.println("y2:");
        y2=sc.nextInt();

        System.out.println("Ingrese las coordenadas del Punto 1:\nx3:");
        x3=sc.nextInt();
        System.out.println("y1:");
        y3=sc.nextInt();

        Area(x1, y1, x2, y2, x3, y3);
    }
    public static void Area(int x1, int y1, int x2, int y2, int x3, int y3){
        float A =((x1)*(y2)+(x2)*(y3)+(x3)*(y1)) - ((x3)*(y2)+(x2)*(y1)+(x1)*(y3));
        A = A /2;
        System.out.println("el area es: "+ A+" unidades al cuadrado");
    }
}
