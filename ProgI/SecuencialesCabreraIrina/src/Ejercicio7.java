import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int femenino, masculino, total;
        float porsFem, porsMas;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la catidad de estudiantes femeninos: \n");
        femenino = sc.nextInt();
        System.out.println("Ingrese la catidad de estudiantes masculinos: \n");
        masculino = sc.nextInt();

        total = femenino + masculino;

        porsFem = (femenino*100)/total;
        System.out.println("El porsentaje de estudiantes femeninos es del : %"+porsFem+"\n");

        porsMas = (masculino*100)/total;
        System.out.println("El porsentaje de estudiantes masculinos es del : %"+porsMas);
    }
}
