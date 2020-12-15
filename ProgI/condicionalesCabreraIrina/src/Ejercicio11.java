import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args){
        int altura;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la altura de la persona en centimetros: ");
        altura = sc.nextInt();

        if(altura <= 150){
            System.out.println("Persona de altura baja.");
        }
        else if(altura > 150 && altura <= 170){
            System.out.println("Persona de altura media.");
        }
        else{
            System.out.println("persona alta.");
        }

    }
}