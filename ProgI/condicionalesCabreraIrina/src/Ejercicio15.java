import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args){
        int N1, N2;
        float  P1, P2, TOTAL;
        Scanner sc = new Scanner(System.in);

        /*Conejos blancos*/
        System.out.println("Ingrese la cantidad de conejos blancos vendidos: ");
        N1= sc.nextInt();
        System.out.println("Ingrese el precio por unidad de conejos blancos: ");
        P1= sc.nextFloat();

        /*Conejos negros*/
        System.out.println("Ingrese la cantidad de conejos negros vendidos: ");
        N2= sc.nextInt();
        System.out.println("Ingrese el precio por unidad de conejos negros: ");
        P2= sc.nextFloat();

       /*Venta de conejos*/
        if (N1 > N2){
            System.out.println("se vendieron mas conejos blancos con: "+N1);
        }
        else if(N2 > N1){
            System.out.println("se vendieron mas conejos negros con: "+N2);
        }
        else{
            System.out.println("se vendieron la misma cantidad de conejos.");
        }

        /*TOTAL*/
        TOTAL= P1 + P2;
        System.out.println("El total es de: $"+TOTAL);
    }
}