import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args){
        int num = 0;
        Scanner sc = new Scanner(System.in);

        while(num <= 100 && num >= 0){
            System.out.println("Ingresa un numero: ");
            num = sc.nextInt();
        }
    }
}
