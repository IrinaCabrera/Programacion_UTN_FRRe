import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        float cm, pulgadas;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero en cm para convertirlos a pulgadas: \n");
        cm = sc.nextFloat();

        pulgadas = cm * 0.39737f;
        System.out.println(+cm+" cm sera "+pulgadas+" pulgadas");
    }
}
