import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args){
        int her1, her2,difEdades;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la edad de un hermano: ");
        her1 = sc.nextInt();
        System.out.println("Ingrese la edad del otro hermano: ");
        her2 = sc.nextInt();
        if(her1 > her2){
            difEdades=her1-her2;
            System.out.println("El hermano mayor es el que tiene: "+her1+" anios con "+difEdades+" anios de diferencia");
        }
        else if(her2 > her1){
            difEdades=her2-her1;
            System.out.println("El hermano mayor es el que tiene: "+her2+" anios con "+difEdades+" anios de diferencia");
        }
        else{
            System.out.println("Ambos hermanos tienen la misma edad");
        }
    }
}