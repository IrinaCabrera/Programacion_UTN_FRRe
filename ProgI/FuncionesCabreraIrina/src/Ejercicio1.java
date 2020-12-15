import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args){
        String nombre, llamadoSaludo;
        int num1, num2, llamadoMultiplicacion;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese el primer numero: ");
        num1=sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2=sc.nextInt();

        llamadoSaludo = saludo(nombre);
        llamadoMultiplicacion = multiplicacion(num1,num2);

        System.out.println(llamadoSaludo);
        System.out.println("La multiplicacion entre el primer y segundo numero es: "+llamadoMultiplicacion);
    }
    public static String saludo(String nombre){
        return "Mis saludos "+ nombre;
    }
    public static int multiplicacion(int num1, int num2){
        return num1 * num2;
    }
}
