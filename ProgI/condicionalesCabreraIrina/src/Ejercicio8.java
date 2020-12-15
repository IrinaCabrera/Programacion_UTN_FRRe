import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args){
        float num1,num2,operacion;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        num1 = sc.nextFloat();
        System.out.println("Ingrese elsegundo numero: ");
        num2 = sc.nextFloat();

        if(num1 == num2){
            operacion = num1 * num2;
            System.out.println("La multiplicacion entre ambos numeros es de: "+operacion);
        }
        else if(num1 > num2){
            operacion = num1 - num2;
            System.out.println("La resta entre el primer y segundo numero ingresado es de: "+operacion);
        }
        else{
            operacion = num1 + num2;
            System.out.println("La suma entre ambos numeros ingresados es de: "+operacion);
        }
    }
}