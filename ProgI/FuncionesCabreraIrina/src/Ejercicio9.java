import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int f;
        float llamCel;
        System.out.println("Ingrese los grados fahrenheit: ");
        f= sc.nextInt();
        llamCel = cel(f);
        System.out.println(f+"°F es: "+llamCel+"°C");
    }
    public static float cel(int f){
        float c = (f-32)/1.8f;
        return c;
    }
}