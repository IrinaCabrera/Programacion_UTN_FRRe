import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args){
        int intento = 0;
        String clave = "";
        Scanner sc = new Scanner(System.in);

        while (intento < 3){
            System.out.println("Ingrese la clave");
            clave = sc.nextLine();
            if (clave.equals("111MIL")){
                System.out.println("Clave correcta, ACCESS GRANTED");

            }
            else{
                System.out.println("Clave incorrecta");
            }
            intento++;
        }
        System.out.println("No tiene mas intentos.");
    }
}
