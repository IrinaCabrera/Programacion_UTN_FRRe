import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args){
        int n, n1, n2, seleccion,llamS;
        String llamRMD;
        Scanner sc = new Scanner(System.in);

        System.out.println("1 para operar dos numeros. 2 para ver la tabla de multiplicar de un numero.:");
        seleccion = sc.nextInt();

        switch (seleccion){
            case 1:

                System.out.println("ingrese el primer numero:");
                n1= sc.nextInt();
                System.out.println("ingrese el segundo numero:");
                n2= sc.nextInt();

                llamS = S(n1, n2);
                llamRMD = RMD(n1, n2);
                System.out.println("suma: "+llamS+llamRMD);

                break;
            case 2:

                System.out.println("ingrese el numero:");
                n = sc.nextInt();

                mul(n);

                break;
            default:
                System.out.println("El numero ingresado no es correcto.");
                break;
        }
    }
    public static int S(int n1, int n2){
        int suma = n1+n2;
        return suma;
    }
    public static String RMD(int n1, int n2){
        int resta = n1-n2;
        int mult = n1*n2;
        float div = n1/n2;

        return " resta: "+ resta+" multiplicacion: " +mult+ " division: " +div;
    }

    public static void mul(int n){
        for(int i = 1; i < 11; i++){
            int tabla = n*i;
            System.out.println(n+" x "+i+" = "+tabla);
        }
    }
}
