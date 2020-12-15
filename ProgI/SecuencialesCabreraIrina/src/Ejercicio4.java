import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        int monto, horas, horasExtras, sueldoTotal;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el monto que le corresponda por hora: \n");
        monto = sc.nextInt();
        System.out.println("Ingrese la cantidad de horas trabajadas: \n");
        horas = sc.nextInt();
        System.out.println("Ingrese la cantidad de horas trabajadas extras: \n");
        horasExtras = sc.nextInt();

        sueldoTotal = (horas + horasExtras) * monto;
        System.out.println("El sueldo que le correspondera este mes es de: $"+sueldoTotal);

    }
}
