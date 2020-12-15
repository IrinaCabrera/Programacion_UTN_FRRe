import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args){
        int sueldo, cont=0, cont1=0, condicion=1, importe=0;
        Scanner sc = new Scanner(System.in);

        while (condicion == 1){

            System.out.println("ingrese el sueldo: $");
            sueldo = sc.nextInt();
            if (sueldo >= 100 && sueldo <= 300){
                cont++;
            }
            else if(sueldo > 300){
                cont1++;
            }
            importe = importe + sueldo;
            System.out.println("Agregar mas empleados (1 para si ; otro numero para Salir.)");
            condicion = sc.nextInt();
        }
        System.out.println("Los empleados que cobran entre 100 y 300 son: "+cont+" Los empleados que cobran mas de 300 son: "+cont1);
        System.out.println("El importe que gasta la empresa es de: $"+importe);
    }
}
