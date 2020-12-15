import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args){
        int s=1,v=1, cont=0, cont2=0;
        Scanner sc = new Scanner(System.in);

        while(s > 0 || v > 0){
            System.out.println("Ingrese el valor de S: ");
            s = sc.nextInt();
            System.out.println("Ingrese el valor de V: ");
            v = sc.nextInt();

            if(s > v){
                cont++;
            }
            if(s*s == v){
                cont2++;
            }
        }
        System.out.println("En "+cont+" pares S fue mayor a V");
        System.out.println("En "+cont2+" pares S fue el doble a V");
    }
}
