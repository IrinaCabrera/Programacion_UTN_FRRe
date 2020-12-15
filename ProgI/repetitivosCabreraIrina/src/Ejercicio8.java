import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args){
        int codigo = 1024, contraseña= 4567, intento = 1;
        Scanner sc = new Scanner(System.in);

            while (intento == 1){
                System.out.println("ingrese el codigo:");
                codigo = sc.nextInt();
                System.out.println("ingrese la contraseña: ");
                contraseña = sc.nextInt();

                if (codigo ==1024 && contraseña == 4567){
                    System.out.println("llego hasta aquí, la contraseña y el codigo son correctos");
                }
                else{
                    System.out.println("llego hasta aquí, la contraseña y el codigo son correctos");
                }

            System.out.println("Volver a intentarlo (1. Si ; otro numero para No)");
            intento = sc.nextInt();
        }


    }
}
