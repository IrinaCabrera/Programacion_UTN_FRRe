import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args){
        int n, cont=0, condicion = 1;
        Scanner sc = new Scanner(System.in);

        while(condicion == 1){
            System.out.println("ingrese un numero: ");
            n = sc.nextInt();
            for(int i = 1; i <= n; i++){
                if(n % i == 0){
                    cont++;
                }
            }
            if (cont <=2){
                System.out.println("El numero ingresado es primo");
            }
            else{
                System.out.println("El numero ingresado NO es primo");
            }
            System.out.println("Desea volver a ingresar otro numero? 1 para si, otro numero para salir");
            condicion = sc.nextInt();
        }
    }
}
