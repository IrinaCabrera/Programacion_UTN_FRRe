import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args){
        float lado1, lado2, lado3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor del primer lado: ");
        lado1 = sc.nextFloat();
        System.out.println("Ingrese el valor del segundo lado: ");
        lado2 = sc.nextFloat();
        System.out.println("Ingrese el valor del tercer lado: ");
        lado3 = sc.nextFloat();

        if(lado1 == lado2 && lado1 == lado3){
            System.out.println("El triangulo es eqilatero.");
        }
        else if(lado1 == lado2 && lado1 != lado3 || lado2 == lado3 && lado2 != lado1 || lado3 == lado1 && lado3 != lado2){
            System.out.println("El triangulo es escaleno.");
        }
        else{
            System.out.println("El triangulo es isoceles.");
        }
    }
}